package findduplicatesarray03;

public class MainApplicationDuplicates {

	
	/*
	 * Find a duplicate in an array 
	 * The problem is that we want to find duplicates in a T[] one-dimensional array of integers in O(N) running 
	 * time where the integer values are smaller than the length of the array!
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,4,1};
		
		FindDuplicates fd = new FindDuplicates();
		System.out.println(fd.duplicate(arr));

	}

}
