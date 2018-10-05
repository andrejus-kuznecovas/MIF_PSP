public class Main {

  public static void main(String[] args) {
    Car a = new Car();
    System.out.println("Cost to fix is : "+ a.inspect(3));
    System.out.println("Broken parts after reparation: "+a.repair(3));
    a.paint(3);
  }
}
