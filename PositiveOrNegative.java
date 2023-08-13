package importantCodesinNumberprograms;

import java.util.Scanner;

public class PositiveOrNegative {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	int i=s.nextInt();
	if(i>0) {
		System.out.println(i+"positive number");
	}
	else if(i==0){
		System.out.println(i+"zero");
	}else {
		System.out.println(i+"negative number");
	}
}
}
