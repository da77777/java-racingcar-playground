package carRacing;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Car implements Comparable<Car> {

  private String name;
  private int forwardCount;

  public String getName() {
    return name;
  }

  public int getForwardCount() {
    return forwardCount;
  }

  public Car() {
  }

  public Car(String name, int forwardCount) {
    this.name = name;
    this.forwardCount = forwardCount;
  }

  public String createForwardDash(int forwardCount) {
    String dash = "";
    for(int i = 0; i < forwardCount; i++) {
      dash += "-";
    }
    return dash;
  }

  public void modifyForwardCount() {
    Random randomNum = new Random();
    if(randomNum.nextInt(10) >= 4) {
      this.forwardCount++;
    }
  }

  public List<Car> createCars(String[] names) {
    List<Car> cars = new ArrayList<>();
    for (String name : names) {
      cars.add(new Car(name, 0));
    }
    return cars;
  }

  @Override
  public int compareTo(Car o) {
    return o.getForwardCount() - this.forwardCount;
  }
}
