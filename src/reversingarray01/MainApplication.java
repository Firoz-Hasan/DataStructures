package reversingarray01;


public class MainApplication {


	/*
	 * Question #1 : Array
	   The problem is that we want to reverse a T[] array in O(N) linear time complexity 
	   and we want the algorithm to be in-place as well!
	   For example: input is [1,2,3,4,5] then the output is [5,4,3,2,1]
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1,2,3, 4, 5};
		
		ReverseArray reverseArray = new ReverseArray();
		int[] reversed = reverseArray.reverseArray(array);
		

		for (int i : reversed) {
			System.out.print(i+" ");
		}
//		
		
//		  makeArray obj[] = new makeArray[10];
//	        for (int i = 0; i < obj.length; i++) {
//	            obj[i] = new makeArray();
//	            obj[i].display();
//	        }

}
}
