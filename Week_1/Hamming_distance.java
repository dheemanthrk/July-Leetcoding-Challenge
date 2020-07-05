class Solution {
    public int hammingDistance(int x, int y) {
        String str = Integer.toBinaryString(x^y);
        return str.replaceAll("0","").length();
    }
}
