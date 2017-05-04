package huawei;

public class Main {

	public static void main(String[] args) {

		int[] a = { 1, 10, 20, 3, 5 };
		bubbleSort(a);

	}

	private static void bubbleSort(int[] numbers) {
		int temp;
		int size = numbers.length;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - 1 - i; j++) {
				if (numbers[j] > numbers[j+1]) {
					temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
				}
			}
		}
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}

}
