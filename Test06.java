package testing;

public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10,j=0;
		for(j=0;j<i;j++) {
			System.out.println(j);
		}
		System.out.println("after for loop\t"+j);
		//j=0;
		while(j==11) {
			System.out.println("while\t"+j);
			j++;
		}
		System.out.println("After while loop"+j);
	}

}
