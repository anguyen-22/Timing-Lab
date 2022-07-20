
/**
 * A generic class for timing an algorithm
 */
public class Algorithm
{
    public String toString()
    {
        return "Generic Algorithm";
    }
    
    public int methodToTime(int [] x)
    {
        return methodToTime(x, (int) (Math.random() * Integer.MAX_VALUE));
    }
    
    public int methodToTime(int [] x, int target)
    {
        return 0;
    }
}
