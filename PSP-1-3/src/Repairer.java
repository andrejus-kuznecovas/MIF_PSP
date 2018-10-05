public class Repairer implements Repairable {

  public int repair(int brokenParts) {
    if (brokenParts > 0) {
      if (brokenParts > 5) {
        return brokenParts - 3;
      } else {
        return brokenParts-1;
      }

    } else {
      return 0;
    }
  }
}
