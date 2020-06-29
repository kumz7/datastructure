package learn.ds.recursion;

import java.util.Arrays;

public class Solution{

	static int[][] arr = new int[5][5];
	public static void main(String[] args) {
		
		arr[0] = new int[]{0,1,1,0,1}; 
		arr[1] = new int[]{3,1,1,4,6};
		arr[2] = new int[]{7,8,1,1,3};
		arr[3] = new int[]{5,1,1,1,2};
		arr[4] = new int[]{3,4,7,1,1};
		int k = 9;
		int x = 1,y=1;
		int v = arr[x][y];
		
		rec(v,k,x,y);
		for(int[] ar : arr)
			System.out.println(Arrays.toString(ar)); 
	}
	public static void rec(int v,int k,int x, int y) {
		if((x==-1 || y==-1 || x>=arr.length || y>=arr[0].length) || arr[x][y]!=v)return;
		
		arr[x][y]=k;
		
		rec(v,k,x,y-1);
		rec(v,k,x-1,y);
		rec(v,k,x+1,y);
		rec(v,k,x,y+1);
	} 
}
