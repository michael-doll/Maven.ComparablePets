package io.zipcoder;

import java.util.Comparator;

public class SortPetsByName implements Comparator<Pets> {

    public int compare(Pets o1, Pets o2) {
        return o1.getPetName().compareTo(o2.getPetName());
    }
}
