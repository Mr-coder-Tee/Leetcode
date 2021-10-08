
public class finalValueAfterOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(FinalValueAfterOperations(new String[] {"++X","++X","X++"}));
	}
	public static int FinalValueAfterOperations(String[] operations) {
		int result=0;
		
		for(String str:operations) {
			char mid=str.charAt(1);
			if(mid=='-') {
				result--;
			}else {
				result++;
			}
			
		}
        
		return result;
    }

}
