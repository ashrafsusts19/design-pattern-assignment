package assignment2.concrete_factory.SADP;

import assignment2.product.LabFinals.SADPLabFinal;
import assignment2.product.Obstacle;
import assignment2.product.Projects.SADPAssignment;
import assignment2.product.QuizTests.SADPQuiz;

public class Semester5SADPFactory extends SADPFactory{
    @Override
    public Obstacle createObstacle(int score) {
        if (score < 20230808){
            return new SADPLabFinal();
        }
        else if (score == 20230808){
            return new SADPQuiz();
        }
        else {
            return new SADPAssignment();
        }
    }
}
