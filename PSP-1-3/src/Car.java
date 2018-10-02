public class Car implements Inspectable, Repairable, Paintable {

  private Painter painter = new Painter();
  private Repairer repairer = new Repairer();
  private Inspector inspector = new Inspector();
  private int numberOfSeats = 4;
  private int passergers = 0;


  public void addPassengers(int people) {
    passergers += people;
  }

  public int inspect(int brokenParts) {
    return inspector.inspect(brokenParts);
  }

  @Override
  public int paint(int color) {
    return painter.paint(color);
  }

  @Override
  public int repair(int brokenParts) {
    return repairer.repair(brokenParts);
  }
}
