
public class Examples009Loop {

	public static void main(String[] args) {

		int sum = 0;
		int sum1 = 0;
		for (int i = 1; i < 11; i++) {
			sum += i;
		}
		System.out.println(sum);

		for (int j = 0; j <= 10; j++) {
			if (j % 2 == 0) {
				sum1 += j;
			}
		}
		System.out.println(sum1);
	}
}
