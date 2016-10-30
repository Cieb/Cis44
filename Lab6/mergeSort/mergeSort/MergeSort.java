package mergeSort;

public class  MergeSort {
	
	public static <T extends Comparable<? super T>> void mergeSort(T[] a, int first, int last){
		@SuppressWarnings("unchecked")
		T[] tempArray = (T[])new Comparable<?>[a.length];
		mergeSort(a, tempArray, first,last);
		
	}
	private static  <T extends Comparable<? super T>> void mergeSort(T[] a, T[] tempArray, int first, int last){
		if(first < last){
			int mid = a.length/2;
			mergeSort(a, first, mid);
			mergeSort(a, mid + 1, last);
			merge(a,tempArray, first, mid, last);
		}
		
	}
	 public static  <T extends Comparable<? super T>> void merge(T[] a,T[] tempArray, int first,int mid, int last){
		 int beginHalf1 = first;
		 int endHalf1 = mid;
		 int beginHalf2 = mid + 1;
		 int endHalf2 = last;
		 
		 int index = 0;
		 while(beginHalf1 <= endHalf1 && beginHalf2 <= endHalf2){
			 if(a[beginHalf1].compareTo(a[beginHalf2]) <= 0){
				 tempArray[index] =  a[beginHalf1];
				 beginHalf1++;
			 }else{
				 tempArray[index] = a[beginHalf2];
				 beginHalf2++;
			 }
			 index++;
			 
		 }
		
	}

	public static void main(String[] args) {
		Integer[] a = new Integer[5];
		a[0] = 4;
		a[1] = 6;
		a[2] = 2;
		a[3] =5;
		a[4] = 9;
		
		mergeSort(a, 0,4);
		System.out.println(a);
		
	}

}
