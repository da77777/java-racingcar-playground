package carracing.share;

public enum MessageEnum {
  CAR_NAME_LENGTH("차 이름은 0자 초과 5자 이하로 입력 바랍니다.")
  , NOT_POSITIVE_NUMBER("양수여야 합니다.")
  , NOT_NUMBER("숫자를 입력하세요.")
  ;

  private String message;

  public String getMessage() {
    return message;
  }

  MessageEnum(String message) {
    this.message = message;
  }
}
