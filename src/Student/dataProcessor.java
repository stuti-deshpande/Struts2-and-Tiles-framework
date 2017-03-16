package Student;

public class dataProcessor {
	public dataBean compute(String S) {
		String[] numbers;
		dataBean d = new dataBean();
		numbers = S.split(",");
		int[] num = new int[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			num[i] = Integer.parseInt(numbers[i]);
		}

		d.setMean(mean(num));
		d.setSd(StandardDeviation(num));
		return d;
	}

	public double mean(int numbers[]) {
		double sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}

		double mean = sum / numbers.length;
		return mean;
	}

	public double StandardDeviation(int array[]) {
		double mean = mean(array);
		System.out.println("Mean is: " + mean);
		double d1 = 0;
		double d2 = 0;
		for (int i = 0; i < array.length; i++) {
			d2 = (mean - array[i]) * (mean - array[i]);
			d1 = d2 + d1;
		}
		return (Math.sqrt(d1 / (array.length - 1)));
	}

}