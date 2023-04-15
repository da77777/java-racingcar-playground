package carracing.domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {
  private List<Car> carList = new ArrayList<>();

  public List<Car> getCarList() {
    return this.carList;
  }

  public Cars() {
  }

  public Cars(List<Car> carList) {
    this.carList = carList;
  }

  public void createCars(String[] names) {
    for (String name : names) {
      carList.add(new Car(new Name(name), new Position(0)));
    }
  }

  public int findMaxPosition () {
    int maxPosition = carList.stream()
        .mapToInt(car -> car.getPosition().getPosition())
        .max()
        .orElse(0);
    return maxPosition;
  }

  public List<Car> findWinners() {
    int maxPosition = findMaxPosition();
    List<Car> winners = new ArrayList<>();
    for (Car car : carList) {
      if(car.getPosition().getPosition() == maxPosition) {
        winners.add(car);
      }
    }
    return winners;
  }

}

/* 스터디 피드백 전
...

  public int findMaxPosition (List<Car> carList) {
    int maxPosition = carList.stream()
        .mapToInt(car -> car.getPosition().getPosition())
        .max()
        .orElse(0);
    return maxPosition;
  }

  public List<Car> findWinners(List<Car> carList) {
    int maxPosition = findMaxPosition(carList);
    List<Car> winners = new ArrayList<>();
    for (Car car : carList) {
      if(car.getPosition().getPosition() == maxPosition) {
        winners.add(car);
      }
    }
    return winners;
  }

}

*/
