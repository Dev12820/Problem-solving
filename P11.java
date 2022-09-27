public class P11 {
    

//User function Template for Java

class Solution
{
    //Function to find the first position with different bits.
    public static int posOfRightMostDiffBit(int m, int n)
    {
            
        // Your code here        
        int temp = m ^ n;
        
        // after doing xor operation now task is to find right most set bit, bcz equal bits become 0 in xor
        int ans = 1;
        while(temp > 0){
            // if odd number means last bit is set
            if(temp % 2 != 0)
                return ans;
            
            temp = temp >> 1;
            ans++;
        }
        
        return -1;
    }
}

}
