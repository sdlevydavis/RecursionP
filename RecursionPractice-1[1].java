/*
 * PA39
 * Sydni-Noel Levy-Davis
 */
package sorting;

public class RecursionPractice 
{
    /**
     * Calculates value of a term in a Fibonacci sequence
     * Precondition: n > 0.
     * @param n an integer the represents the nth term in a sequence
     * @return the value of nth term in the Fibonacci sequence
     */
    public static int fib(int n)
    {
        if(n - 1 == 0)
            return 1;
        else if (n - 1 == 1)
            return 1;
        return fib(n-1) + fib(n-2);
    }
    
    /**
     * Calculates gcd of two integers
     * Precondition: neither integer parameters are 0.
     * @param a an integer 
     * @param b an integer
     * @return the gcd of the two numbers "a" and "b"
     */
    public static int gcd(int a, int b)
    {
        int rem = a % b;
        if (rem == 0)
            return b;
        return gcd(b,rem);
    }
    
    /**
     * Finds index of a value in an integer array
     * Precondition: array parameter is not null and is in ascending order
     * @param arr an array of integers
     * @param value an integer
     * @return an index in which "value" appears in the array ( -1 if it doesn't appear).
     */
    public static int binarySearch(int[] arr, int value)
    {
        int low = 0;
        int high = arr.length - 1;
        return binarySearch(arr, value, low, high);
    }
    
    /**
     * Finds index of a value in an integer array
     * Precondition: array parameter is not null and is in ascending order
     * @param arr an array of integers
     * @param value an integer
     * @param low initial lower bound of the array being searched
     * @param high initial upper bound of the array being searched 
     * @return an index in which "value" appears in the array ( -1 if it doesn't appear).
     */
    private static int binarySearch(int[] arr, int value, int low, int high)
    {   
        int median = (low + high) / 2;
        
        if (low > high)
            return -1;
        else if (arr[median] == value)
            return median; 
        else if (value > arr[median])
        {
            low = median + 1;
            return binarySearch(arr, value, low, high);   
        }
        else /*(value < arr[median])*/
        {
            high = median - 1;
            return binarySearch(arr, value, low, high);   
        } 
    }  
}
