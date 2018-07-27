package com.codillity.array;

import java.util.Arrays;

public class Distinct {
	public int solution(int[] A){
		int count =0;
		if(A!=null){
			java.util.Arrays.sort(A);
			int[] countarray= new int[Math.abs(A[A.length-1])+1];
			for(int i=0;i<A.length;i++){
				countarray[A[i]]+=1;
			}
			for(int i=0;i<countarray.length;i++){
				if(countarray[i]!=0){
					count+=1;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Distinct distinct=new Distinct();
		int[] A={1,3,1,2};
		System.out.println(distinct.solution(A));
	}

}
