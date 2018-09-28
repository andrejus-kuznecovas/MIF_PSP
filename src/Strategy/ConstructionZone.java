package strategy;

public interface ConstructionZone {

  int demolish();

  void considerProjects(int projectCount);

  int getBuildingCount();

  int build();

}
