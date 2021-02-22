import java.util.Scanner;

class Main {
private static int total = 0;
	private static String binaryArray[];

	public static void binaryReader(){
		try {
			Scanner input = new Scanner(System.in);
			System.out.println("\nEnter 8 binary values with no white space.");
			String binaryInput = input.nextLine();
			binaryArray = binaryInput.split("");
			binaryConverter();
		}catch (Exception e) {
			System.out.println("That's not a byte!");
			System.exit(0);
		}
	}

	public static void binaryConverter(){
		if (binaryArray[0].equals("1")){
			total = total + 128;
		}
		if (binaryArray[1].equals("1")){
			total = total + 64;
		}
		if (binaryArray[2].equals("1")){
			total = total + 32;
		}
		if (binaryArray[3].equals("1")){
			total = total + 16;
		}
		if (binaryArray[4].equals("1")){
			total = total + 8;
		}
		if (binaryArray[5].equals("1")){
			total = total + 4;
		}
		if (binaryArray[6].equals("1")){
			total = total + 2;
		}
		if (binaryArray[7].equals("1")){
			total = total + 1;
		}
		System.out.println(total);
		char c=(char)total;  
		System.out.println(c); 
		total = 0;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("\nHow many characters would you like to convert?");
		int userRepeat = input.nextInt();
		System.out.println("You will now convert " + userRepeat + " characters.");
		for (int i = 0; i < userRepeat; i++) {
			binaryReader();	
		}

	}
}
