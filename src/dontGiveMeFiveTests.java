import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class dontGiveMeFiveTests {
    @Test
    public void exampleTests() {
        assertEquals(8, Main.dontGiveMeFive(1, 9));
        assertEquals(12, Main.dontGiveMeFive(4, 17));
        assertEquals(1, Main.dontGiveMeFive(5, 6));
    }
}
