package com.codillity.array;

public class PermCheck {
	public int solution(int[] A){
		int result = 1;
		int[] finalArr= new int[A.length+1];
		if(A !=null){
			for (int i = 0; i < A.length; i++) {
				if(A[i]>A.length){
					result =0;
					break;
				}else if(finalArr[A[i]]==1){
					result=0;
					break;
				}else{
					finalArr[A[i]]=1;
				}
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int[] A={1, 2, 8,3, 4,6};
		System.out.println(A.length);
		PermCheck check=new PermCheck();
		System.out.println(check.solution(A));
	}

}
