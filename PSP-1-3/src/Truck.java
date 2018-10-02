public class Truck implements Repairable {

  Repairer repairer = new Repairer();

  public float weight;

  public void loadUp() {
    this.weight += 1000;
  }

  public void loadDown() {
    if (this.weight > 1000) {
      this.weight -= 1000;
    }

  }

  public int repair(int brokenParts) {
    return repairer.repair(brokenParts);
  }
}
