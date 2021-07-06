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
		
		System.out.print("Enter a number:"); 
		int num = sc.nextInt();
		int num1 = 0, num2 = 1,fibnum;
		System.out.println("Fibonacci number is:"+num1);
		System.out.println("Fibonacci number is:"+num2);
		for (int i = 2; i <= num; i++) {
			fibnum = num1 + num2;
			System.out.println("Fibonacci number is:"+fibnum);
			num1 = num2;
			num2 = fibnum;
		}
		
		System.out.print("Enter a number:"); 
		int value = sc.nextInt();
		int rem = 0, rev = 0;
		while (value != 0) {
			rem = value % 10;
			rev = rem + rev * 10;
			value = value / 10;
		}
		System.out.println("Reverse of the given number is:"+rev);		
	
		System.out.print("Enter a number:"); 
		int number = sc.nextInt();
		int sum = 0;
		int i = 1;
		while ( i < number / 2) {
			if (number % i == 0) {
				sum = sum + i;
			}
			i = i + 1;
		}
		if (sum == number) {
			System.out.println("Given number is Perfect number is:"+number);
		}
		else {
			System.out.println("Given number is Perfect number is:"+number);
		}
		
		char[] charArray="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
		int max=100000000;
		int couponNum = (int) (Math.random()*max);	
		StringBuffer sb=new StringBuffer();
		
		while (couponNum>0) {
			sb.append(charArray[couponNum % charArray.length]);
			couponNum = couponNum /charArray.length;
		}

		String couponCode=sb.toString();
		System.out.println("Coupon Code is generated: "+couponCode);
		
		
	}	
}