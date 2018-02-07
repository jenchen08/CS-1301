import java.util.Scanner;
import java.util.Random;

public class SlotMachine {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rdm = new Random();

		String cont = "Y";
		char answer;
		int coin = 0;
		int totalEntered = 0;
		int a;
		int b;
		int c;
		int amountWon = 0;

		while (cont.equals("Y")) {
			a = rdm.nextInt(6);
			b = rdm.nextInt(6);
			c = rdm.nextInt(6);


			System.out.println("How much would you like to bet? ");
			coin = scan.nextInt();

			switch (a) {
			case 0:
				System.out.println("Cherry");
				break;
			case 1:
				System.out.println("Orange");
				break;
			case 2:
				System.out.println("Plum");
				break;
			case 3:
				System.out.println("Bell");
				break;
			case 4:
				System.out.println("Melon");
				break;
			default:
				System.out.println("Bar");
			}

			switch (b) {
			case 0:
				System.out.println("Cherry");
				break;
			case 1:
				System.out.println("Orange");
				break;
			case 2:
				System.out.println("Plum");
				break;
			case 3:
				System.out.println("Bell");
				break;
			case 4:
				System.out.println("Melon");
				break;
			default:
				System.out.println("Bar");
			}

			switch (c) {
			case 0:
				System.out.println("Cherry");
				break;
			case 1:
				System.out.println("Orange");
				break;
			case 2:
				System.out.println("Plum");
				break;
			case 3:
				System.out.println("Bell");
				break;
			case 4:
				System.out.println("Melon");
				break;
			default:
				System.out.println("Bar");
			}

			if (a != b || a != c || b != c) {
				amountWon = coin * 2;
				System.out.println("Congratulations! You have won $" + amountWon);

			} 
			
			else if (a == b && b == c && a == c) {
				amountWon = coin * 3;
				System.out.println("Congratulations You have won $" + amountWon);

			} 
			
			else {

				System.out.println("You have won $0");

			}

			System.out.println("Continue? Y or N");
			cont = scan.next();

		}

	}
}  