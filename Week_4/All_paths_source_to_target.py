class Solution:
    def allPathsSourceTarget(self, graph: List[List[int]]) -> List[List[int]]:
        paths, stack =[], [[0]]
        while stack:
            current = stack.pop()
            if current[-1] == len(graph) - 1:
                paths.append(current)
            for node in graph[current[-1]]:
                stack.append(current + [node])
        return paths