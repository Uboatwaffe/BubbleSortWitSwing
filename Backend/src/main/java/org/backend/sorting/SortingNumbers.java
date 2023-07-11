package org.backend.sorting;


public class SortingNumbers {
    public String[] sort(String[] a){

        double[] db = new double[a.length];

        double cont;

        for (int i = 0; i < a.length; i++) {
            db[i] = Double.parseDouble(String.valueOf(a[i]));
        }


        for (int i = 0; i < db.length; i++) {
            for (int j = 0; j < db.length-1; j++) {
                if (db[i] > db[i+1]){
                    cont = db[i];
                    db[i] = db[i+1];
                    db[i+1] = cont;
                }
            }
        }

        for (int i = 0; i < db.length; i++) {
            a[i] = Double.toString(db[i]);
        }

        return a;
    }
}
