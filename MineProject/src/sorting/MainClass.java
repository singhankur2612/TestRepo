package sorting;

public class MainClass {

	public static void main(String[] args) {
		//normal
		int [] unsortedNos={13,43,17,84,25,72,92};
		//bestcase
		int [] bestcaseunsortedNos={13,17,25,43,72,84,92};
		//worstcase 
		int [] worstcaseunsortedNos={92,84,72,43,25,17,13};
		//InsertionSort insertionSort=new InsertionSort();
		//int [] sortedNos=insertionSort.sortingMethod(bestcaseunsortedNos);
		
		SelectionSort selectionSort=new SelectionSort();
		int [] sortedNos=selectionSort.sortingMethod(unsortedNos);
		for (int i = 0; i < sortedNos.length; i++) {
			System.out.println(sortedNos[i]);
		}
	}

}
