import java.util.Scanner;

import strategy.CityConstructionZone;
import template.CityConstructionZoneBoard;

public class Main {

  private static Scanner in;

  public static void main(String[] args) {
    start();
  }

  private static void start() {
    System.out.println("1.template Method \n2.strategy Method");
    in = new Scanner(System.in);
    while (true) {
      int num = in.nextInt();
      switch (num) {
        case 1:
          performTemplate();
          break;
        case 2:
          performStrategy();
          break;
        default:
          break;
      }
    }
  }

  private static void performTemplate() {
    template.ConstructionZoneBoard constructionZoneBoard = new CityConstructionZoneBoard(100);
    doBuildingSequenceTemplate(5, constructionZoneBoard);
  }

  private static void performStrategy() {
    strategy.ConstructionZoneBoard constructionZoneBoard = new strategy.ConstructionZoneBoard();
    constructionZoneBoard.setConstructionZone(new CityConstructionZone(100));
    doBuildingSequenceStrategy(5, constructionZoneBoard);
  }

  private static void doBuildingSequenceTemplate(int numberOfSeqeuences, template.ConstructionZoneBoard constructionZone) {
    for (int i = 0; i < numberOfSeqeuences; i++) {
      constructionZone.performBuildingSequence(16);
      System.out.println("--------   --------   --------   --------");
    }
  }

  private static void doBuildingSequenceStrategy(int numberOfSeqeuences, strategy.ConstructionZoneBoard constructionZone) {
    for (int i = 0; i < numberOfSeqeuences; i++) {
      constructionZone.performBuildingSequence(45);
      System.out.println("--------   --------   --------   --------");
    }
  }

}
