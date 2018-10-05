public class Inspector implements Inspectable {


  public int inspect(int brokenParts) {
    if (brokenParts < 10) {
      return brokenParts * 1800;
    } else {
      return brokenParts * 1200;
    }
  }
}
