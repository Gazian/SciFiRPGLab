package characters;

public abstract class Character {
    private String name;
    private int health;

    public Character(String name, int health){
        this.name = name;
        this.health = health;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getHealth(){
        return this.health;
    }
}
