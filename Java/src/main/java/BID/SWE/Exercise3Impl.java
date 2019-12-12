package BID.SWE;

public class Exercise3Impl extends MapE {

    public Object Method1() {
        return new Exercise3Impl();
    }

    public Object Method2() {
        return null;
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
