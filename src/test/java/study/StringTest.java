package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split() {
        String s = "1,2";
        String[] dividedStr = s.split(",");
        assertThat(dividedStr).contains("1");

        s = "1";
        dividedStr = s.split(",");
        assertThat(dividedStr).containsExactly("1");
    }

    @Test
    void substring() {
        String s = "(1,2)";
        String dividedStr = s.substring(1,4);
        assertThat(dividedStr).isEqualTo("1,2");

    }
}
