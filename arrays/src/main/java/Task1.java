public class Task1 {
	int numberCheck = 6;
	public void changeArray(int[] arr) {
		for (int i = 0; arr.length > i; i++) {
			arr[i] = (arr[i] < numberCheck) ? arr[i] * 2 : arr[i];
		}
	}
}
