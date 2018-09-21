package Template;

public abstract class ConstructionZoneGovernment {

  protected int buildingCount;

  public ConstructionZoneGovernment(int buildingCount) {
    this.buildingCount = buildingCount;
  }

  public void performBuildingSequence(int buildingCount) {
  }

  protected abstract double demolish();

  protected abstract void considerProject(int buildingCount);

  protected abstract int build();

}
