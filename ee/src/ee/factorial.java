package ee;

import java.util.Scanner;

public class factorial {
	
	int d;
	public void hp(){
		d=1;
		System.out.println("enter num");
		int n=new Scanner(System.in).nextInt();
		for(int i=n;i>0;i--){
			d=d*i;
			//n=n-1;
		}
		System.out.println(d);
	}
	public void hh(){
		d=1;
		System.out.println("enter num");
		int n=new Scanner(System.in).nextInt();
		for(int i=n;i>0;i--){
			d=d*n;
			n=n-1;
		}
		System.out.println(d);
	}
	public void ff(){
		d=1;
		System.out.println("enter num");
		int n=new Scanner(System.in).nextInt();
	while(n>0){
		d=d*n;
		n=n-1;
	}
	System.out.println(d);
	}
	public static void main(String[] as){
		factorial eee=new factorial();
		eee.ff();
		eee.hh();
		eee.hp();
	}
	
}
