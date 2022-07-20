public class InsertionSortAlgorithm extends Algorithm{
	
	public String toString()
    {
        return "Insertion Sort";
    }
    
    public int methodToTime(int [] x)
    {
    	for (int i = 0; i < x.length; i++) {
			int a = x[i];
			int position = i - 1;
			
			while (position >= 0 && x[position] > a) {
				x[position + 1] = x[position];
				position = position - 1;
			}
			x[position + 1] = a;
		}
    	
        return 0;
    }
}
