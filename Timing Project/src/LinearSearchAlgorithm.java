public class LinearSearchAlgorithm extends Algorithm{
	
	public String toString()
    {
        return "Linear Search";
    }
    
    public int methodToTime(int [] x, int target)
    {
    	for (int i = 0; i < x.length; i++) {
    		if (x[i] == target) {
    			return i;
    		}
    	}
		return -1;
    }
}
