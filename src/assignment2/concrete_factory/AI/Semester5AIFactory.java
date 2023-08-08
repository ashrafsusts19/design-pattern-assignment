package assignment2.concrete_factory.AI;

import assignment2.product.LabFinals.AILabFinal;
import assignment2.product.Obstacle;

public class Semester5AIFactory extends AIFactory{
    @Override
    public Obstacle createObstacle(int score) {
        return new AILabFinal();
    }
}
