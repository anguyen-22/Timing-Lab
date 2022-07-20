public class TimingLab
{
    public static void main(String [] args)
    {
    	//Algorithm min = new getMinAlgorithm();
    	//timeAlgorithm(min, 28, false);
    	
    	//Algorithm sort = new IsSortedAlgorithm();
    	//timeAlgorithm(sort, 28, true);
    	
    	//Algorithm sortAvg = new IsSortedAlgorithm();
    	//timeAlgorithm(sortAvg, 28, false);
    	
        //Algorithm select = new SelectionSortAlgorithm();
        //timeAlgorithm(select, 28, false);
        
        //Algorithm insertBest = new InsertionSortAlgorithm();
        //timeAlgorithm(insertBest, 28, true);
        
        //Algorithm insertAvg = new InsertionSortAlgorithm();
        //timeAlgorithm(insertAvg, 28, false);
        
        //Algorithm linear = new LinearSearchAlgorithm();
        //timeAlgorithm(linear, 28, false);
        
        //Algorithm binary = new BinarySearchAlgorithm();
        //timeAlgorithm(binary, 28, true);
    	
    	Algorithm merge = new MergeSortAlgorithm();
    	timeAlgorithm(merge,28,false);
    }
    
    //prints out the times for the given algorithm up to the given exponent (2^maxExp)
    //where the input array is sorted or unsorted
    public static void timeAlgorithm(Algorithm alg, int maxExp, boolean useSortedArray)
    {
        System.out.println("---Timing " + alg.toString() + "---");
        for (int exp = 1; exp <= maxExp; exp++) {
        	int length = (int) Math.pow(2, exp);
        	
        	long totalTime = 0;
        	for (int t = 0; t < 3; t++) {
        		int [] x;
        		if (useSortedArray) {
        			x = makeSortedArray(length);
        		}
        		else {
        			x = makeRandomArray(length);
        		}
        		long startTime = System.currentTimeMillis();
            	alg.methodToTime(x);
            	long endTime = System.currentTimeMillis();
            	totalTime += (endTime - startTime);
        	}
        	
        	System.out.println(length + ", " + totalTime / 3);
        }
    }
    
    //TODO:  write this method
    public static int [] makeSortedArray(int length)
    {
        int [] x = new int[length];
        x[0] = Integer.MIN_VALUE;
        for (int i = 1; i < x.length; i++) {
        	x[i] = x[i - 1] + (int) (Math.random() * 5);
        }
        return x;
    }
    
    public static int [] makeRandomArray(int length)
    {
        int [] ret = new int[length];
        for (int i = 0; i < ret.length; i++)
        {
            ret[i] = (int) (Math.random() * Integer.MAX_VALUE);
        }
        return ret;
    }
}
