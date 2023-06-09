package simulator.algorithms;

import simulator.*;
import java.util.*;

public class BFS implements Algo{

    public Coords nextMove(Grid grid, Coords initial, Coords goal, int visRadius){
        return breadthFirstSearch(grid, initial, goal, visRadius);
    }

    public Coords breadthFirstSearch(Grid grid, Coords initial, Coords goal, int visRadius){
        boolean[][] visited = new boolean [grid.world.length][grid.world[0].length];
        Queue<Coords> frontier = new LinkedList<>();
        Map<Coords, Coords> parents = new HashMap<>();

        visited[initial.x][initial.y] = true;
        frontier.add(initial);
        parents.put(initial, null);

        while(!frontier.isEmpty()){
            
            Coords curr = frontier.remove();
            // Goal was found
            if (curr.equals(goal)) {
                List<Coords> path = new ArrayList<>();
                while (curr != null) {
                    path.add(curr);
                    curr = parents.get(curr);
                }

                // Return back the position after the initial location
                return path.get(path.size() - 2);
            }

            for(int dx = -1; dx <= 1; dx ++){
                for(int dy = -1; dy <= 1; dy ++){
                    if (dx == 0 && dy == 0) continue;

                    int xf = curr.x + dx, yf = curr.y + dy;
                    if(inBounds(grid, visited, initial, visRadius, xf, yf)){
                        Coords next = new Coords(xf, yf);
                        frontier.add(next);
                        parents.put(next, curr);
                        visited[next.x][next.y] = true;
                    }
                }
            }
        }

        // Means goal wasn't found
        return new Coords(initial.x, initial.y);
    }

    // BFS Ignores rubble since there is no heuristic involved
    public boolean inBounds(Grid grid, boolean[][] visited, Coords initial, int visRadius, int x, int y){
        // Check if in range of the grid
        if (x < 0 || y < 0 || x >= grid.world.length || y >= grid.world[0].length) {
            return false;
        }

        // Check if has been visited or is traversalable
        if (visited[x][y] || grid.getLocation(x, y).getType() == LocationType.OBSTACLE) {
            return false;
        }

        // Check if in vision range
        double euclidean = Math.sqrt(Math.pow((x - initial.x), 2) + Math.pow((y - initial.y), 2));
        if (euclidean > visRadius) {
            return false;
        }

        return true;
    }
}
