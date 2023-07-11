package org.backend;

import org.backend.sorting.SortingNumbers;
import org.backend.sorting.SortingWords;

public class Switchboard{

    SortingNumbers sortingNumbers = new SortingNumbers();
    SortingWords sortingWords = new SortingWords();
    public String[] sort(String[] a, String action){
        switch (action) {
            case "n" -> {
                return sortingNumbers.sort(a);
            }
            case "w" -> {
                return sortingWords.sort(a);
            }
            default -> {
                return a;
            }
        }
    }
}
