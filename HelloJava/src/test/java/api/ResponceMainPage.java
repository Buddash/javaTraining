package api;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.assertj.core.api.Assertions.assertThat;


public class ResponceMainPage {

    @ParameterizedTest
    @CsvSource({"https://www.youtube.com/, https://cleanuri.com/x9lZzk",
            "https://google.com/, https://cleanuri.com/AqJYaW",
            "https://metanit.com/ , https://cleanuri.com/R9NX4j"})
    @DisplayName("Корректный ответ при валидном url")
    public void validUrlTest(String testUrl, String shortTestUrl) {

        Facade facade = new Facade();

        assertThat(facade.shortenUrlSuccess(testUrl)).isEqualTo(shortTestUrl);
    }
}
