package strategy;

public class ConstructionZoneShareholder {

  ConstructionZone constructionZone;

  public void setConstructionZone(ConstructionZone constructionZone) {
    this.constructionZone = constructionZone;
  }

  public final void payForProjects(int projectCount, int averageCost, int cycles) {
    for (int i = 0; i < cycles; i++) {
      constructionZone.considerProjects(projectCount);
      int buildingsDemolished = constructionZone.demolish();
      System.out.println(buildingsDemolished + " buildings were destroyed and Shareholder has to pay " + buildingsDemolished * averageCost);
      int buildingsBeforeConstruction = constructionZone.getBuildingCount();
      System.out.println("Buildings before construction:" + buildingsBeforeConstruction);
      int constructionInProgressCount = constructionZone.build();
      int newBuildingsAfterConstruction = constructionZone.getBuildingCount() - buildingsBeforeConstruction;
      System.out.println(
          "New buildings: " + newBuildingsAfterConstruction + ". In progress: " + constructionInProgressCount
              + ". Shareholder profit: " + newBuildingsAfterConstruction * averageCost);
      System.out.println("--------   --------   --------   --------");
    }
  }

  ;

}
