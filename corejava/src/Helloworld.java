import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class Helloworld {
@Test
	void display() {
		System.out.println("helo");
	}
@RepeatedTest(4)
void show() {
	System.out.println("welcome");
}

}