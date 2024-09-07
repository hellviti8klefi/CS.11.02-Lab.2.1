import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void main() {
    }

    @org.junit.jupiter.api.Test
    void add() {
        assertEquals(12, Main.add(5,7));
    }

    @org.junit.jupiter.api.Test
    void addTwo() {
        assertEquals(24, Main.add(5,7,6,6));
    }

    @org.junit.jupiter.api.Test
    void morningGreeting() {
        assertEquals("早上好, Toby Fox!", Main.morningGreeting("Toby Fox"));
    }

    @org.junit.jupiter.api.Test
    void afternoonGreeting() {
        assertEquals("下午好, Mac Miller!", Main.afternoonGreeting("Mac Miller"));
    }

    @org.junit.jupiter.api.Test
    void triple() {
        assertEquals("oohbabyoohbabyoohbaby", Main.triple("oohbaby"));
    }

    @org.junit.jupiter.api.Test
    void half() {
        assertEquals(9.5, Main.half(19));
    }

    @org.junit.jupiter.api.Test
    void roundPositiveValueToNearestInteger() {
        assertEquals(9, Main.roundPositiveValueToNearestInteger(8.5));
    }

    @org.junit.jupiter.api.Test
    void roundPositiveValueToNearestIntegerTwo() {
        assertEquals(8, Main.roundPositiveValueToNearestInteger(8.49));
    }

    @org.junit.jupiter.api.Test
    void roundNegativeValueToNearestInteger() {
        assertEquals(-8, Main.roundNegativeValueToNearestInteger(-8.49));
    }

    @org.junit.jupiter.api.Test
    void roundNegativeValueToNearestIntegerTwo() {
        assertEquals(-9, Main.roundNegativeValueToNearestInteger(-8.5));
    }


}