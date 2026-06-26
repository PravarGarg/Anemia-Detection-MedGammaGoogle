class Solution {

    public static void disjointSet(List<Integer> parent, List<Integer> rank, int n)
    {
        for(int i = 0; i < n; i++)
        {
            parent.add(i);
            rank.add(n);
        }

        return;
    }

    public static int 

    public int[] findRedundantConnection(int[][] edges) {

        // example input - [[1, 2], [1, 3], [2, 3]]

        List<Integer> parent = new ArrayList<>();
        List<Integer> rank = new ArrayList<>();

        disjointSet(parent, rank, edges.length);


    }
}