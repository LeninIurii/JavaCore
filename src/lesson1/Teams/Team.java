package lesson1.Teams;


import lesson1.Animals.Cat;
import lesson1.Animals.Dog;
import lesson1.Obstacles.Obstacle;



public class Team {
    private String name;// название команды
    private Participant participants[] ;    // участники

    public Team(String name) {
        this.name = name;
    }

    public Team(String name,Participant ... participantsGiven ) {
        this.name = name;
        this.participants = participantsGiven;
    }

    public void getTeamInfo() {
        System.out.println("Команда: " + this.name );
        for (Participant participant : participants) {
            if (participant instanceof Dog) {
                System.out.println("Собака: " + participant.getName());
            }
            if (participant instanceof Cat) {
                System.out.println("Кот: " + participant.getName());
            }
            if (participant instanceof Robot) {
                System.out.println("Робот: " + participant.getName());
            }
        }
    }

    public void showResults(){
        for (Participant participant : participants) {
              if (!participant.isOnDistance()) {
                break;
            }
        }
    }
    public void doIt(Obstacle obstacle){
        for (Participant participant : participants) {
            obstacle.doIt(participant);

        }
    }



}