package org.backend.sorting;


public class SortingNumbers {
    public String[] sort(String[] a){

        double[] db = new double[a.length];

        double cont;
        boolean change = false;

        for (int i = 0; i < a.length; i++) {
            db[i] = Double.parseDouble(String.valueOf(a[i]));
        }


        for (int i = 0; i < db.length; i++) {
            for (int j = 0; j < db.length-1; j++) {
                if (db[j] > db[j+1]){
                    double c = db[j];
                    db[j] = db[j+1];
                    db[j+1] = c;
                    change = true;
                }
            }
            // If any change wasn't made exits
            if (!change)
                break;
            change = false;
        }

        for (int i = 0; i < db.length; i++) {
            a[i] = Double.toString(db[i]);
        }

        return a;
    }
}
