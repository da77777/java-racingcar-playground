package carracing.domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import carracing.share.MessageEnum;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PositionTest {

  @Test
  void position_fail() {

    Exception exception = assertThrows(IllegalArgumentException.class,
        () -> {
          new Position(-1);
        });

    assertThat(exception.getMessage()).isEqualTo(MessageEnum.NOT_POSITIVE_NUMBER.getMessage());
  }

  @ParameterizedTest
  @ValueSource(ints = {0, 1})
  void position_success(int num) {

    new Position(num);

  }

}