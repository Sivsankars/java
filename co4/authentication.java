package diablo

import java.util.*;
class pswException extends Exception{
	public pswException(String s){
		super(s);
	}
}
public class autentication {

	public static void main(String[] args) {
		String user="siva";
		String pass="sankar";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the username");
		String u=sc.nextLine();
		System.out.println("enter the password");
		String p=sc.nextLine();
		
		
	try {
		if((u.equals(user))&& (p.equals(pass))) {
			System.out.println("permission granted");
		}
		else {
			throw new pswException("invalid Credential");
		}
	}
	catch(pswException e) {
		System.out.println(e.getMessage());
	}
	}

}
