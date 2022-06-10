package diablo;
import java.util.*;
public class authentication {

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
			throw new credentialexception("invalid Credential");
		}
	}
	catch(credentialexception e) {
		System.out.println(e);
	}
	}

}
