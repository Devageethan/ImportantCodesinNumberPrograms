package importantCodesinNumberprograms;

public class Abudance {
public static void main(String[] args) {
	int m=12;
	int sum=0;
	for(int i=1;i<m;i++) {
		if(m%i==0)
		sum+=i;
	}
	if(sum>m) {
		System.out.println(m+" Abudance number");
		System.out.println("Abudance is "+(sum-m));
	}else {
		System.out.println("not an abudance");
	}
}
}
