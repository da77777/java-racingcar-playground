package carracing.domain;

import java.util.HashMap;
import java.util.Map;

public class Car {
  private final Name name;
  private Position position;
  private Map<Integer, Integer> roundPosition = new HashMap<>();

  public Name getName() {
    return name;
  }

  public Position getPosition() {
    return position;
  }

  public int getRoundPosition(int round) {
    return roundPosition.get(round);
  }

  public Car(Name name, Position position) {
    this.name = name;
    this.position = position;
  }

  public void move(int num) {
    if(num >= 4) {
      position.increasePosition();
    }
  }

  public void saveRoundPosition(int round, Position position) {
    roundPosition.put(round, position.getPosition());
  }



}

/* 스터디 피드백 전

package carracing.domain;

public class Car {
  private final Name name;
  private Position position;

  public Name getName() {
    return name;
  }

  public Position getPosition() {
    return position;
  }

  public Car(Name name, Position position) {
    this.name = name;
    this.position = position;
  }

  public void move(int num) {
    if(num >= 4) {
      position.increasePosition();
    }
  }

}

 */