package lesson1.Obstacles;
import lesson1.Teams.Participant;


public class Wall extends Obstacle {
    private int height;
    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Participant participant) {
        participant.jump(height);
    }
}