package simulator.src;

import java.util.Random;

public class Grid {
    GridLocation[][] world;

    final int OBSTACLE_COST = 10000;
    final int MAX_SIZE = 25;
    final int MIN_SIZE = 5;
    final double MAX_RUBBLE = 100;
    final double MIN_RUBBLE = 1;

    public Grid(long seed) {
        Random rng = new Random(seed);
        int rows = rng.nextInt(MAX_SIZE - MIN_SIZE) + MIN_SIZE;
        int columns = rng.nextInt(MAX_SIZE - MIN_SIZE) + MIN_SIZE;
        this.world = new GridLocation[rows][columns];

        // Set agent location
        int agentX = rng.nextInt(rows);
        int agentY = rng.nextInt(columns);
        this.world[agentX][agentY] = new GridLocation(LocationType.AGENT, 0);

        // Set goal location (could generate same location as agent)
        int goalX = rng.nextInt(rows);
        int goalY = rng.nextInt(columns);
        this.world[goalX][goalY] = new GridLocation(LocationType.GOAL, 0);
        
        LocationType[] options = {LocationType.EMPTY, LocationType.OBSTACLE, LocationType.RUBBLE};
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (this.world[i][j] == null) {
                    LocationType type = options[rng.nextInt(options.length)];
                    switch (type) {
                        case OBSTACLE:
                            this.world[i][j] = new GridLocation(type, OBSTACLE_COST);
                            break;
                        case RUBBLE:
                            this.world[i][j] = new GridLocation(
                                type, MIN_RUBBLE + rng.nextDouble() * (MAX_RUBBLE - MIN_RUBBLE)
                            );
                            break;
                        default: // ONLY EMPTY SHOULD MAKE IT HERE
                            this.world[i][j] = new GridLocation(type, 0);
                    }
                }
            }
        }

    }

    public GridLocation getLocation(int x, int y) {
        return world[x][y];
    }

    public void setLocation(int x, int y, GridLocation location) {
        this.world[x][y] = location;
    }
}