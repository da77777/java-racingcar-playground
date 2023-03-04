package carRacing;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {

  Car car = new Car();

  @Test
  @DisplayName("Car 리스트 생성")
  void createCar() {
    String[] name = {"test1", "test2", "test3"};
    List<Car> carList = car.createCars(name);
    String[] carName = new String[name.length];
    for(int i = 0; i < name.length; i++) {
      carName[i] = carList.get(i).getName();
    }
    assertThat(Arrays.equals(name, carName)).isTrue();
  }


}
