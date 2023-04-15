package carracing.domain;

import carracing.share.MessageEnum;

public class Position {

  private int position;

  public int getPosition() {
    return this.position;
  }

  public Position(int position) {
    if(position < 0) {
      throw new IllegalArgumentException(MessageEnum.NOT_POSITIVE_NUMBER.getMessage());
    }
    this.position = position;
  }

  public void increasePosition() {
    position++;
  }



}
