package sorting;

public class SelectionSort {
	public int count =0;
	public int[] sortingMethod(int [] arr){
		for (int i = 0; i <arr.length; i++) {
			int local=i;
			count +=1;
			int min=arr[i];
			int temp=0;
			int temNo=arr[i];
			for (int j = i+1; j < arr.length; j++) {
				count +=1;
				if(arr[j]<min){
					min =arr[j];
					temp=j;
				}
			}
			if(temNo==min){
				arr[i]=min;
			}else{
				arr[i]=min;
				arr[temp]=temNo;
			}
			
		}
		System.out.println("final count : "+count);
		return arr;
	}
}
