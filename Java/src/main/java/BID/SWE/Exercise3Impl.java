package BID.SWE;

import java.util.ArrayList;

public class Exercise3Impl extends MapE {

    private ArrayList<Object> e = new ArrayList<>();

    Exercise3Impl() {
        e.add(new Springen());
        e.add(new Laufen());
    }

    public Object Method1() {
        return new Exercise3Impl();
    }

    public Object Method2() {
        return e;
    }

    @Override
    public String GetMapName() {
        return "BID-Map";
    }

    @Override
    public float GetMapSize(float amount) {
        return amount * amount;
    }

    @Override
    public int AddNewCells(int count) {
        return count;
    }
}
