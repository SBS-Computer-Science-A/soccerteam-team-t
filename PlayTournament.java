//Our team includes Tom He and Tony Wang. The program is for testing the SoccerTeam class
//Tom is in charge of writing the SoccerTeam class, Tony is in charge of checking and writing the PlayTournament class
public class PlayTournament {
    public static void main(String[] args){
        SoccerTeam a=new SoccerTeam();
        SoccerTeam b=new SoccerTeam();
        SoccerTeam c=new SoccerTeam();
        SoccerTeam d=new SoccerTeam();
        a.played(b,3,8);
        a.played(c,5,3);
        a.played(d,2,1);
        b.played(c,1,0);
        b.played(d,3,2);
        c.played(b,3,8);
        System.out.println("The point for team A is "+a.currentPoints());
        System.out.println("The point for team B is "+b.currentPoints());
        System.out.println("The point for team C is "+c.currentPoints());
        System.out.println("The point for team D is "+d.currentPoints());
        System.out.println("The total number of games played is "+SoccerTeam.getNumOfGames());
        System.out.println("The total number of goals scored by all teams is "+SoccerTeam.getNumOfGoals());
        //Reset for the new tournament.
        a.reset();
        b.reset();
        c.reset();
        d.reset();
        SoccerTeam.startTournament();
        System.out.println("The new tournament begins.");
        a.played(b,5,1);
        a.played(c,3,3);
        a.played(d,4,4);
        b.played(c,0,5);
        b.played(d,3,1);
        c.played(b,2,2);
        a.played(b,3,2);
        b.played(d,9,9);
        System.out.println("The point for team A is "+a.currentPoints());
        System.out.println("The point for team B is "+b.currentPoints());
        System.out.println("The point for team C is "+c.currentPoints());
        System.out.println("The point for team D is "+d.currentPoints());
        System.out.println("The total number of games played is "+SoccerTeam.getNumOfGames());
        System.out.println("The total number of goals scored by all teams is "+SoccerTeam.getNumOfGoals());
    }
}