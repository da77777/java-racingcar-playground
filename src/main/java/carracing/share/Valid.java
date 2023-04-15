package carracing.share;

public class Valid {

  public static String[] validCarNames(String[] names) {
    for (int i = 0; i < names.length; i++) {
      validCarName(names[i]);
    }
    return names;
  }

  public static void validCarName(String name) {
    if(name.length() == 0 || name.length() > 5) {
      throw new IllegalArgumentException(MessageEnum.CAR_NAME_LENGTH.getMessage());
    }
  }

  public static int validRaceCount(String count) {
    try {
      int countNum = Integer.parseInt(count);
      if(countNum < 0) {
        throw new IllegalArgumentException(MessageEnum.NOT_POSITIVE_NUMBER.getMessage());
      }
      return countNum;
    } catch (NumberFormatException e) {
      throw new NumberFormatException(MessageEnum.NOT_NUMBER.getMessage());
    }
  }

}
