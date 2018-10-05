public class AutomobileManyFunctions extends Automobile implements Inspectable, Repairable, Paintable {

  protected Painter painter;
  protected Repairer repairer;
  protected Inspector inspector;
  private int numberOfSeats = 4;
  private int passergers = 0;


  public AutomobileManyFunctions(){
    painter = new Painter();
    repairer = new Repairer();
    inspector = new Inspector();
  }
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
