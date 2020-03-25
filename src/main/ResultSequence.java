package main;

import java.util.ArrayList;

/**
 * 1
 * 2 3
 * an
 * as
 * 1 1 2
 *
 * sequenceId
 * numberOfSubstrings numberOfIndices
 * substrings
 * indices
 */
public class ResultSequence {
    private int sequenceId;
    private int numberOfSubstrings;
    private int numberOfIndices;
    private ArrayList<String> subStrings;
    private ArrayList<Integer> indices;

    public ResultSequence(int sequenceId, int numberOfSubstrings, int numberOfIndices, ArrayList<String> subStrings, ArrayList<Integer> indices) {
        this.sequenceId = sequenceId;
        this.numberOfSubstrings = numberOfSubstrings;
        this.numberOfIndices = numberOfIndices;
        this.subStrings = subStrings;
        this.indices = indices;
    }
}

