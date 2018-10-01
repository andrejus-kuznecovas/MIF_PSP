package third

object main5 {
  def main(args: Array[String]): Unit = {
    println("Hello, world! main2")
    def sh = new CityConstructionZoneShareholder(120)
  }
}

abstract class ConstructionZoneBoard {
  def performBuildingCycle() = println("perform")
  def demolish()
  def considerProject(buildingCount: Int)
  def build()
}

abstract class ConstructionZoneShareholder {
  def payForProjects() = println("pay")
  def demolish()
  def considerProject(buildingCount: Int)
  def build()
}

trait ConstructionZoneEvents {
  def demolish() = println("algoritmas")
  def considerProject(buildingCount: Int) = println("algoritmas")
  def build() = println("algoritmas")
}

trait UpkeepPriceCalculations {
  def calculateUpkeepPrice() = println(2+2)
}

class CityConstructionZone extends ConstructionZoneBoard with ConstructionZoneEvents with UpkeepPriceCalculations {
  val chance = 0.2
  val projectCount = 12
  val price = 4555500
}

class ProvinceConstructionZone extends ConstructionZoneBoard with ConstructionZoneEvents with UpkeepPriceCalculations {
  val chance = 0.8
  val projectCount = 15
  val price = 1200
}

class CityConstructionZoneShareholder(buildingCount:Int) extends ConstructionZoneShareholder with ConstructionZoneEvents with UpkeepPriceCalculations {
  val chance = 0.2
  val projectCount = 12
  val price = 4555500
}

class ProvinceConstructionShareHolder extends ConstructionZoneShareholder with ConstructionZoneEvents with UpkeepPriceCalculations {
  val chance = 0.8
  val projectCount = 15
  val price = 1200
}
