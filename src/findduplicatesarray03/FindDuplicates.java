package findduplicatesarray03;

import java.util.Arrays;

public class FindDuplicates {

	public int duplicate (int[] list) {
		
		if(list.length == 1) {
			return 0;
		}
		
		Arrays.sort(list);
		
		for(int i = 0; i < list.length; i++) {
			if(list[i] == list[i+1] ) {
				return list[i];
			}
		}
		
		return 0;
		
		
	}
}
