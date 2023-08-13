package importantCodesinNumberprograms;

public class PrimeFactors {
public static void main(String[] args) {
	int i=22;
	int sum=0;
	for(int j=1;j<=i;j++) {
		sum=0;
		int count=0;
		if(i%j==0) {
			sum=j;
		}
		for(int k=1;k<=sum;k++) {
			if(sum%k==0) {
				count++;
			}
		}
		if(count==2)
		System.out.println(sum+" "+"it is prime factor");
	}
}
}
