import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in),
				str = new Scanner(System.in);
		boolean isRunning = true;
		while(isRunning){
			System.out.println("\fWelcome to the encrypter\n1-Encrypt\n2-Decrypt\n3-Reorder\n4-Exit");
			int x = num.nextInt();
			switch(x){
				case 1:
					System.out.println("What would you like to encrypt?");
					System.out.println(Encrypter.encrypt(str.nextLine()));
					break;
				case 2:
					System.out.println("What would you like to decrypt?");
					System.out.println(Encrypter.decrypt(str.nextLine()));
					break;
				case 3:
					System.out.println("What would you like to reorder?");
					System.out.println(Encrypter.encrypt(str.nextLine()));
				case 4:
					isRunning = false;
				}
			}
		
	}

}
