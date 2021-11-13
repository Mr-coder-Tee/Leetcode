import java.util.ArrayList;
import java.util.List;

public class KCS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num1="two";
		String num2;
		
		while(!(Double.parseDouble(num1)>=0)&&!(Double.parseDouble(num1)<0)) {
			System.out.print("Wrong input");
			
		}
		System.out.print("Correct input");
	}
	
	public static double divide(double a,double b) {
		if(b==0)return  0;
		return a/b;
	}
	public static double add(double a,double b) {
		return a+b;
	}
	public static double product(double a,double b) {
		return a*b;
	}
	public static double sub(double a,double b) {
		return a-b;
	}
	public static double modulus(double a,double b) {
		return a%b;
	}
}

  
  
 
