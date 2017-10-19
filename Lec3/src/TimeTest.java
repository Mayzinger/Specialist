import java.util.Date;

public class TimeTest {
	public static void main(String[] args) {
for (int i = 0; i < 10; i++) {
					time();

		}
	}

	private static void time() {
		long milles = System.currentTimeMillis();
		long nanoTime = System.nanoTime();
		long startTime = milles-nanoTime;
		System.out.println(new Date(startTime));
		System.out.println(System.nanoTime()-nanoTime);
	}

}
