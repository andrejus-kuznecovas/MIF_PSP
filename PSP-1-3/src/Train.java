public class Train implements Inspectable, Repairable {

  Inspector inspector = new Inspector();
  Repairer repairer = new Repairer();

  private int locationX = 500;
  private int locationY = 250;

  public void transport(){
    this.locationX +=500;
    this.locationY +=200;
  }
  public int inspect(int brokenParts) {
    return inspector.inspect(brokenParts);
  }

  public int repair(int brokenParts) {
    return repairer.repair(brokenParts);
  }
}
