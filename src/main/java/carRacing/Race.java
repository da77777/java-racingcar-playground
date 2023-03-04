package carRacing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Race {

  private InputView inputView = InputView.getInstance();

  public void carRace() {
    Car car = new Car();
    List<Car> carList = car.createCars(inputView.inputCarNames());

    int raceCount = inputView.inputRaceCount();
    for(int i = 0; i < raceCount; i++) {
      oneRace(carList);
      ResultView.printOneRaceScore(carList);
    }

    ResultView.printRaceScore(findWinners(carList));
    inputView.scannerClose();
  }

  public void oneRace(List<Car> cars) {
    for (Car car : cars) {
      car.modifyForwardCount();
    }
  }

  public List<Car> findWinners(List<Car> cars) {
    Collections.sort(cars);

    List<Car> winners = new ArrayList<>();
    winners.add(cars.get(0));
    for(int i = 1; i < cars.size(); i++) {
      if(winners.get(0).getForwardCount() > cars.get(i).getForwardCount()) {
        break;
      }
      winners.add(cars.get(i));
    }

    return winners;
  }

}
