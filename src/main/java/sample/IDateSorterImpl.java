package sample;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class IDateSorterImpl implements IDateSorter {
    @Override
    public Collection<LocalDate> sortDates(List<LocalDate> unsortedDates) {
        List<LocalDate> datesAscending = new ArrayList<>();
        List<LocalDate> datesDescending = new ArrayList<>();
        for (LocalDate date : unsortedDates) {
            if (date.getMonth().toString().contains("R")) {
                datesAscending.add(date);
            } else {
                datesDescending.add(date);
            }
        }
        Collections.sort(datesAscending);
        Collections.sort(datesDescending);
        Collections.reverse(datesDescending);
        datesAscending.addAll(datesDescending);
        return datesAscending;
    }
}

