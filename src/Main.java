import java.util.Scanner;

import strategy.CityConstructionZone;
import strategy.OfficeUpkeepCostCalculator;
import template.CityConstructionZoneBoard;
import template.CityConstructionZoneOfficeUpkeepCost;
import template.CityConstructionZoneShareholder;
import template.ConstructionZoneShareholder;
import template.ProvinceConstructionZoneBoard;

public class Main {

	private static Scanner in;

	public static void main(String[] args) {
		start();
	}

	private static void start() {
		System.out.println("1.Template Method \n2.Strategy Method");
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
		template.ConstructionZoneBoard constructionZoneBoard = new CityConstructionZoneOfficeUpkeepCost(100);
		doBuildingSequenceTemplate(5, constructionZoneBoard);
		//ConstructionZoneShareholder constructionZoneShareholder = new CityConstructionZoneShareholder(100);
		//constructionZoneShareholder.payForProjects(100, 8000, 5);
		
	}

	private static void performStrategy() {
		strategy.ConstructionZoneBoard constructionZoneBoard = new
		strategy.ConstructionZoneBoard();
		constructionZoneBoard.setConstructionZone(new
		CityConstructionZone(100));
		constructionZoneBoard.setConstructionUpkeepPriceCalculator(new OfficeUpkeepCostCalculator());
		doBuildingSequenceStrategy(5, constructionZoneBoard);
		//strategy.ConstructionZoneShareholder constructionShareholder = new strategy.ConstructionZoneShareholder();
		//constructionShareholder.setConstructionZone(new CityConstructionZone(100));
		//constructionShareholder.payForProjects(100, 8000, 5);
	}

	private static void doBuildingSequenceTemplate(int numberOfSeqeuences,
			template.ConstructionZoneBoard constructionZone) {
		for (int i = 0; i < numberOfSeqeuences; i++) {
			constructionZone.performBuildingSequence(16);
			System.out.println("--------   --------   --------   --------");
		}
	}

	private static void doBuildingSequenceStrategy(int numberOfSeqeuences,
			strategy.ConstructionZoneBoard constructionZone) {
		for (int i = 0; i < numberOfSeqeuences; i++) {
			constructionZone.performBuildingSequence(45);
			System.out.println("--------   --------   --------   --------");
		}
	}

}
