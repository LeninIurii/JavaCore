package lesson1.Teams;

import lesson1.Animals.Cat;
import lesson1.Animals.Dog;
import lesson1.Obstacles.*;

    public class Application {

        public static void main(String[] args) {

            Course c = new Course(new Obstacle[] {
                    new Cross(8),
                    new Wall(9),
                    new Water(5)
            }); // Создаем полосу препятствий
            Team team = new Team("Фарш",
                    new Cat("Пушыстый", 10, 12, 0),
                    new Dog("Гавкер", 20, 5, 15),
                    new Cat("Мяукер", 9, 14, 0),
                    new Robot("Гайка", 50, 50, 50));  // Создаем команду
            team.getTeamInfo();

            c.doIt(team);               // Просим команду пройти полосу
            team.showResults();         // Показываем результаты

        }
    }

