//Imad Merveil 
//(Reverse the numbers entered) Write a program that reads ten integers and dis-plays them in the reverse of the order in which they were read.
import java.util.Scanner;
public class ReverseIntegers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 10 differnet integers: ");
		int[] n = new int[10];
	
		for(int i = 0; i < 10; i++) n[i] = input.nextInt();
		
		for(int i = n.length - 1; i >= 0; i--) System.out.println(n[i]+ "");
		}
	}


