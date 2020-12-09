package console.core.data.model;

public class Player {
    private String name;
    private int numOfOwnedBoxes;

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

    public int compareTo(Player p) {
        return this.getNumOfOwnedBoxes() - p.getNumOfOwnedBoxes();
    }
}
