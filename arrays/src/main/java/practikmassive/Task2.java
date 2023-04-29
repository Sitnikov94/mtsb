package practikmassive;

public class Task2 {

	public void changeArray(int sizeArray) {
		int[][] arr;
		arr = new int[sizeArray][sizeArray];
		for (int i = 0; i < sizeArray; i++, System.out.println()) {
			for (int j = 0; j < sizeArray; j++) {
				boolean isTrue = i == j;
				boolean isTrueNull = (i + j) % (sizeArray - 1) == 0;
				arr[i][j] = (isTrue || isTrueNull) ? 1 : 0;
				System.out.print(arr[i][j] + " ");
			}
		}
	}

}
