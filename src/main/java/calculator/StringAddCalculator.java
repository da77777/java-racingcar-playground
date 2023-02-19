package calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {
  private static final String CUSTOM_REG = "//(.*)\n(.*)";
  private static final String DEFAULT_REG = ",|:";

  public static int splitAndSum(String text) {
    //1. 빈 문자열 또는 null 값을 입력할 경우 0을 반환해야 한다.(예 : “” => 0, null => 0)
    if(text == null || text.isEmpty()) {
      return 0;
    }

    //6. 음수를 전달할 경우 RuntimeException 예외가 발생해야 한다. (예 : “-1,2,3”)
    if(text.contains("-")) {
      throw new RuntimeException();
    }

    //2. 숫자 하나를 문자열로 입력할 경우 해당 숫자를 반환한다.(예 : “1”)
    if(text.length() == 1) {
      return Integer.parseInt(text);
    }

    //3. 숫자 두개를 컴마(,) 구분자로 입력할 경우 두 숫자의 합을 반환한다.(예 : “1,2”)
    //4. 구분자를 컴마(,) 이외에 콜론(:)을 사용할 수 있다. (예 : “1,2:3” => 6)
    if(!text.matches(CUSTOM_REG)) {
      String[] tokens = text.split(DEFAULT_REG);
      return sum(tokens);
    }

    //5. “//”와 “\n” 문자 사이에 커스텀 구분자를 지정할 수 있다. (예 : “//;\n1;2;3” => 6)
    Matcher m = Pattern.compile(CUSTOM_REG).matcher(text);
    int sum = 0;
    if (m.find()) {
      String customDelimiter = splitCustomDelimiter(m.group(1));
      String[] tokens= m.group(2).split(customDelimiter + DEFAULT_REG);
      sum = sum(tokens);
    }
    return sum;
  }

  private static int sum(String[] tokens) {
    int sum = 0;
    for (String token : tokens) {
      sum += Integer.parseInt(token);
    }
    return sum;
  }

  private static String splitCustomDelimiter(String customDelimiter) {
    String[] temp = customDelimiter.split("");
    String delimiter = "";
    for (String s : temp) {
      delimiter += s + "|";
    }
    return delimiter;
  }

}
