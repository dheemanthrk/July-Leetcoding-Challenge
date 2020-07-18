class Solution:
    def findOrder(self, numCourses, prerequisites):
        self.adj_dict = defaultdict(set)
        for i, j in prerequisites:
            self.adj_dict[i].add(j)

        self.Visited = [0] * numCourses
        self.Ans, self.FoundCycle = [], 0
        
        for i in range(numCourses):
            if self.FoundCycle == 1: break      # early stop if the loop is found
            if self.Visited[i] == 0:
                self.dfs(i)
     
        return [] if self.FoundCycle == 1 else self.Ans

    def dfs(self, start):
        if self.FoundCycle == 1:   return      
        if self.Visited[start] == 1:
            self.FoundCycle = 1               
        if self.Visited[start] == 0:         
            self.Visited[start] = 1            
            for neib in self.adj_dict[start]:  
                self.dfs(neib)
            self.Visited[start] = 2             
            self.Ans.append(start)  
        