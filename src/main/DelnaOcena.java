package main;

/**
 * Ta razred je v pomoč pri iskanju najboljšega (tistega, ki bo doprinesel donajnižjega rezultata) Stringa v izvornem zaporedju
 */
public class DelnaOcena implements Comparable<DelnaOcena>{
    private String string;
    private int mark;
    private int numMatches;

    public DelnaOcena(String string, int mark) {
        this.string = string;
        this.mark = mark;
    }

    public void setNumMatches(int val) {
        numMatches = val;
    }

    public String getString() {
        return string;
    }

    public int getMark() {
        return mark;
    }

    public int getNumMatches() {
        return numMatches;
    }

    @Override
    public int compareTo(DelnaOcena o) {
        /*
        if(o.getMark() == mark) {
            return 0;
        } else if(o.getMark()>mark) {
            return -1;
        } else {
            return 1;
        }
         */

        if(o.getNumMatches() == numMatches) {
            return 0;
        } else if(o.getNumMatches() > numMatches) {
            return -1;
        } else {
            return 1;
        }
    }
}
