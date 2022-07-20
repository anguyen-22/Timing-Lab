public class IsSortedAlgorithm extends Algorithm {
	
	public String toString()
    {
        return "Is Sorted";
    }
    
    public int methodToTime(int [] x)
    {
    	for (int i = 0; i < x.length - 1; i++) {
    		if (x[i] > x[i + 1]) {
    			return 0;
    		}
    	}
    	return 1;
    }

}
