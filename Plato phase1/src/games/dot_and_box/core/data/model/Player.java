package games.dot_and_box.core.data.model;

public class Player implements Comparable<Player> {

    private String name;

    private int    numOfOwnedBoxes;


    public Player(String name) {
        setName(name);
    }


    @Override
    public String toString() {
        return getName() + " Score: " + getNumOfOwnedBoxes();
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getNumOfOwnedBoxes() {
        return numOfOwnedBoxes;
    }


    public void setNumOfOwnedBoxes(int numOfOwnedBoxes) {
        this.numOfOwnedBoxes = numOfOwnedBoxes;
    }


    @Override
    public int compareTo(Player p) {
        return this.getNumOfOwnedBoxes() - p.getNumOfOwnedBoxes();
    }
}
