import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RomanNumeralConverterTest {
    @Test
    public void whenZeroIsPassedThenIllegalArgumentExceptionIsThrown() {
        //Arrange
        int input = 0;
        //Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            RomanNumeralConverter.convertToRoman(input);
        });
    }

    @Test
    public void whenNegativeOneIsPassedThenIllegalArgumentExceptionIsThrown() {
        //Arrange
        int input = -1;
        //Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            RomanNumeralConverter.convertToRoman(input);
        });
    }

    @Test
    public void whenFourThousandIsPassedThenIllegalArgumentExceptionIsThrown() {
        //Arrange
        int input = 4000;
        //Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            RomanNumeralConverter.convertToRoman(input);
        });
    }

    @Test
    public void whenOneIsPassedThenIIsReturned() {
        //Arrange
        String expected = "I";
        int input = 1;
        //Act
        String actual = RomanNumeralConverter.convertToRoman(input);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void whenTwoIsPassedThenIIIsReturned() {
        //Arrange
        String expected = "II";
        int input = 2;
        //Act
        String actual = RomanNumeralConverter.convertToRoman(input);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void whenThreeIsPassedThenIIIIsReturned() {
        //Arrange
        String expected = "III";
        int input = 3;
        //Act
        String actual = RomanNumeralConverter.convertToRoman(input);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void whenFourIsPassedThenIVIsReturned() {
        //Arrange
        String expected = "IV";
        int input = 4;
        //Act
        String actual = RomanNumeralConverter.convertToRoman(input);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void whenFiveIsPassedThenVIsReturned() {
        //Arrange
        String expected = "V";
        int input = 5;
        //Act
        String actual = RomanNumeralConverter.convertToRoman(input);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void whenSixIsPassedThenVIIsReturned() {
        //Arrange
        String expected = "VI";
        int input = 6;
        //Act
        String actual = RomanNumeralConverter.convertToRoman(input);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void whenSevenIsPassedThenVIIIsReturned() {
        //Arrange
        String expected = "VII";
        int input = 7;
        //Act
        String actual = RomanNumeralConverter.convertToRoman(input);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void whenEightIsPassedThenVIIIIsReturned() {
        //Arrange
        String expected = "VIII";
        int input = 8;
        //Act
        String actual = RomanNumeralConverter.convertToRoman(input);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void whenNineIsPassedThenIXIsReturned() {
        //Arrange
        String expected = "IX";
        int input = 9;
        //Act
        String actual = RomanNumeralConverter.convertToRoman(input);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void whenTenIsPassedThenXIsReturned() {
        //Arrange
        String expected = "X";
        int input = 10;
        //Act
        String actual = RomanNumeralConverter.convertToRoman(input);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void whenElevenIsPassedThenXIIsReturned() {
        //Arrange
        String expected = "XI";
        int input = 11;
        //Act
        String actual = RomanNumeralConverter.convertToRoman(input);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void whenFiftyIsPassedThenLIsReturned() {
        //Arrange
        String expected = "L";
        int input = 50;
        //Act
        String actual = RomanNumeralConverter.convertToRoman(input);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void whenOneHundredIsPassedThenCIsReturned() {
        //Arrange
        String expected = "C";
        int input = 100;
        //Act
        String actual = RomanNumeralConverter.convertToRoman(input);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void whenFiveHundredIsPassedThenDIsReturned() {
        //Arrange
        String expected = "D";
        int input = 500;
        //Act
        String actual = RomanNumeralConverter.convertToRoman(input);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void whenOneThousandIsPassedThenMIsReturned() {
        //Arrange
        String expected = "M";
        int input = 1000;
        //Act
        String actual = RomanNumeralConverter.convertToRoman(input);
        //Assert
        assertEquals(expected, actual);
    }
}