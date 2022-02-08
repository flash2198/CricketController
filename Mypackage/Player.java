package Mypackage;

public class Player {
    private String playerName;
    public static Player of(String name){
        return new Player(name);
    }
    private Player(String playerName){
        this.playerName=playerName;
    }

    public String getPlayerName(){
        return playerName;
    }
}
