package importantCodesinNumberprograms;

public class HarshadNumber {
public static void main(String[] args) {
	int i=345;
	int sum=0;
	while(i!=0) {
		int last=i%10;
		sum+=last;
		i/=10;
	}
	if(i%sum==0)
		System.out.println("Harshad Number");
	else
		System.out.println("not Harshad number");
}
}
