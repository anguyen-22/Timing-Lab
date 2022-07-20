public class MergeSortAlgorithm extends Algorithm{
	 public String toString()
	    {
	        return "Merge Sort";
	    }
	    
	    public int methodToTime(int [] x)
	    {
	    	int [] stor = new int[x.length];
			mergeHelper(x, 0, x.length, stor);
	    	return 0;
	    }
	    
	    public static void mergeHelper(int[] x, int start, int end, int[] storage) {
			if (end - start <= 1) {
				return;
			}
			
			int mid = start + (end - start) / 2;
			
			mergeHelper(x, start, mid, storage);
			mergeHelper(x, mid, end, storage);
			
			int[] temp = merge(x, start, mid, end, storage);
			
			for (int i = start; i < end; i++) {
				x[i] = temp[i];
			}
		}
		
		public static int[] merge (int[] x, int start, int mid, int end, int[] storage) {
			int aRead = start;
			int bRead = mid;
			int rWrite = start;
			while (aRead < mid && bRead < end) { 
				if (x[aRead] < x[bRead])  {
					storage[rWrite] = x[aRead];
					aRead++;
					rWrite++;
				}
				else {
					storage[rWrite] = x[bRead];
					bRead++;
					rWrite++;
				}
			}
			if (aRead < mid) {
				while (aRead < mid) {
					storage[rWrite] = x[aRead];
					rWrite++;
					aRead++;
				}
			}
			else {
				while (bRead < end) {
					storage[rWrite] = x[bRead];
					rWrite++;
					bRead++;
				}
			}
			return storage;
		}
}
