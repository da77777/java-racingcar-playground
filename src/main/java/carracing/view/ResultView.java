package carracing.view;

import carracing.domain.Car;
import carracing.domain.Cars;
import java.util.List;

public class ResultView {

  public static void printScore(Cars cars, int roundCount) {
    for(int i = 0; i < roundCount; i++) {
      for (Car car : cars.getCarList()) {
        System.out.println(car.getName().getName() + " : " + makeDash(car.getRoundPosition(i)));
      }
      System.out.println();
    }
  }

  private static String makeDash(int count) {
    String dash = "";
    for(int i = 0; i < count; i++) {
      dash += "-";
    }
    return dash;
  }

  public static void printResult(List<String> winners) {
    System.out.println(String.join(", ", winners) +  "(이)가 최종 우승했습니다.");
  }

}


/* 스터디 피드백 전


  public static void printScore(List<Car> carList) {
    for (Car car : carList) {
      System.out.println(car.getName().getName() + " : " + makeDash(car.getPosition().getPosition()));
    }
    System.out.println();
  }

}

 */