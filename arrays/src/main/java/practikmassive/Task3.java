package practikmassive;

public class Task3 {
	public void searchMaxMin() {
		int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
		int maxElement = arr[0];
		int minElement = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] >= maxElement) {
				maxElement = arr[i];
			}
			if (arr[i] <= minElement) {
				minElement = arr[i];
			}
		}
		System.out.println("Max element in massive = " + maxElement);
		System.out.println("Min element in massive = " + minElement);
	}
}
