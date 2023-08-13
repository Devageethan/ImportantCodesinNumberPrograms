package importantCodesinNumberprograms;

public class Freindlypair {
public static void main(String[] args) {
	int num1=18;
	int num2=28;
	int sum1=m1( num1);
	int sum2=m1( num2);
	if(sum1/num1==sum2/num2)
		System.out.println("Friendly pair");
	else
		System.out.println("not a friendly pair");
}
	public static int m1(int num) {
		int sum=0;
		for(int i=1;i<num;i++) {
			sum+=i;
	}
		return sum;
}
}
