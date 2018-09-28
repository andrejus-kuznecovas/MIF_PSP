package strategy;

import java.math.BigDecimal;

public interface ConstructionUpkeepCostCalculator {

  BigDecimal calculateUpkeepCost(int buildingCount);

}
