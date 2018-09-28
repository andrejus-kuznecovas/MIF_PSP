package Strategy;

import java.util.concurrent.ThreadLocalRandom;

public class ProvinceConstructionZone implements ConstructionZone {

  private int demolishionLimit = 25;
  //private int projectCount = 70;
  private double projectAcceptancePercentange = ThreadLocalRandom.current().nextDouble(0.6, 0.9);
  private double constructionSuccessRate = 0.8;
  private int acceptedProjects = 0;
  private int constructionInProgressCount = 0;
  private int buildingCount;

  public ProvinceConstructionZone(int buildingCount) {
    this.buildingCount = buildingCount;
  }

  @Override
  public void considerProjects(int projectCount) {
    projectAcceptancePercentange = ThreadLocalRandom.current().nextDouble(0.1, 0.5);
    acceptedProjects = (int) (projectCount * projectAcceptancePercentange);

  }

  public int demolish() {
    int buildingsDemolished = Math.min(acceptedProjects, demolishionLimit);
    buildingCount -= buildingsDemolished;
    return buildingsDemolished;
  }


  @Override
  public int build() {
    int successfulConstructions = (int) (constructionInProgressCount * constructionSuccessRate);
    buildingCount += successfulConstructions;
    constructionInProgressCount = acceptedProjects;
    return constructionInProgressCount;


  }

  @Override
  public int getBuildingCount() {
    return buildingCount;
  }
}
