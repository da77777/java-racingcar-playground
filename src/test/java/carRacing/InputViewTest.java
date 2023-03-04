package carRacing;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.Test;

public class InputViewTest {

  private InputView inputView = InputView.getInstance();

  @Test
  void validCarName_성공() {
    String[] name = {"test1", "test2"};
    assertThat(inputView.validCarName(name)).isTrue();
  }

  @ParameterizedTest
  @ValueSource(strings = {"", "123456"})
  void validCarName_실패(String name) {
    String[] names = {name};
    assertThat(inputView.validCarName(names)).isFalse();
  }

  @ParameterizedTest
  @CsvSource(value = {"0:0", "10:10"}, delimiter = ':')
  void validRaceCount_성공(String raceCount, int result) {
    assertThat(inputView.validRaceCount(raceCount)).isEqualTo(result);
  }

  @ParameterizedTest
  @ValueSource(strings = {"test", "-1", ""})
  void validRaceCount_실패(String raceCount) {
    assertThat(inputView.validRaceCount(raceCount)).isEqualTo(-1);
  }

}
