package arrayProgrammes;

public class ArrayProblems {

	public static void main(String[] args) {

		//System.out.println("Namaste");	
		int arr[][]= {{1,2,3},{4,5,6}};

		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
			//System.out.println(arr[i][j]);
			}
		}
		
		int []arr2= {1,2,3,3,3,4,4,5,6,6};
//		reverseArray(arr2);
//		System.out.print("Reverse array :- ");
//		printArray(arr2);
//		System.out.println();
//		sumOfNNumbers(arr2,7);
//		largestNumber(arr2);
//		smallestNumber(arr2);
//		rotateArray(arr2,2);
//		duplicatesInSortArray(arr2);
		
	}
	   //Function to print an array.
		public static void printArray(int []arrPrint) {
			
			for(int i=0;i<arrPrint.length;i++)
			{
			System.out.print(arrPrint[i]+" ");
			}
		}
		
		//Function to reverse the array.
		public static void reverseArray(int []revArr) {
			
			int tmp;
			for(int a=0;a<(revArr.length-revArr.length/2);a++) {	
				tmp=revArr[a];
				revArr[a]=revArr[revArr.length-(a+1)];
				revArr[revArr.length-(a+1)]=tmp;
			}
		}
		
		//Function to calculate sum of first N numbers.
		public static void sumOfNNumbers(int[]arr,int n) {
			
			if(n<=arr.length) {
			int sum=0;
			for(int b=0;b<n;b++) {
				sum+=arr[b];
			}
			System.out.println("Sum of first "+n+" numbers is :- "+sum);
			}else {
				System.out.println("Number N exceeded the array length.");
			}
		}
	
		//Function to caculate largest number in an array.
		public static void largestNumber (int []arr) {
			
			int largestNum=arr[0];
			for(int c=0;c<arr.length;c++) {
				if(largestNum < arr[c]) {
					largestNum=arr[c];
				}	
			}
			System.out.println("Largest number is :- "+largestNum);
		}
		
		//Function to caculate smallest number in an array.
		public static void smallestNumber (int []arr) {
			
			int smallest=arr[0];
			for(int c=0;c<arr.length;c++) {
				if(smallest > arr[c]) {
					smallest=arr[c];
				}	
			}
			System.out.println("Largest number is :- "+smallest);
		}
		
		public static void rotateArray (int [] arr,int pos) {
			
			int n=pos%arr.length;
			System.out.println(n);
			int d=n+1;
			
			int []tmp1=new int[arr.length];
			int a=0;
			
			for( a=0;a<n;a++) {
				tmp1[a]=arr[d];
				d++;
				System.out.println(a);
			}
			
			for(int b=0;b<n+1;b++) {
				tmp1[a]=arr[b];
				System.out.println(a);
				a++;
			}
			
			printArray(tmp1);
		}
		
		public static void duplicatesInSortArray (int []arr) {
			int i=0;
			int j=0;
			int k=-1;
			while(j<arr.length-1) {
				j++;
				k++;
				if(arr[i]==arr[i+1]) {
					k--;
					removeAndShiftElements(arr,i+1);
					i--;
				}
				System.out.println(i);
				
				printArray(arr);
				System.out.println(k);
				i++;
				
			}
			//length of unique array=k;
		}
		public static void removeAndShiftElements(int[] arr, int ind) {
			arr[ind]=0;
			for(int d=ind;d<arr.length-1;d++) {
				arr[d]=arr[d+1];
			}
			arr[arr.length-1]=0;
		}
	
}
