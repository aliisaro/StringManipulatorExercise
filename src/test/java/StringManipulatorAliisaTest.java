import com.example.stringmanipulatorexercise.StringManipulatorAliisa;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringManipulatorAliisaTest {

    private static StringManipulatorAliisa stringManipulator;

    @BeforeAll
    public static void setUpAll() {
        stringManipulator = new StringManipulatorAliisa();
        System.out.println("String manipulator created\n");
    }

    @AfterAll
    public static void tearDownAll() {
        stringManipulator = null;
        System.out.println("String manipulator terminated");
    }

    @BeforeEach
    public void start() {
        System.out.println("Starting test");
    }

    @AfterEach
    public void finish() {
        System.out.println("Test finished\n");
    }
    @Test
    public void testReverseString() {
        System.out.println("Testing reversing string.");
        assertEquals("tupni", stringManipulator.reverse("input"));
    }

    @Test
    public void testCapitalizeString() {
        System.out.println("Testing capitalizing string.");
        assertEquals("INPUT", stringManipulator.capitalize("input"));
    }
}
