package carRacing;

import java.util.List;

public class ResultView {

  public static void printOneRaceScore(List<Car> cars) {
    for (Car car : cars) {
      System.out.println(car.getName() + " : " + car.createForwardDash(car.getForwardCount()));
    }
    System.out.println();
  }

  public static void printRaceScore(List<Car> cars) {
    String name = "";
    for(int i = 0; i < cars.size(); i++) {
      name += cars.get(i).getName() + ", ";
    }
    System.out.println(name.substring(0, name.length()-2) + "(이)가 최종 우승했습니다.");
  }

}
