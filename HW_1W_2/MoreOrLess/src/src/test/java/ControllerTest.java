import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.NoSuchElementException;
import java.util.Scanner;

import static org.junit.Assert.*;

public class ControllerTest {

    private static Controller controller;

    @BeforeClass
    public static void once() {
        controller = new Controller(new Model(), new View());
        controller.getModel().setRandomValue(51);
    }

    @Test(expected = NoSuchElementException.class)
    public void inputNumberFromConsole() throws Exception {
        assertEquals(5, controller.inputNumberFromConsole(new Scanner("5")));
        assertNotEquals(0, controller.inputNumberFromConsole(new Scanner("1")));
        assertNotEquals(3, controller.inputNumberFromConsole(new Scanner("string value")));
    }

    @Test
    public void compareNumberAndUpdateEdges() throws Exception {
        assertFalse(controller.compareNumberAndUpdateEdges(-1));
        assertFalse(controller.compareNumberAndUpdateEdges(0));
        assertTrue(controller.compareNumberAndUpdateEdges(51));
        assertFalse(controller.compareNumberAndUpdateEdges(100));
    }

    @Test
    public void isInRange() throws Exception {
        assertFalse(controller.isInRange(-10));
        assertFalse(controller.isInRange(0));
        assertTrue(controller.isInRange(30));
        assertTrue(controller.isInRange(51));
        assertTrue(controller.isInRange(70));
        assertFalse(controller.isInRange(100));
    }

}