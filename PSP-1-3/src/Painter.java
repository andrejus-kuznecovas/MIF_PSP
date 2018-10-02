public class Painter implements Paintable {


  @Override
  public int paint(int color) {
    System.out.println("Color has been changed");
    switch(color){
      case 1:{
        System.out.println("Dark color has been changed to blue");
        return color +5;
      }
      case 2:{
        System.out.println("White color has been changed to green");
        return color +7;
      }
      default: {
        System.out.println("Repainted the same color, but better");
        return color+10;
      }
    }
  }
}
