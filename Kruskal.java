#include <stdio.h>

#define V 5
#define E 7

struct Edge {
    int src, dest, weight;
};

int find(int parent[], int i) {
    while(parent[i])
        i = parent[i];
    return i;
}

void unionSet(int parent[], int u, int v) {
    parent[v] = u;
}

void kruskal() {
    struct Edge edges[E] = {
        {0,1,2},{0,3,6},{1,2,3},
        {1,3,8},{1,4,5},{2,4,7},{3,4,9}
    };

    int parent[V] = {0};

    printf("\nKruskal's MST:\n");

    for(int i = 0; i < E; i++) {
        int u = find(parent, edges[i].src);
        int v = find(parent, edges[i].dest);

        if(u != v) {
            printf("%d - %d = %d\n", edges[i].src, edges[i].dest, edges[i].weight);
            unionSet(parent, u, v);
        }
    }
}
