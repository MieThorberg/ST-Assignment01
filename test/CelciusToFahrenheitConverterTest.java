import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CelciusToFahrenheitConverterTest {
    @Test
    public void whenCelciusLessThanNegative273Point15IsPassedThenIllegalArgumentExceptionIsThrown() {
        //Arrange
        double input = -274;
        //Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            FahrenheitCelciusConverter.celciusToFahrenheitConverter(input);
        });
    }

    @Test
    public void whenCelcius100IsPassedThenFahrenheit212IsReturned() {
        //Arrange
        double input = 100;
        double expected = 212;
        //Act
        double actual = FahrenheitCelciusConverter.celciusToFahrenheitConverter(input);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void whenCelcius0IsPassedThenFahrenheit32IsReturned() {
        //Arrange
        double input = 0;
        double expected = 32;
        //Act
        double actual = FahrenheitCelciusConverter.celciusToFahrenheitConverter(input);
        //Assert
        assertEquals(expected, actual);
    }
}