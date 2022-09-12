package lesson1.Obstacles;


import lesson1.Teams.Participant;

public class Water extends Obstacle {
    private int length;
    public Water(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Participant participant) {
        participant.swim(length);
    }
}