package com.codillity.array;

public class CyclicRotation {
	public int[] solution(int[] A, int K){
		int[] finalArr= new int[A.length];
		if(A!=null && A.length>1){
			for(int i=0;i<A.length;i++){
				if(i+K<A.length){
					finalArr[i+K]=A[i];
				}else{
					finalArr[Math.abs( i+K-A.length)%A.length]=A[i];
				}
			}
		}else{
			finalArr=A;
		}
		for(int i=0;i<finalArr.length;i++){
			System.out.println(finalArr[i]);
		}
		return finalArr;
	}
	public static void main(String[] args) {
		CyclicRotation cyclicRotation=new CyclicRotation();
		int[] A={1, 2, 3, 4,5};
		cyclicRotation.solution(A, 12);
	}

}
