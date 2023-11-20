//Creating the class of SoccerTeam
public class SoccerTeam {
    private static int numOfGames=0;
    private static int numOfGoals=0;
    int wins=0;
    int losses=0;
    int ties=0;
    //class initialization
    public SoccerTeam(){

    }
    //The method is used for comparing the scores for two teams and updating data.
    public void played(SoccerTeam other,int myScore,int otherScore){
        if(myScore>otherScore){
            wins++;
            other.losses++;
        }
        else if(myScore==otherScore){
            ties++;
            other.ties++;
        }
        else{
            losses++;
            other.wins++;
        }
        numOfGames++;
        numOfGoals+=myScore+otherScore;
    }
    //The method is used for returning current points.
    public int currentPoints(){
        return 3*wins+ties;
    }
    //Reset method
    public void reset(){
        wins=0;
        losses=0;
        ties=0;
    }
    //Reset the tournament data
    public static void startTournament(){
        numOfGames=0;
        numOfGoals=0;
    }
    //accessor method for number of games
    public static int getNumOfGames(){
        return numOfGames;
    }
    //accessor method for number of goals
    public static int getNumOfGoals(){
        return numOfGoals;
    }
}