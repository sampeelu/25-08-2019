import java.util.Arrays;

public class Sorting {

	 public static void main(String[] args) {
		System.out.println(Arrays.toString(Sorting.bubbleSort(new int[] {3,2,0,45,65,0,6,78,21,18,19,12,32,33,03,87})));
		System.out.println(Arrays.toString(Sorting.selectionSort(new int[] {3,2,0,45,65,0,6,78,21,18,19,12,32,33,03,87})));
	}
	public static int[] bubbleSort(int[] arrInt) {
		for(int i = 0;i<arrInt.length-1;i++) {
			for(int j=0;j<arrInt.length-1-i;j++) {
				if(arrInt[j]>arrInt[j+1]) {
					int temp = arrInt[j];
					arrInt[j]=arrInt[j+1];
					arrInt[j+1]=temp;
				}
			}
			
		}
		return arrInt;
	}
	
	public static int[] selectionSort(int[] arrInt) {
		for(int i=0;i<arrInt.length-1;i++) {
			int minPos=i;
			for(int j = i+1;j<arrInt.length;j++) {
				if(arrInt[j]<arrInt[minPos]) {
					minPos=j;
				}
			}
			int temp = arrInt[i];
			arrInt[i]=arrInt[minPos];
			arrInt[minPos]=temp;
	}
		return arrInt;
	}	
	
	
	
	
	
	
	
	
}
