package testing;

public class Test03 {
	public static void main(String[] args) {
		
		int n;
		int result;
		result = 1;
		for(n=7;n>=1;n--) {
			result = result * n;
			System.out.println(n+"\t"+result);
		}
		System.out.println("\n\nResult\t:\t"+result);
		if(result<1700) {
			System.out.println("Giri");
		}
		else {
			System.out.println("Prasad");
		}
	}
	
}
