import Strategy.CityConstructionZone;
import Template.CityGovernment;

public class Main {

  public static void main(String[] args) {
    performTemplate();

    performStrategy();
  }

  private static void performTemplate() {
    Template.ConstructionZoneGovernment constructionZoneGovernment = new CityGovernment(100);
    doBuildingSequence(5, constructionZoneGovernment);
  }

  private static void performStrategy() {
    Strategy.ConstructionZoneGovernment constructionZoneGovernment = new Strategy.ConstructionZoneGovernment();
    constructionZoneGovernment.setConstructionZone(new CityConstructionZone(100));
    doBuildingSequence(5, constructionZoneGovernment);
  }

  private static void doBuildingSequence(int numberOfSeqeuences, Template.ConstructionZoneGovernment constructionZone) {
    for (int i = 0; i < numberOfSeqeuences; i++) {
      constructionZone.performBuildingSequence(15);
      System.out.println("--------");
    }
  }

  private static void doBuildingSequence(int numberOfSeqeuences, Strategy.ConstructionZoneGovernment constructionZone) {
    for (int i = 0; i < numberOfSeqeuences; i++) {
      constructionZone.performBuildingSequence(45);
          System.out.println("--------");
    }
  }

}
