package graphics;
import java.util.*;
class negativeException extends Exception{
	public negativeException(String s){
		super(s);
	}
}
public class average {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int ar[]=new int[5];
		System.out.println("enter the number ");
		int a=sc.nextInt();
		System.out.println("enter the element ");
		for(int i=0;i<a;i++){
			ar[i]=sc.nextInt();
			try{
				if(ar[i]<0){
					throw new negativeException("invalid");
				}
				else{
					sum=sum+ar[i];
				}
			}
				catch(negativeException e){
					System.out.println(e.getMessage());
				}
			}
		System.out.println("average = "+sum/a);
		}


}
