public class BinarySearchAlgorithm extends Algorithm{
	
	public String toString()
    {
        return "Binary Search";
    }
    
    public int methodToTime(int [] x, int target)
    {
    	int start = 0;
		int end = x.length;
		
		while (start < end) {
			
			try {
				Thread.sleep(1);
			}
			catch(Exception e) {
				
			}
			
			int middle = start + (end - start) / 2;
			
			if (target == x[middle]) {
				return middle;
			}
			if (target < x[middle]) {
				end = middle;
			}
			if (target > x[middle]) {
				start = middle + 1;
			}
		}
		return -1;
    }
    
}
