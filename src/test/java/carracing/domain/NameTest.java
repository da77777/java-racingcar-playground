package carracing.domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import carracing.share.MessageEnum;
import org.junit.jupiter.api.Test;

public class NameTest {
/* 스터디 피드백 전

  @Test
  void name_fail() {

    Exception exception = assertThrows(IllegalArgumentException.class,
        () -> {
          new Name("123456");
        });

    assertThat(exception.getMessage()).isEqualTo(MessageEnum.CAR_NAME_LENGTH.getMessage());
  }

  @Test
  void name_success() {
    String inputName = "1234";
    Name name = new Name(inputName);
    assertThat(name.getName()).isEqualTo(inputName);
  }

*/

}
