package Template;

public class ProvinceGovernment extends ConstructionZoneGovernment {

  public ProvinceGovernment(int buildingCount) {
    super(buildingCount);
  }

  @Override
  protected double demolish() {
    return 0;
  }

  @Override
  protected void considerProject(int buildingCount) {

  }

  @Override
  protected int build() {
    return 0;
  }
}
