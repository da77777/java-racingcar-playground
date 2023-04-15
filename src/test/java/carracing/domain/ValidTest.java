package carracing.domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import carracing.share.MessageEnum;
import carracing.share.Valid;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ValidTest {

  @ParameterizedTest
  @ValueSource(strings = {"", "123456"})
  void validCarName_fail(String name) {
    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
      String[] names = {name};
      Valid.validCarNames(names);
    });

    assertThat(exception.getMessage()).isEqualTo(MessageEnum.CAR_NAME_LENGTH.getMessage());
  }

  @Test
  void validCarNames_success() {
    String[] names = {"12345", "6"};
    Valid.validCarNames(names);
  }

}
