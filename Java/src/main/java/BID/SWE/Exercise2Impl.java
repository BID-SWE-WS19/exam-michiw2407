package BID.SWE;

public class Exercise2Impl extends Cell {

    public Object Method1() {
        return new Cell();
    }

    @Override
    public int Grow() {
        return this._size * 2;
    }

    public boolean Method3(int neighbours) {
        return neighbours % 2 == 0;
    }
}
