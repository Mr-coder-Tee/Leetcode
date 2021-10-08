
public class AddDigits {

	public static void main(String[] args) {
		// https://leetcode.com/problems/add-digits/
		System.out.print(addDigits(38));
	}
	public static int addDigits(int num) {
		while(num%10!=num) {
			num=changeNum(num);
		}
		
		return num;
    }
	public static int changeNum(int num) {
		if(num%10==num)return num;
		int mod=num%10;
		int remainder=num/10;
		return mod+changeNum(remainder);
	}

}
