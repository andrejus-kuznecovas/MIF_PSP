object Main {
  def main(args: Array[String]): Unit = {
    println("Hello, world! main2")

    def sh = new CityConstructionZone with ConstructionZoneEvents with UpkeepPriceCalculations
  }
}

abstract class ConstructionZoneBoard {
  def performBuildingCycle() = println()
}
/*trait ConstructionZoneBoardTrait{
  def performBuildingCycle() = println()
}*/

abstract class ConstructionZoneShareholder {
  def payForProjects() = println()
}

trait ConstructionZoneEvents {
  def demolish() = println()

  def considerProject(buildingCount: Int) = println()

  def build() = println()
}

trait ProvinceZoneEvents {
  def demolish() = println()

  def considerProject(buildingCount: Int) = println()

  def build() = println()
}

trait UpkeepPriceCalculations {
  def calculateUpkeepPrice() = println()
}

class CityConstructionZone extends ConstructionZoneBoard {
  val chance = 0.2
  val projectCount = 12
  val price = 4555500
}

class ProvinceConstructionZone extends ConstructionZoneBoard {
  val chance = 0.8
  val projectCount = 15
  val price = 1200
}

class CityConstructionZoneShareholder extends ConstructionZoneShareholder {
  val chance = 0.2
  val projectCount = 12
  val price = 4555500
}

class ProvinceConstructionShareHolder extends ConstructionZoneShareholder {
  val chance = 0.8
  val projectCount = 15
  val price = 1200
}
