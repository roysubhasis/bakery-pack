import com.bakery.pack.BakerySolution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BakerySolutionTest {
    @Test
    public void calculateOutputTest(){
        Assertions.assertEquals("9,9,5,5,3,3", BakerySolution.calculateOutput(34));
    }
}
