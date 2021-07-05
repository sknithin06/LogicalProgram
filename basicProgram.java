package bridgelabz;
import java.util.Scanner;
public class basicProgram {
	public static final Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Welcome to BasicCoreProgram");
	
		System.out.print("Enter a number:"); 
		int primeNum = sc.nextInt();
		int flag = 0;
		if (primeNum == 0 || primeNum == 1) {
			System.out.println("Given number is not a prime Number"+primeNum);
		}
		else {
			for (int i = 2; i <= primeNum/2; i++) {
				int num = primeNum % i;
				if (num == 0) {
					System.out.println("given number is not prime number:"+primeNum);
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println("given number is prime number:"+primeNum);	
			}
		
		}
	}	
}