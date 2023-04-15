package carracing.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CarTest {

  @ParameterizedTest
  @CsvSource(value = {"3:0", "4:1"}, delimiter = ':')
  void move(int num, int expected) {
    Car car = new Car(new Name("car"), new Position(0));
    car.move(num);

    assertThat(car.getPosition().getPosition()).isEqualTo(expected);
  }

}
