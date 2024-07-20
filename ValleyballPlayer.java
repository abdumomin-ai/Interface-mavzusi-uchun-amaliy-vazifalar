public class ValleyballPlayer extends Player{
    @Override
    void nameOfPlayer() {
        System.out.println("Name - Maksim Mikhaylov");
    }

    @Override
    void sportType() {
        System.out.println("Sport type - Volleyball");
    }

    @Override
    void numberPosition() {
        System.out.println("Number position - 17");
    }

    @Override
    void teamName() {
        System.out.println("Team name - Zenit Kazan");
    }
    void numberOfPoints(){
        System.out.println("Count of PPOINTS - 14");
    }

    public static void main(String[] args) {
        ValleyballPlayer valleyballPlayer = new ValleyballPlayer();
        valleyballPlayer.nameOfPlayer();
        valleyballPlayer.sportType();
        valleyballPlayer.numberPosition();
        valleyballPlayer.teamName();
        valleyballPlayer.numberOfPoints();
    }
}
