package bridgelabz;

public class stopwatch {
	private final long start;
	 public stopwatch() {
	        start = System.currentTimeMillis();
	 }
	 public double elapsedTime() {
	        long now = System.currentTimeMillis();
	        return (now - start) / 1000.0;
	 }
	 public static void main(String[] args) {
	        int n = Integer.parseInt(args[0]);

	        // sum of square roots of integers from 1 to n using Math.sqrt(x).
	        stopwatch timer1 = new stopwatch();
	        double sum1 = 0.0;
	        for (int i = 1; i <= n; i++) {
	            sum1 += Math.sqrt(i);
	        }
	        double time1 = timer1.elapsedTime();
	        System.out.printf("%e (%.2f seconds)\n", sum1, time1);

	        // sum of square roots of integers from 1 to n using Math.pow(x, 0.5).
	        stopwatch timer2 = new stopwatch();
	        double sum2 = 0.0;
	        for (int i = 1; i <= n; i++) {
	            sum2 += Math.pow(i, 0.5);
	        }
	        double time2 = timer2.elapsedTime();
	        System.out.printf("%e (%.2f seconds)\n", sum2, time2);
	}
}