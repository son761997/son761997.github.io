public class hw2 {
    static int findMax(int[] array) {
       int max = array[0];
		for(int i=1;i<array.length;i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		return max;
    }
    static int findMin(int[] array) {
		int min = array[0];
		for(int i=1;i<array.length;i++) {
			if(min > array[i]) {
				min = array[i];
			}
		}
		return min;
	}
}
