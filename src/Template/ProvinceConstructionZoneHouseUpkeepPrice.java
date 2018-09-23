package template;

import java.math.BigDecimal;

public class ProvinceConstructionZoneHouseUpkeepPrice extends ProvinceConstructionZoneBoard {

	public ProvinceConstructionZoneHouseUpkeepPrice(int buildingCount) {
		super(buildingCount);
	}

	private final UpkeepCostCalculator COST = new UpkeepCostCalculator();

	@Override
	protected BigDecimal calculateUpkeepCost(int buildingCount) {
		return COST.calculateHouseUpkeepCost(buildingCount);
	}

}
