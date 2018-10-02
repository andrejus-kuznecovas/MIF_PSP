public class Inspector implements Inspectable {


  public int inspect(int brokenParts) {
    //System.out.println("Vehicle has "+brokenParts+" broken parts. It will cost "+brokenParts*1800+" to repair them");
    if (brokenParts < 10) {
      return brokenParts * 1800;
    } else {
      return brokenParts * 1200;
    }
  }
}
