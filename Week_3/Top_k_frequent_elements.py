# Create list of empty lists for bucktes: for frequencies 1, 2, ..., n.
# Use Counter to count frequencies of elements in nums
# Iterate over our Counter and add elements to corresponding buckets.
# buckets is list of lists now, create one big list out of it.
# Finally, take the k last elements from this list, these elements will be top K frequent elements.
class Solution:
    def topKFrequent(self, nums, k):
        bucket = [[] for _ in range(len(nums) + 1)]
        Count = Counter(nums).items()  
        for num, freq in Count: bucket[freq].append(num) 
        flat_list = list(chain(*bucket))
        return flat_list[::-1][:k]