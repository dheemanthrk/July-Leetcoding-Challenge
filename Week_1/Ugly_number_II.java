class Solution {
    public int nthUglyNumber(int n) {
        if (n <= 0) return 0;
        List<Integer> ugly = new ArrayList<Integer>();
        ugly.add(1);

        int twoIndex = 0;
        int threeIndex = 0;
        int fiveIndex = 0;

        while (ugly.size() < n) {
            int by2 = ugly.get(twoIndex) * 2;
            int by3 = ugly.get(threeIndex) * 3;
            int by5 = ugly.get(fiveIndex) * 5;

            int min = Math.min(by2, Math.min(by3, by5));
            ugly.add(min);

            if (min == by2) twoIndex++;
            if (min == by3) threeIndex++;
            if (min == by5) fiveIndex++;
        }

        return ugly.get(ugly.size() - 1);
    }
}
