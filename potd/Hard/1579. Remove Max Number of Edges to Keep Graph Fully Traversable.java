class Solution {
    public int maxNumEdgesToRemove(int n, int[][] edges) {
        UnionFind alice = new UnionFind(n);
        UnionFind bob = new UnionFind(n);

        
        int edgesRequired = 0;
        for(int[] edge : edges) {
            if(edge[0]==3) {
                edgesRequired+= (alice.preformUnion(edge[1], edge[2]) | bob.preformUnion(edge[1], edge[2]));
            }
        }

        for(int[] edge : edges) {
            if(edge[0]==2) {
                edgesRequired += bob.preformUnion(edge[1], edge[2]);
            } else if(edge[0]==1) {
                edgesRequired += alice.preformUnion(edge[1], edge[2]);
            }
        }

        if(alice.isConnected() && bob.isConnected()) {
            return edges.length - edgesRequired;
        }

        return -1;

    }

    class UnionFind {

        int[] representative;
        int[] componentSize;
        int components;

        UnionFind(int n) {
            components = n;
            representative = new int[n+1];
            componentSize = new int[n+1];

            for(int i=0;i<=n;i++) {
                representative[i] = i;
                componentSize[i] = i;
            }
        }

        int findRepresentative(int x) {
            if(representative[x] == x) {
                return x;
            }

            return representative[x] = findRepresentative(representative[x]);
        }

        int preformUnion(int x, int y) {
            x = findRepresentative(x); y = findRepresentative(y);

            if(x==y) {
                return 0;
            }

            if(componentSize[x]>componentSize[y]) {
                componentSize[x]+=componentSize[y];
                representative[y] = x;
            } else {
                componentSize[y]+=componentSize[x];
                representative[x] = y;
            }

            components--;
            return 1;
        }

        boolean isConnected() {
            return components==1;
        }
    }    
}
