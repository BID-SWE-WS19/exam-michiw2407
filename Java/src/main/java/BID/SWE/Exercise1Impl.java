package BID.SWE;

import javax.print.attribute.standard.PrinterState;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Exercise1Impl implements CellPrinter {
    public Object Method1() {
        return new Exercise1Impl();
    }

    public String PrintState(boolean b, Date date, String s) {
        DateFormat dt = DateFormat.getDateInstance(DateFormat.SHORT, Locale.GERMANY);
        return "Cell " + s + " born on " + dt.format(date) + (b ?" is alive" : " is not alive");
    }

    @Override
    public String PrintPostion(int i, int i1) {
        return "Cell is on Position X:" + i + " Y:" + i1;
    }
}


