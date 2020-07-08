package reversingarray01;

public class ReverseArray {

	public int[] reverseArray(int[] num) {
		
		
		int startIndex = 0;
		int endIndex = num.length-1;
		
		while (endIndex > startIndex) {
			swap(num, startIndex, endIndex);
		
		
		startIndex++;
		endIndex--;
		}
		return num;
			
	}

	private void swap(int[] num, int startIndex, int endIndex) {
		int temp = num[startIndex];
		num[startIndex] = num[endIndex];
		num[endIndex]=temp;
		
	}
}
