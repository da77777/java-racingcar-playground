package carRacing;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RacingTest {

  private Race race = new Race();
  Car car1;
  Car car2;
  Car car3;
  Car car4;

  @BeforeEach
  void createCarInstance() {
    car1 = new Car("test1", 1);
    car2 = new Car("test2", 2);
    car3 = new Car("test3", 5);
    car4 = new Car("test4", 5);
  }

  @Test
  void findWinners_성공() {
    List<Car> cars = Arrays.asList(car1, car2, car3, car4);

    List<Car> winners = race.findWinners(cars);
    assertThat(winners.contains(car3) && cars.contains(car4)).isTrue();
  }

  @Test
  void findWinners_실패() {
    List<Car> cars = Arrays.asList(car1, car2, car3, car4);

    List<Car> winners = race.findWinners(cars);
    assertThat(winners.contains(car1) && cars.contains(car2)).isFalse();
    assertThat(winners.contains(car2) && cars.contains(car4)).isFalse();
  }




}
