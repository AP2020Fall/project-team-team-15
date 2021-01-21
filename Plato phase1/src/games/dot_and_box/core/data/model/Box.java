package games.dot_and_box.core.data.model;

public interface Box {
    Player getOwner();
    Player getTop();


    Player getBottom();

    Player getLeft();


    Player getRight();



    boolean setTop(Player top);


    boolean setBottom(Player bottom);


    boolean setLeft(Player left);


    boolean setRight(Player right);
}
