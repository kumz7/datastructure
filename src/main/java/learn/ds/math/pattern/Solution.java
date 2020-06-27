package learn.ds.math.pattern;

public class Solution{
	public static void main(String as[]){
		//hard coded test cases
		int input = 3;
		
		for(int outer_i = input ; outer_i > 0 ; outer_i-- ) {
			int temp = input+1;
			for(int inner_i = input*outer_i ; inner_i > 0 ; inner_i-- ) {
				if(inner_i%outer_i==0)temp--;
				System.out.print(temp+" ");
			}System.out.print("*");
		}
	}
}
