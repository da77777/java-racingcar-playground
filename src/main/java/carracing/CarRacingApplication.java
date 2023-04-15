package carracing;

import carracing.domain.Cars;
import carracing.view.InputView;
import carracing.view.ResultView;
import java.util.List;

public class CarRacingApplication {

  public static void main(String[] args) {
    InputView inputView = InputView.getInstance();
    CarRace carRace = new CarRace();

    int raceCount = inputView.inputRaceCount();
    Cars cars = carRace.racingGame(inputView.inputCarNames(), raceCount);

    //라운드별 스코어 출력
    ResultView.printScore(cars, raceCount);

    //우승자 출력
    List<String> winners = carRace.findWinners(cars);
    ResultView.printResult(winners);

    inputView.scannerClose();
  }

}


/* 스터디 피드백 전

  public static void main(String[] args) {

    CarRace carRace = new CarRace();
    carRace.race();
  }

 */