class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList();
        List<Integer> list = new ArrayList();
        dfs(graph, 0, graph.length - 1, list, result);
        return result;
    }
    
    private void dfs(int[][] graph, int source, int destination, List<Integer> list, List<List<Integer>> result) {
        if(source == destination) result.add(list); // if soruce reached destination add that path in result
        list.add(source); // add current vertex
        for(Integer vertex : graph[source]) {
            List<Integer> copyList = new ArrayList<>(list); // clone the path
            dfs(graph, vertex, destination, copyList, result);
        }
    }
}