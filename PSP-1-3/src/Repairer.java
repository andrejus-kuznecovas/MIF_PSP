public class Repairer implements Repairable {

  public int repair(int brokenParts) {
    if (brokenParts > 5) {
      return brokenParts - 3;
    } else {
      return brokenParts - 5;
    }

  }
}
