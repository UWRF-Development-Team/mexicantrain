package org.acm.uwrf;
import java.util.ArrayList;

public class Train {
    public ArrayList<Dominoes> track;
    public boolean open;

    public Train(ArrayList<Dominoes> track) {
        this.track = track;
        this.open = false;
    }
}
