import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FahrenheitToCelciusConverterTest {
    @Test
    public void whenFahrenheitLessThanNegative459Point67IsPassedThenIllegalArgumentExceptionIsThrown() {
        //Arrange
        double input = -500;
        //Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            FahrenheitCelciusConverter.fahrenheitToCelciusConverter(input);
        });
    }

    @Test
    public void whenFahrenheit212IsPassedThenCelius100IsReturned() {
        //Arrange
        double input = 212;
        double expected = 100;
        //Act
        double actual = FahrenheitCelciusConverter.fahrenheitToCelciusConverter(input);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void whenFahrenheit32IsPassedThenCelius0IsReturned() {
        //Arrange
        double input = 32;
        double expected = 0;
        //Act
        double actual = FahrenheitCelciusConverter.fahrenheitToCelciusConverter(input);
        //Assert
        assertEquals(expected, actual);
    }
}