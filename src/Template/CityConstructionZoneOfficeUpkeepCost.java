package template;

import java.math.BigDecimal;

public class CityConstructionZoneOfficeUpkeepCost extends CityConstructionZoneBoard {

  public CityConstructionZoneOfficeUpkeepCost(int buildingCount) {
    super(buildingCount);
  }

  private final UpkeepCostCalculator COST = new UpkeepCostCalculator();

  @Override
  protected BigDecimal calculateUpkeepCost(int buildingCount) {
    return COST.calculateOfficeUpkeepCost(buildingCount);
  }

}
