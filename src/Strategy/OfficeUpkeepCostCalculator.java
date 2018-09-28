package strategy;

import java.math.BigDecimal;

public class OfficeUpkeepCostCalculator implements ConstructionUpkeepCostCalculator {

  private final static BigDecimal UPKEEP_COST = new BigDecimal("800");

  @Override
  public BigDecimal calculateUpkeepCost(int buildingCount) {
    return (BigDecimal.valueOf(buildingCount)).multiply(UPKEEP_COST);
  }
}
