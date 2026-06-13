#include <stdio.h>
#include <limits.h>

#define V 5

int minDistance(int dist[], int visited[]) {
    int min = INT_MAX, index;

    for(int i = 0; i < V; i++) {
        if(!visited[i] && dist[i] <= min) {
            min = dist[i];
            index = i;
        }
    }
    return index;
}

void dijkstra() {
    int graph[V][V] = {
        {0, 10, 0, 0, 5},
        {0, 0, 1, 0, 2},
        {0, 0, 0, 4, 0},
        {7, 0, 6, 0, 0},
        {0, 3, 9, 2, 0}
    };

    int dist[V], visited[V] = {0};

    for(int i = 0; i < V; i++)
        dist[i] = INT_MAX;

    dist[0] = 0;

    for(int count = 0; count < V-1; count++) {
        int u = minDistance(dist, visited);
        visited[u] = 1;

        for(int v = 0; v < V; v++) {
            if(!visited[v] && graph[u][v] && dist[u] != INT_MAX &&
               dist[u] + graph[u][v] < dist[v]) {
                dist[v] = dist[u] + graph[u][v];
            }
        }
    }

    printf("\nShortest distances from source:\n");
    for(int i = 0; i < V; i++)
        printf("Vertex %d -> %d\n", i, dist[i]);
}
