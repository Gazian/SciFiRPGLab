package battlezones;


import java.util.ArrayList;

public abstract class BattleZone {

    private String name;
    private ArrayList<Object> roomContains;

    public BattleZone(String name){
        this.name = name;
        this.roomContains = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public ArrayList getRoomContains(){
        return this.roomContains;

    }

    public void addToRoom(Object enemy){
        roomContains.add(enemy);
    }
}
