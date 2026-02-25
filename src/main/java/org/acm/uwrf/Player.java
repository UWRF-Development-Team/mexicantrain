package org.acm.uwrf;
import java.util.ArrayList;

public class Player {
    public ArrayList<Dominoes> hand;
    public Train train;

    public Player(ArrayList<Dominoes> hand, Train train) {
        this.train = train;
        this.hand = hand;
    }
}