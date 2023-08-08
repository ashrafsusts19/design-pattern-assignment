package assignment2.concrete_factory.WebTech;

import assignment2.abstract_factory.ObstacleFactory;
import assignment2.product.Obstacle;
import assignment2.product.Projects.WebTechProject;
import assignment2.product.QuizTests.WebTechQuiz;

public class Semester5WebTech extends WebTechFactory {

    @Override
    public Obstacle createObstacle(int score) {
        if (score < 20230726){
            return new WebTechProject();
        }
        else {
            return new WebTechQuiz();
        }
    }
}
