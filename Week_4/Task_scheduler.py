class Solution:
    def leastInterval(self, tasks: List[str], k: int) -> int:
        n = len(tasks)
        freq = [0] * 26
        
        for i in range(n):
            freq[self.cnum(tasks[i])] += 1
        freq.sort()
        maxfreq = freq[25]
        maxcount = freq.count(maxfreq)
                
        slots = (maxfreq-1) * k
        occupied = (maxcount-1) * (maxfreq-1)
        occupied += (n-maxcount*maxfreq)
        slots = max(0, slots-occupied) 
        
        return n + slots
        
    def cnum(self, char):
        return ord(char) - ord('A')