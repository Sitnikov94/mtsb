package practikmassive;

public class Task1 {

	public void changeArray() {
		int numberCheck = 6;
		int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (arr[i] < numberCheck) ? arr[i] * 2 : arr[i];
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
