import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class HelloJenkinsTest {

    @Test
    public void testMessage() {
        assertEquals("Hello Jenkins CI - Updated!", HelloJenkins.message());
    }
}