public class getMinAlgorithm extends Algorithm{
	
	public String toString()
    {
        return "Get Min";
    }
    
    public int methodToTime(int [] x)
    {
    	int min = x[0];
    	for (int i = 0; i < x.length; i++) {
    		if (min > x[i]) {
    			min = x[i];
    		}
    	}
    	return min;
    }
    
}
