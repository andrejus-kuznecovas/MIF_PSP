package scala_demo

package second

object scala_demo {
  def main(args: Array[String]): Unit = {
    def share = new CityConstructionZone

  }

  abstract class ConstructionZoneBoard(val buildingCount : Int) {
    def performBuildingCycle(projectCount: Int) = {
      println("Buildings Demolished: " + demolish())
      println("Considering projects :" + projectCount)
      println("Accepted Projects :" + considerProject(projectCount))
      println("After construction there are " + build() + " buildings")
    }

    def demolish(): Int

    def considerProject(buildingCount: Int): Double

    def build(): Int
  }

  abstract class ConstructionZoneShareholder {
    def payForProjects(projectCount: Int) = {
      println("Paying for demolishion " + demolish()*1300)
      println("Paying for projects :" + projectCount*800)
      println("Profit :" + considerProject(projectCount) * 800)
      println("Buildings will sell for " + build()*4500)
    }

    def demolish(): Int

    def considerProject(buildingCount: Int): Double

    def build(): Int
  }

  trait ConstructionZoneEvents{
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

    def calculateOfficeUpkeepPrice(): Int = {
      return (price * buildingCount) / 2;
    }

    def calculateHouseUpkeepPrice(): Int = {
      return (price * buildingCount);
    }
  }

  class CityConstructionZone {
    val chance = 0.2
    val projectLimit = 10
    val price = 4555500
    val projectCount = 12
    val buildingCount = 45
  }

  class ProvinceConstructionZone{
    val chance = 0.8
    val projectLimit = 45
    val projectCount = 1
    val price = 12000
    val buildingCount = 58
  }


}