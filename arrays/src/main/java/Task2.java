public class Task2 {
	public int[][] arr;

	public int[][] changeArray(int sizeArray) {
		arr = new int[sizeArray][sizeArray];
		for (int i = 0; i < sizeArray; i++) {
			for (int j = 0; j < sizeArray; j++) {
				boolean isTrue = i == j;
				boolean isTrueNull = (i + j) % (sizeArray - 1) == 0;
				arr[i][j] = (isTrue || isTrueNull) ? 1 : 0;
			}
		}
		return arr;
	}

}
