package me.piomar;

import java.util.List;
import java.util.Map;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

class MapTest {

    @Test
    void extract_key() {
        Map<String, List<String>> map = Map.of("foo", List.of("1", "2", "3"));

        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(map)
              .extractingByKey("bar")
              .extracting(list -> list.get(0))
              .isEqualTo("foobar");
        softly.assertAll();
    }

}
