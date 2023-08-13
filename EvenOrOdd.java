package importantCodesinNumberprograms;

import java.util.Scanner;

public class EvenOrOdd {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	int i=s.nextInt();
	if(i%2==0) {
		System.out.println(i+" "+"the number is even");
	}else {
		System.out.println(i+" "+"the number is odd");
	}
}
}
