import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		AlgorithmUtility utility=new AlgorithmUtility();
		// TODO Auto-generated method stub
		int decimalNumber, r;
		int decToBinary;
		int resultOfSwapNibbles;
		String x = "";
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		decimalNumber = scanner.nextInt();
		decToBinary = decimalNumber;
		if (decimalNumber > 255) {
			System.out.println("Enter Number between 1 to 255");
		} else {

			while (decimalNumber > 0) {
				r = decimalNumber % 2;
				x = r + "" + x;
				decimalNumber = decimalNumber / 2;
			}

			System.out.println("Binary is: " + x);

			resultOfSwapNibbles = utility.SwapNibbles(decToBinary);
			System.out.println("Result of Swap Nibbles of binary number: "+resultOfSwapNibbles);
		}
		
		scanner.close();
	}

}