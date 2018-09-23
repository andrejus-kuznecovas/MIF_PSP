package template;

import java.math.BigDecimal;

public class UpkeepCostCalculator {

	private final static BigDecimal OFFICE_UPKEEP_COST = new BigDecimal("5000");
	private final static BigDecimal HOUSE_UPKEEP_COST = new BigDecimal("800");
	
	public BigDecimal calculateOfficeUpkeepCost(int buildingCount){
		return  (BigDecimal.valueOf(buildingCount)).multiply(OFFICE_UPKEEP_COST);
	}
	
	public BigDecimal calculateHouseUpkeepCost(int buildingCount){
		return  (BigDecimal.valueOf(buildingCount)).multiply(HOUSE_UPKEEP_COST);
	}
}
