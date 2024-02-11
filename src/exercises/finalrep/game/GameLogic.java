package exercises.finalrep.game;

public class GameLogic {
    private Team firstTeam;
    private Team secondTeam;

    public GameLogic(Team firstTeam, Team secondTeam) {
        this.firstTeam = firstTeam;
        this.secondTeam = secondTeam;
    }

    private void turn(){
        double calcAtt = secondTeam.getTotalDeff() - firstTeam.getTotalAtt();
        if(calcAtt < 0){
            secondTeam.setTotalHp(secondTeam.getTotalHp() - calcAtt);
        }
        double calcAtt2 = firstTeam.getTotalDeff() - secondTeam.getTotalAtt();
        if(calcAtt2 < 0){
            firstTeam.setTotalHp(firstTeam.getTotalHp()- calcAtt2);
        }
    };
    private Team checkWinner(){
        if(firstTeam.getTotalHp() > secondTeam.getTotalHp()){
            return firstTeam;
        }
        return secondTeam;
    }
    public void game(){
        if(firstTeam.getTotalHp() == secondTeam.getTotalHp()){
            System.out.println("Pojedynek zakończył się remisem");
        }
        else {
            turn();
            Team winner = checkWinner();
            System.out.println("Wygranym jest drużyna "+ winner);
        }
    }

}
