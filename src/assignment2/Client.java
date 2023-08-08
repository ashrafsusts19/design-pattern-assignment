package assignment2;

import assignment2.abstract_factory.ObstacleFactory;
import assignment2.concrete_factory.AI.Semester5AIFactory;
import assignment2.concrete_factory.SADP.Semester5SADPFactory;
import assignment2.product.Obstacle;

public class Client {
    public static void main(String[] args) {
        int score = 20230725;
        ObstacleFactory factory = new Semester5SADPFactory();
        Obstacle obstacle = factory.createObstacle(score);
        obstacle.show();
        score = 20230808;
        obstacle = factory.createObstacle(score);
        obstacle.show();
        score = 20230809;
        obstacle = factory.createObstacle(score);
        obstacle.show();
        factory = new Semester5AIFactory();
        obstacle = factory.createObstacle(score);
        obstacle.show();
    }
}
