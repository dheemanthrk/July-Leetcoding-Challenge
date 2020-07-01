class Solution{
    public int arrange(int n){
        long N = (long)N*8+1;
        return ((int)Math.sqrt(N)-1)/2;
    }
}