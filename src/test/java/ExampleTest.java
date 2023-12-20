import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ExampleTest {
    @Test
    @Disabled("Just for testing")
    @DisplayName("Testing JUNIT")
    void shouldShowSimpleAssertion(){
        Assertions.assertEquals(1,1);
    }

}
