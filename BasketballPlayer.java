public class BasketballPlayer extends Player{
    @Override
    void nameOfPlayer() {
        System.out.println("LeBron James");
    }

    @Override
    void sportType() {
        System.out.println("Basketball");
    }

    @Override
    void numberPosition() {
        System.out.println("23");
    }

    @Override
    void teamName() {
        System.out.println("Los Angeles Lakers");
    }
    void numberOfGoals(){
        System.out.println("142");
    }

    public static void main(String[] args) {
        BasketballPlayer basketballPlayer = new BasketballPlayer();
        basketballPlayer.nameOfPlayer();
        basketballPlayer.sportType();
        basketballPlayer.numberPosition();
        basketballPlayer.teamName();
        basketballPlayer.numberOfGoals();
    }
}
