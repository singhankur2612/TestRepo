package com.codillity.array;

import java.util.Arrays;

public class MissingInteger {
	public int solution(int[] A){
		int min =1;
		if(A !=null){
			Arrays.sort(A);
			//1,1,2,3,4,6
			for (int i = 0; i < A.length; i++) {
				if(A[i]==min){
					min+=1;
				}
			}
		}
		return min;
	}
	public static void main(String[] args) {
		MissingInteger in=new MissingInteger();
		int[] A={-1, -3};
		System.out.println(in.solution(A));
	}

}
