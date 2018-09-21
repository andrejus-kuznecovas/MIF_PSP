import java.util.Scanner;

import Strategy.CityConstructionZone;
import Template.CityConstructionZoneBoard;
import Template.ProvinceConstructionZoneBoard;

public class Main {

  private static Scanner in;

public static void main(String[] args) {
   start();
  }
  private static void start(){
	  System.out.println("1.Template Method \n2.Strategy Method");
	  in = new Scanner(System.in);
	  while(true){
		  int num = in.nextInt();
	  switch(num){
	   case 1:
	   performTemplate();
	   break;
	   case 2:
	    performStrategy();
	   break;
	   default : 
		   break;
	   }
	  }
  }

  private static void performTemplate() {
    Template.ConstructionZoneBoard constructionZoneBoard = new CityConstructionZoneBoard(100);
    doBuildingSequenceTemplate(5, constructionZoneBoard);
  }

  private static void performStrategy() {
    Strategy.ConstructionZoneBoard constructionZoneBoard = new Strategy.ConstructionZoneBoard();
    constructionZoneBoard.setConstructionZone(new CityConstructionZone(100));
    doBuildingSequenceStrategy(5, constructionZoneBoard);
  }

  private static void doBuildingSequenceTemplate(int numberOfSeqeuences, Template.ConstructionZoneBoard constructionZone) {
    for (int i = 0; i < numberOfSeqeuences; i++) {
      constructionZone.performBuildingSequence(16);
      System.out.println("--------   --------   --------   --------");
    }
  }

  private static void doBuildingSequenceStrategy(int numberOfSeqeuences, Strategy.ConstructionZoneBoard constructionZone) {
    for (int i = 0; i < numberOfSeqeuences; i++) {
      constructionZone.performBuildingSequence(45);
      System.out.println("--------   --------   --------   --------");
    }
  }

}
