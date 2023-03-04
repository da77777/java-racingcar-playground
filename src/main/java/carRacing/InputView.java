package carRacing;

import java.util.Scanner;

public class InputView {

  private final static InputView instance = new InputView();
  private final Scanner sc = new Scanner(System.in);

  private InputView() {}

  public static InputView getInstance() {
    return instance;
  }

  public String inputAnswer() {
    return sc.nextLine();
  }

  public void scannerClose() {
    sc.close();
  }

  public String[] inputCarNames() {
    System.out.println("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,)를 기준으로 구분).");
    String[] names;
    while(true) {
      names = inputAnswer().split(",");
      if(validCarName(names)) {
        break;
      }
    }
    return names;
  }

  public int inputRaceCount() {
    System.out.println("시도할 회수는 몇회인가요?");
    while(true) {
      int raceCount = validRaceCount(inputAnswer());
      if(raceCount > -1) {
        return raceCount;
      }
    }
  }

  public boolean validCarName(String[] names) {
    for (String name : names) {
      if(name.length() < 1 || name.length() > 5) {
        System.out.println("차 이름은 5자 이하로 입력 바랍니다.");
        return false;
      }
    }
    return true;
  }

  public int validRaceCount(String raceCount) {
    try {
      int count = Integer.parseInt(raceCount);
      if(count < 0) {
        throw new RuntimeException();
      }
      return count;

    } catch (RuntimeException e) {
      System.out.println("0 이상의 숫자만 입력하세요.");
      return -1;
    }
  }

}
