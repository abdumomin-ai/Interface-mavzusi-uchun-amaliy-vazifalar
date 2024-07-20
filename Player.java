public abstract class Player implements Information{

    @Override
    public void getInfo() {
        System.out.println("O'yinchi haqida ma'lumot");
    }

    @Override
    public void getTeamName() {
        System.out.println("Jamoaning nomi 'Kelajak'");
    }

    abstract void nameOfPlayer();
    abstract void sportType();
    abstract void numberPosition();
    abstract void teamName();

}
