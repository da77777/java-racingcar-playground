package carracing.view;

import carracing.share.Valid;
import java.util.Scanner;

public class InputView {

  private final static InputView instance = new InputView();
  private final Scanner sc = new Scanner(System.in);

  private InputView() {}

  public static InputView getInstance() {
    return instance;
  }

  private String inputAnswer() {
    return sc.nextLine();
  }

  public void scannerClose() {
    sc.close();
  }

  public int inputRaceCount() {
    System.out.println("시도할 회수는 몇회인가요?");
    while(true) {
      try {
        return Valid.validRaceCount(inputAnswer());
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
  }

  public String[] inputCarNames() {
    System.out.println("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,)를 기준으로 구분).");
    while(true) {
      try{
        return Valid.validCarNames(inputAnswer().split(","));
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
  }

}
