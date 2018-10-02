package five
//traitai extendina abstract klases

object five {
  def main(args: Array[String]): Unit = {
    def zone = new CityConstructionZoneBoard 
    zone.performBuildingCycle(154)
    zone.calculateOfficeUpkeepPrice();

  }

  abstract class ConstructionZoneBoard {
    def performBuildingCycle(projectCount: Int) = {
      println("Buildings Demolished: " + demolish())
      println("Considering projects: " + projectCount)
      println("Accepted Projects: " + considerProject(projectCount))
      println("After construction there are: " + build() + " buildings")
    }

    def demolish(): Int

    def considerProject(buildingCount: Int): Double

    def build(): Int

    def calculateOfficeUpkeepPrice(): Double

    def calculateHouseUpkeepPrice(): Double
  }

  abstract class ConstructionZoneShareholder {
    def payForProjects(projectCount: Int) = {
      println("Paying for demolishion: " + demolish() * 1300)
      println("Paying for projects: " + projectCount * 800)
      println("Profit: " + considerProject(projectCount) * 800)
      println("Buildings will sell for: " + build() * 4500)
    }

    def demolish(): Int

    def considerProject(buildingCount: Int): Double

    def build(): Int

    def calculateOfficeUpkeepPrice(): Double

    def calculateHouseUpkeepPrice(): Double
  }

  trait ConstructionZoneEvents extends ConstructionZoneBoard{
    val chance: Double
    val buildingCount: Int
    val price: Int
    val projectCount: Int

    def demolish(): Int = {
      return buildingCount - 10;
    }

    def considerProject(projectCount: Int): Double = {
      return (projectCount * chance)
    }

    def build(): Int = {
      return (buildingCount + ((projectCount * chance).toInt) - 10);
    }
  }
  trait ConstructionZoneShareholderEvents extends ConstructionZoneShareholder{
    val chance: Double
    val buildingCount: Int
    val price: Int
    val projectCount: Int

    def demolish(): Int = {
      return buildingCount - 10;
    }

    def considerProject(projectCount: Int): Double = {
      return (projectCount * chance)
    }

    def build(): Int = {
      return (buildingCount + ((projectCount * chance).toInt) - 10);
    }
  }

  trait UpkeepPriceCalculations {
    val price: Int
    val buildingCount: Int

    def calculateOfficeUpkeepPrice(): Double = {
      return (price * buildingCount) / 2;
    }

    def calculateHouseUpkeepPrice(): Double = {
      return (price * buildingCount);
    }
  }

  class CityConstructionZoneBoard extends ConstructionZoneEvents with UpkeepPriceCalculations {
    val chance = 0.2
    val projectLimit = 10
    val price = 4555500
    val projectCount = 12
    val buildingCount = 45
  }

  class ProvinceConstructionZoneBoard extends ConstructionZoneEvents with UpkeepPriceCalculations {
    val chance = 0.8
    val projectLimit = 45
    val projectCount = 1
    val price = 12000
    val buildingCount = 58
  }

  class CityConstructionZoneShareholder extends ConstructionZoneShareholderEvents with UpkeepPriceCalculations {
    val chance = 0.6
    val projectLimit = 14
    val price = 98745
    val projectCount = 60
    val buildingCount = 78
  }

  class ProvinceConstructionZoneShareholder extends ConstructionZoneShareholderEvents with UpkeepPriceCalculations {
    val chance = 0.9
    val projectLimit = 54
    val projectCount = 9
    val price = 457
    val buildingCount = 78
  }

}