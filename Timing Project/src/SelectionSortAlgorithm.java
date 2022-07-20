public class SelectionSortAlgorithm extends Algorithm {
	
	public String toString()
    {
        return "Selection Sort";
    }
    
    public int methodToTime(int [] x)
    {
    	for (int i = 0; i < x.length - 1; i++) {
            int minIndex = i;
            
            for (int j = i+1; j < x.length; j++) {
                if (x[j] < x[minIndex]) {
                	minIndex = j;
                }
            }
            
            int min = x[minIndex];
            x[minIndex] = x[i];
            x[i] = min;
        }
        return 0;
    }
	
}
