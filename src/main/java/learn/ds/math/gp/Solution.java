package learn.ds.math.gp;

public class Solution{
	public static void main(String as[]){
		int a = 3;
		int b = 15;
		int n = 4;
		int r = b/a;
		System.out.println(
				(int)(a*(Math.pow(r, n-1)))
				);
	}
}
