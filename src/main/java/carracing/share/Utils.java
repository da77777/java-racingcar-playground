package carracing.share;

import java.util.Random;

public class Utils {

  public static int randomNumber(int range) {
    return new Random().nextInt(range);
  }

}
