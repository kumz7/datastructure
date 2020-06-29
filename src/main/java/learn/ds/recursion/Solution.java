package learn.ds.recursion;

import java.util.Arrays;

public class Solution{
	
	public static void main(String[] args) {
		
		int arr[][] = {{1, 1, 1, 1, 1, 1, 1, 1}, 
                {1, 1, 1, 1, 1, 1, 0, 0}, 
                {1, 0, 0, 1, 1, 0, 1, 1}, 
                {1, 2, 2, 2, 2, 0, 1, 0}, 
                {1, 1, 1, 2, 2, 0, 1, 0}, 
                {1, 1, 1, 2, 2, 2, 2, 0}, 
                {1, 1, 1, 1, 1, 2, 1, 1}, 
                {1, 1, 1, 1, 1, 2, 2, 1}, 
                };
		int k = 3;
		int x = 4,y=4;
		int v = arr[x][y];
		
		rec(arr,v,k,x,y);
		for(int[] ar : arr)
			System.out.println(Arrays.toString(ar)); 
	}

	public static void rec(int[][] arr,int v,int k,int x, int y) {
		if((x==-1 || y==-1 || x>=arr.length || y>=arr[0].length) || arr[x][y]!=v)return;
		
		arr[x][y]=k;
		
		rec(arr,v,k,x,y-1);
		rec(arr,v,k,x-1,y);
		rec(arr,v,k,x+1,y);
		rec(arr,v,k,x,y+1);
	} 
}
