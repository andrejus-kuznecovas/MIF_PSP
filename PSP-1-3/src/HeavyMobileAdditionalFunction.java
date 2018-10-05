public class HeavyMobileAdditionalFunction extends RailMobile implements Repairable {

  private Repairer repairer;

  public HeavyMobileAdditionalFunction() {
    repairer = new Repairer();
  }

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
