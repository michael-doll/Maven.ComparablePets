package io.zipcoder;

import java.util.Comparator;

public class SortPetsByType implements Comparator<Pets> {

    public int compare(Pets o1, Pets o2) {
        return o1.getPetType().compareTo(o2.getPetType());
    }
}
