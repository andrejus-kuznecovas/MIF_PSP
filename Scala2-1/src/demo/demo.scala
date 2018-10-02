package demo

object demo {
  def main(args:Array[String]): Unit ={
    println("Hello")
    val fruitsFarmMinistryController = new FruitsFarmController with HarvestPrice
    fruitsFarmMinistryController.calculateTodayPrice(123.2)
  }
}

abstract class Farmer {

  def doFullFarmCycle(): Unit ={
    getHarvest()
    getPlantCount()
    waterPlants()
    plantSeeds()
  }
  def getHarvest()
  def getPlantCount()
  def waterPlants()
  def plantSeeds()
}

abstract class FarmingMinistry{
  def simulateFullFarmCycle(): Unit ={
    getHarvest()
    getPlantCount()
    waterPlants()
    plantSeeds()
  }
  def getHarvest()
  def getPlantCount()
  def waterPlants()
  def plantSeeds()
}

trait HarvestPrice{
  def calculateTodayPrice(kilos: Double ): Unit ={
    return kilos * 10;
  }

  def calculateOlderPrice(kilos: Double): Unit ={
    return kilos * 4;
  }
}


class FruitsFarmController extends Farmer  {
  val plantsCount : Int = 5
  val seedPrct : Double = 0.4
  val plantSize : Double = 1.6

  override def getHarvest(): Unit = {

  }

  override def getPlantCount(): Unit = {

  }

  override def plantSeeds(): Unit = {

  }

  override def waterPlants(): Unit = {

  }
}

class VegetablesFarmController extends Farmer  {
  override def getHarvest(): Unit = {

  }

  override def getPlantCount(): Unit = {

  }

  override def plantSeeds(): Unit = {

  }

  override def waterPlants(): Unit = {

  }
}

class FruitsFarmMinistryController extends FarmingMinistry  {
  override def getHarvest(): Unit = {

  }

  override def getPlantCount(): Unit = {

  }

  override def plantSeeds(): Unit = {

  }

  override def waterPlants(): Unit = {

  }
}

class VegetablesFarmMinistryController extends FarmingMinistry {
  override def getHarvest(): Unit = {

  }

  override def getPlantCount(): Unit = {

  }

  override def plantSeeds(): Unit = {

  }

  override def waterPlants(): Unit = {

  }
}