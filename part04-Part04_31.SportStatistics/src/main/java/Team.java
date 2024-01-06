public class Team {
    private String homeTeam;
    private String awayTeam;
    private int homeScore;
    private int awayScore;
    private int game;
    private int win;
    private int lose;

    public Team(String homeTeam, String awayTeam, int homeScore, int awayScore){
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
    }

    public String getHomeTeam() {
        return homeTeam;
    }


    public String getAwayTeam() {
        return awayTeam;
    }


    public int getHomeScore() {
        return homeScore;
    }


    public int getAwayScore() {
        return awayScore;
    }

    public int getWin() {
        return win;
    }

    public int setWin() {
        return this.win++;
    }

    public int getLose() {
        return lose;
    }

    public int setLose() {
        return this.lose++;
    }

    public int gamePlayed(){
        return this.game++;
    };

}
