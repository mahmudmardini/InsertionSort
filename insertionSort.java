package insertionSort;

public class insertionSort {

	public static void main(String[] args) {

		int[] a = {4,1,5,6,12,1,8};
		
		int i,j,key;
		for(i=1;i<a.length;i++) {
			key = a[i];
			j = i-1;
			
			while(j>=0 && a[j]<key) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = key;
		}
		
		for(i=0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
	}

}
