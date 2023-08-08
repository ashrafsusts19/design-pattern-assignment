package assignment2.abstract_factory;


import assignment2.product.Obstacle;

public abstract class ObstacleFactory {
    public abstract Obstacle createObstacle(int score);
}
