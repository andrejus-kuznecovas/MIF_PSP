package Template;

import java.util.concurrent.ThreadLocalRandom;

public class CityConstructionZoneBoard extends ConstructionZoneBoard {

	private int demolishionLimit = 10;
	//private int projectCount = 70;
	private double projectAcceptancePercentange = ThreadLocalRandom.current().nextDouble(0.1, 0.5);
	private double constructionSuccessRate= 0.5;
	private int acceptedProjects = 0;
	private int constructionInProgressCount = 0;
	
  public CityConstructionZoneBoard(int buildingCount) {
    super(buildingCount);
  }


  @Override
  protected void considerProjects(int projectCount) {
	  projectAcceptancePercentange = ThreadLocalRandom.current().nextDouble(0.1, 0.5);
	  acceptedProjects =(int)(projectCount*projectAcceptancePercentange);
  	
  }
  
  protected int demolish() {
    int buildingsDemolished = Math.min(acceptedProjects, demolishionLimit);
    buildingCount -= buildingsDemolished;
    return buildingsDemolished;
  }


  @Override
  protected int build() {
	int successfulConstructions = (int)(constructionInProgressCount*constructionSuccessRate);
	buildingCount += successfulConstructions;
    constructionInProgressCount = acceptedProjects;
    return constructionInProgressCount;
    
    
  }


}
