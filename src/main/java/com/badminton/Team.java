package com.badminton;

public class Team {

    private String teamName;
    public String getTeamName()
    {
        return teamName;
    }

    public void setTeamName(String teamName) {

        this.teamName = teamName;
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamName='" + teamName + '\'' +
                ", teamPlayer='" + teamPlayer + '\'' +
                '}';
    }

    private String teamPlayer;
    public String getTeamPlayer() {
        return teamPlayer;
    }

        public void setTeamPlayer(String teamPlayer) {
        this.teamPlayer = teamPlayer;
          }



         public Team(String teamName) {
        this.teamName = teamName;
                    }
}
