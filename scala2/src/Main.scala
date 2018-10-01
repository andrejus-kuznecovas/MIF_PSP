object Main {
  def main(args: Array[String]): Unit = {
    println("Hello, world!")
  }
}



trait ConstructionZoneBoardMixin {
  def performConstruction();

}
class CityConstructionZoneBoard(buildingCount: Int) extends ConstructionZoneBoardMixin with ConstructionZoneShareHolderMixin{
  override def performConstruction(): Unit = ???
}
class ProvinceConstructionZone() extends ConstructionZoneBoardMixin with ConstructionZoneShareHolderMixin {
  override def performConstruction(): Unit = ???
}
trait ConstructionZoneShareHolderMixin {}