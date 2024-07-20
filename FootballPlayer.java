public class FootballPlayer extends Player{

    @Override
    void nameOfPlayer() {
        System.out.println("Name - Cristiano Ronaldo");
    }

    @Override
    void sportType() {
        System.out.println("Sport type - Football");
    }

    @Override
    void numberPosition() {
        System.out.println("Number position - 7");
    }

    @Override
    void teamName() {
        System.out.println("Team name - Al-Nassr FC");
    }

    void countOfRedCard(){
        System.out.println("Count of RED card - 0");
    }
    void countOfYellowCard(){
        System.out.println("Count of YELLOW card - 1");
    }
    void countOfGoals(){
        System.out.println("Count of GOALS - 7");
    }

    public static void main(String[] args) {
        FootballPlayer footballPlayer = new FootballPlayer();
        footballPlayer.nameOfPlayer();
        footballPlayer.sportType();
        footballPlayer.numberPosition();
        footballPlayer.teamName();
        footballPlayer.countOfRedCard();
        footballPlayer.countOfYellowCard();
        footballPlayer.countOfGoals();

    }
}
