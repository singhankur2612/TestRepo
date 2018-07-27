package sorting;

public class InsertionSort {
	public int count =0;
	public int[] sortingMethod(int [] arr){
		//complexicity - 1 + 2 + 3 + ... + (N-1) = O(n2)
		//best case  - 13,17,25,43,72,84,92 - count - 7
		//normal  - 13,43,17,84,25,72,92-    count - 11
		//worstcase - 92,84,72,43,25,17,13- count - 1+2+3+4+5+6+7= 28 - worst case
		for (int i = 0; i < arr.length; i++) {
			System.out.println("for count : "+count);
			count+=1;
			int index=arr[i],j=i;
			while (j>0 && arr[j-1]>index) {
				System.out.println("while wala count : "+count);
				count+=1;
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=index;
			
		}
		System.out.println("final  - count : "+count);
		return arr;
		
	}
}
