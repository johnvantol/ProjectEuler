package ProjectEuler;
import static org.junit.Assert.*;
import java.io.IOException;
import org.junit.Test;

public class Problem1Test {

	@Test
	public void shouldReturnTwentyThree() {

		int sum = 0;
		for (int i = 0; i < 10; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		if (sum != 23) {
			fail();
		}
	}
}
