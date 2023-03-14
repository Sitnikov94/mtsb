import print.ConsolePrint;

public class Main {

	public static void main(String[] args) {

		ConsolePrint print = new ConsolePrint();

		int[] arr1 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
		Task1 array1 = new Task1();
		print.printConsole(arr1);

		array1.changeArray(arr1);
		print.printConsole(arr1);


		Task2 array2 = new Task2();
		print.printConsole(array2.changeArray(9));

		int max = arr1[0];
		for (int j : arr1) {
			if (j >= max) {
				max = j;
			}
		}
		System.out.println(max);

	}
}