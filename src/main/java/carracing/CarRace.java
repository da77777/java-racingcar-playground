package carracing;

import carracing.domain.Car;
import carracing.domain.Cars;
import carracing.share.Utils;
import java.util.ArrayList;
import java.util.List;

public class CarRace {

  public Cars racingGame(String[] names, int count) {
    Cars cars = new Cars();
    cars.createCars(names);

    return racing(cars, count);
  }

  private Cars racing(Cars cars, int raceCount) {
    List<Car> carList = cars.getCarList();
    for(int i = 0; i < raceCount; i++) {
      for (Car car : carList) {
        car.move(Utils.randomNumber(10));
        car.saveRoundPosition(i, car.getPosition());
      }
    }

    return new Cars(carList);
  }

  public List<String> findWinners(Cars cars) {
    List<Car> winners = cars.findWinners();

    List<String> winnersNames = new ArrayList<>();
    winners.stream().map(w -> w.getName().getName())
        .forEach(winnersNames::add);

    return winnersNames;
  }


}

/* 스터디 피드백 전

public class CarRace {
  InputView inputView = InputView.getInstance();
  Cars cars = new Cars();

  public void race() {
    List<Car> carList = race(joinCars(), inputView.inputRaceCount());
    List<Car> winners = findWinners(carList);

    List<String> winnersName = new ArrayList<>();
    winners.stream().map(w -> w.getName().getName()).forEach(winnersName::add);
    ResultView.printResult(winnersName);
    inputView.scannerClose();
  }

  public List<Car> joinCars() {
    String[] names = inputView.inputCarNames();
    cars.createCars(names);
    return cars.getCarList();
  }

  public List<Car> race(List<Car> carList, int raceCount) {
    for(int i = 0; i < raceCount; i++) {
      for (Car car : carList) {
        car.move(Utils.randomNumber(10));
      }
      ResultView.printScore(carList);
    }
    return carList;
  }

  public List<Car> findWinners(List<Car> carList) {
    return cars.findWinners(carList);
  }

}

 */