package carracing.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class CarsTest {

  @Test
  void findWinnersOne() {
    List<Car> carList = Arrays.asList(
        new Car(new Name("car1"), new Position(0)),
        new Car(new Name("car2"), new Position(2)),
        new Car(new Name("car3"), new Position(3))
    );

    Cars cars = new Cars();
    cars.getCarList().addAll(carList);

    List<Car> winners = cars.findWinners();
    assertThat(
        !winners.contains(carList.get(0)) &&
        !winners.contains(carList.get(1)) &&
        winners.contains(carList.get(2)))
        .isTrue();
  }

  @Test
  void findWinnersSeveral() {
    List<Car> carList = Arrays.asList(
        new Car(new Name("car1"), new Position(2)),
        new Car(new Name("car2"), new Position(3)),
        new Car(new Name("car3"), new Position(3))
    );

    Cars cars = new Cars();
    cars.getCarList().addAll(carList);

    List<Car> winners = cars.findWinners();
    assertThat(
        !winners.contains(carList.get(0)) &&
            winners.contains(carList.get(1)) &&
            winners.contains(carList.get(2)))
        .isTrue();
  }

}
