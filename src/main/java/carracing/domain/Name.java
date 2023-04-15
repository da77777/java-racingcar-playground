package carracing.domain;

public class Name {

  private String name;

  public String getName() {
    return name;
  }

  public Name(String name) {
    this.name = name;
  }

}

/* 스터디 피드백 전
  public Name(String name) {
    Valid.validCarName(name);
    this.name = name;
  }
* */
