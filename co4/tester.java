package diablo;
import java.util.*;
import arthmetic.*;
public class tester {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first value");
		int a=sc.nextInt();
		System.out.println("Enter the second value");
		int b=sc.nextInt();
		System.out.println("1.sum\n2.subtract\n3.multiplication\n4.divison\nenter your choice");
		int c=sc.nextInt();
		switch(c) {
		case 1:	add obj=new add();
				obj.calculate(a,b);
				break;
		case 2:	subtract obj1=new subtract();
				obj1.calculate(a,b);
				break;
		case 3:	multiply obj2=new multiply();
				obj2.calculate(a,b);
				break;
		case 4:	divison obj3=new divison();
				obj3.calculate(a,b);
				break;

		}

	}

}
