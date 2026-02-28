package arrayProgrammes;

public class SortingAlgorithms {

	public static void main(String[] args) {

		int [] arr= {-99,9,4,-1,-999};
		
//		selectionSort(arr);
//		insertionSort(arr);
//		bubbleSort(arr);
		
	}
	
	public static void selectionSort(int [] arr) {
		
		for(int a=0;a<arr.length;a++) {
			
			for(int b=a+1;b<arr.length;b++) {
				
				if(arr[a]>arr[b]) {
					int temp=arr[a];
					arr[a]=arr[b];
					arr[b]=temp;
				}
				
			}
			
		}
		ArrayProblems ap=new ArrayProblems();
		ArrayProblems.printArray(arr);
	}
	
	public static void insertionSort(int [] arr) {
		
		for(int c=0;c<arr.length;c++) {
			
			for(int d=0;d+1<arr.length-c;d++) {
				
				if(arr[d]>arr[d+1]) {
					int temp=arr[d];
					arr[d]=arr[d+1];
					arr[d+1]=temp;
				}
			}
		}
		ArrayProblems ap=new ArrayProblems();
		ArrayProblems.printArray(arr);
	}
	
	public static void bubbleSort(int [] arr) {
		
		for(int e=0;e<arr.length;e++) {
			
			for(int f=0;f+1<arr.length-e;f++) {
				
				if(arr[f]>arr[f+1]) {
					int temp=arr[f];
					arr[f]=arr[f+1];
					arr[f+1]=temp;
				}
				
			}
		}
		ArrayProblems ap=new ArrayProblems();
		ArrayProblems.printArray(arr);
	}

}
