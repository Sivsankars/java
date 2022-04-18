package siva;
import java.util.*;
public class Stringmanupliation {
	class compare{
		compare(String s,String y){
			System.out.println("comparing........");
			System.out.println(s+"compare to"+y+"="+s.equals(y));
		}
	}

	public static void main(String[] args) {
		int i=1;
		Scanner obj= new Scanner(System.in);
		Stringmanupliation s= new Stringmanupliation();
		while(i==1){
			System.out.println("1.compare\n2.concatination\nenter your choice");
			int c=obj.nextInt();
			switch(c){
			case 1:
				System.out.println("enter the first String");
				String s1=obj.nextLine();
				System.out.println("enter the second  String");
				String s2=obj.nextLine();
				Stringmanupliation.compare r= s.new compare(s1,s2);
				break;
			}

		}
	}

}
