import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String[] args) {

		int userNum;
		String answer;
		String name;

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your name:");
		name = scan.nextLine();

		do {
			System.out.println(name + ", please enter a number between 1 and 100: ");
			userNum = scan.nextInt();

			if (userNum >= 1 && userNum <= 100) {

				if (userNum % 2 != 0) {
					System.out.println(userNum + " Odd");
				}
				if ((userNum % 2 == 0) && (userNum >= 2 && userNum < 25)) {
					System.out.println("Even and less than 25");
				} else if ((userNum % 2 == 0) && (userNum > 25 && userNum <= 60)) {
					System.out.println("Even");
				} else if ((userNum % 2 == 0) && (userNum > 60 && userNum <= 100)) {
					System.out.println(userNum + " Even");
				}
				if ((userNum % 2 != 0) && (userNum > 60 && userNum < 100)) {
					System.out.println(userNum + " Odd and over 60");
				}

			} else {
				System.out.println(name + ", your number is not between 1 and 100.");
			}

			System.out.println(name + ", would you like to continue (y/n)? ");
			answer = scan.next();

		} while ((answer.equals("y")) || (answer.equals("Y")));

		scan.close();
	}

}
