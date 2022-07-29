	import java.text.DecimalFormat;
	import java.util.Scanner;

	public class Prog20 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number: ");
			long number = sc.nextLong();
			System.out.println(convertNumberToWord(number));
			sc.close();
		}
		// String type array for one digit numbers
		private static final String[] twodigits = { "", " Ten", " Twenty", " Thirty", " Forty", " Fifty", " Sixty",
				" Seventy", " Eighty", " Ninety" };
		// String type array for two digits numbers
		private static final String[] onedigit = { "", " One", " Two", " Three", " Four", " Five", " Six", " Seven",
				" Eight", " Nine", " Ten", " Eleven", " Twelve", " Thirteen", " Fourteen", " Fifteen", " Sixteen",
				" Seventeen", " Eighteen", " Nineteen" };

		// User-defined method that converts a number to words (up to 1000)
		private static String convertUptoThousand(int number) {
			String soFar;
			if (number % 100 < 20) {
				soFar = onedigit[number % 100];
				number = number / 100;
			} else {
				soFar = onedigit[number % 10];
				number = number / 10;
				soFar = twodigits[number % 10] + soFar;
				number = number / 10;
			}
			if (number == 0)
				return soFar;
			return onedigit[number] + " Hundred " + soFar;
		}

		// User-defined method that converts a long number (0 to 999999999) to string
		private static  String convertNumberToWord(long number) {
			if (number == 0) {
				return "zero";
			}

			String num = Long.toString(number);
			String pattern = "000000000000"; // For creating a mask padding with "0"
			DecimalFormat decimalFormat = new DecimalFormat(pattern);
			num = decimalFormat.format(number);

			int billions = Integer.parseInt(num.substring(0, 3)); // Format: XXXnnnnnnnnn
			int millions = Integer.parseInt(num.substring(3, 6)); // Format: nnnXXXnnnnnn
			int hundredThousands = Integer.parseInt(num.substring(6, 9)); // Format: nnnnnnXXXnnn

			int thousands = Integer.parseInt(num.substring(9, 12)); // Format: nnnnnnnnnXXX
			String tradBillions;
			switch (billions) {
			case 0:
				tradBillions = "";
				break;
			case 1:
				tradBillions = convertUptoThousand(billions) + " Billion ";
				break;
			default:
				tradBillions = convertUptoThousand(billions) + " Billion ";
			}
			String result = tradBillions;
			String tradMillions;
			switch (millions) {
			case 0:
				tradMillions = "";
				break;
			case 1:
				tradMillions = convertUptoThousand(millions) + " Million ";
				break;
			default:
				tradMillions = convertUptoThousand(millions) + " Million ";
			}
			result = result + tradMillions;
			String tradHundredThousands;
			switch (hundredThousands) {
			case 0:
				tradHundredThousands = "";
				break;
			case 1:
				tradHundredThousands = "One Thousand ";
				break;
			default:
				tradHundredThousands = convertUptoThousand(hundredThousands) + " Thousand ";
			}
			result = result + tradHundredThousands;
			String tradThousand;
			tradThousand = convertUptoThousand(thousands);
			result = result + tradThousand;
			// Removing extra space if any
			return result.replaceAll("^\\s+", "").replaceAll("\\b\\s{2,}\\b", " ");
		}
	}