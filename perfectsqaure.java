package square;

import java.util.Scanner;

public class squarenumber{
	
public static String squarenum(int n) {
	String str = null;

	for(int i=1;i*i<=n;i++) {
		if(i*i==n) {
			str="true";
		}
		else {
			str="false";
		}

}
	return str;
}

public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	String val=squarenum(n);
	System.out.println(val);

}

}
