package Strategy;

public class ProvinceConstructionZone implements ConstructionZone {

  private int buildingCount;

  public ProvinceConstructionZone(int buildingCount) {
    this.buildingCount = buildingCount;
  }

  @Override
  public double demolish() {
    return 0;
  }

  @Override
  public void considerProject(int BuildingCount) {

  }

  @Override
  public int getBuildingCount() {
    return 0;
  }

  @Override
  public int build() {
    return 0;
  }
}
