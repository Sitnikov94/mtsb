package print;

public class ConsolePrint {

	public void printConsole(int[][] arr) {
		for (int[] i : arr) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(i[j] + " ");
			}
			System.out.println();
		}
	}

	public void printConsole(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
