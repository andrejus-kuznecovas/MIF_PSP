package strategy;

public class ConstructionZoneBoard {

  ConstructionZone constructionZone;

  public void setConstructionZone(ConstructionZone constructionZone) {
    this.constructionZone = constructionZone;
  }

  public void performBuildingSequence(int projectCount) {
	  constructionZone.considerProjects(projectCount);
	  int buildingsDemolished = constructionZone.demolish();
	  System.out.println("Buildings demolished: "+ buildingsDemolished+". Buildings left: "+ constructionZone.getBuildingCount());
	  int constructionInProgressCount = constructionZone.build();
	  System.out.println("After construction there are "+ constructionZone.getBuildingCount()+" buildings and "+constructionInProgressCount+" constructions in progress");
  }

}
