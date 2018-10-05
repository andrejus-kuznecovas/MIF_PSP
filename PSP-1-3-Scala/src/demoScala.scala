
object demoScala {
  def main(args: Array[String]): Unit = {
    val car = new AutomobileManyFunctions
    val truck = new HeavyMobileAdditionalFunction
    car.addPassengers()
    car.inspect(12)
    car.paint(112)
    truck.repair(45)

    val automobile = new Automobile with Inspector{
      override val brokenParts: Int = 45}

  }

  class Automobile {
    def ride(): Unit = {
      println("Car is riding")
    }

  }

  class HeavyMobile {
    def load(): Unit = {
      println("Got loaded")
    }

  }

  class RailMobile {
    def travel(): Unit = {
      println("Journey completed")
    }

  }

  class AutomobileManyFunctions extends Automobile with Inspector with Repairer with Painter {
    val brokenParts: Int = 0
    val color: Int = 0
    val numberOfSeats: Int = 4
    val passengers: Int = 2

    def addPassengers(): Int = {
      return (passengers + 1)
    }
  }

  class RailMobileSomeFunctions extends RailMobile with Inspector with Repairer {
    val brokenParts: Int = 2
    val color: Int = 0
    val locationX: Int = 500
    val locationY: Int = 1200

    def transport(): Unit = {
      println("Truck's location is" + (locationX * locationY / 2))
    }
  }

  class HeavyMobileAdditionalFunction extends HeavyMobile with Repairer {
    val brokenParts: Int = 2
    val color: Int = 0
  }

  trait Inspector {
    val brokenParts: Int

    def inspect(brokenParts: Int): Int = {
      return brokenParts * 1800
    }
  }

  trait Repairer {
    val brokenParts: Int

    def repair(brokenParts: Int): Int = {
      return brokenParts - 1
    }

  }

  trait Painter {
    val color: Int

    def paint(color: Int): Int = {
      return color + 5
    }

  }


}