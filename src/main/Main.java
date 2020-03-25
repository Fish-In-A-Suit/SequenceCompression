package main;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String line = "";
        String filepath = "F:\\Windows_Development\\Minecraft\\Testerv1\\src\\resources\\tester.txt";
        try {
            BufferedReader buf = new BufferedReader(new InputStreamReader(new FileInputStream(new File(filepath))));
            line = buf.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //System.out.println(line);

        String firstThousand = splitStringEvery(line, 1000)[0];
        ArrayList<String> subStrings = findAllSubstrings(line); //firstthousand
        ArrayList<String> subStringsProcessed = (ArrayList<String>) subStrings.stream().distinct().collect(Collectors.toList()); //removed duplicates
        System.out.println("Removed " + (subStrings.size() - subStringsProcessed.size()) + " duplicates");

        ArrayList<DelnaOcena> delneOcene = new ArrayList<>();
        int itCount = 0;
        for(String substr : subStringsProcessed) {
            //System.out.println("Processing substring: " + substr);
            int length = substr.length();
            //int occurences = countMatches(line, substr);
            //int occurences = countMatchesRegular(line, substr);
            //int occurences = countMatchesSplit(line, substr);
            int occurences = countMatchesCustom(line, firstThousand); //firthtthousand

            /*
             * problem: evalvacija length*occurences da najboljši string za removal kar celoten najdaljši string ... kar pa ni prav!
             * --> določi margin do katere možne dolžine sploh smatraš stringe kot smotrna zaporedja ... mora imeti vsaj 2 ponovitvi!
             */

            DelnaOcena doc = new DelnaOcena(substr, length*occurences);
            doc.setNumMatches(occurences);
            delneOcene.add(doc);

            itCount++;
            float percentage = ((float) itCount) / subStrings.size() * 100;
            System.out.println(String.format("%2.02f", percentage) + " %");
        }

        DelnaOcena best = Collections.max(delneOcene);
        System.out.println("Prikaz delnih ocen: ");
        displayDelneOcene(delneOcene, 200);
        System.out.println("Best delna ocena = " + best.getString() + ", score = " + best.getMark());
    }

    public static ArrayList<String> findAllSubstrings(String string) {
        ArrayList<String> result = new ArrayList<>();
        System.out.println("Searching for substrings...");
        for(int i = 0; i<string.length(); i++) {
            for(int j = i+1; j<string.length(); j++) {
                result.add(string.substring(i, j));
            }
        }
        System.out.println("Found " + result.size() + " substrings");
        return result;
    }

    public static String[] splitStringEvery(String s, int interval) {
        int arrayLength = (int) Math.ceil(((s.length() / (double) interval)));
        String[] result = new String[arrayLength];

        int j = 0;
        int lastIndex = result.length -1;
        for(int i = 0; i<lastIndex; i++) {
            result[i] = s.substring(j, j+interval);
            j+=interval;
        }
        result[lastIndex] = s.substring(j);

        return result;
    }

    /**
     * Finds the number of occurences of the substring in string.
     * This method is way too slow
     * @param string
     * @param substring
     * @return
     */
    public static int countMatches(String string, String substring) {
        int lastIndex = 0;
        int count = 0;

        while(lastIndex != -1) {
            lastIndex = string.indexOf(substring, lastIndex);

            if(lastIndex != -1) {
                count++;
                lastIndex += substring.length();
            }
        }
        return count;
    }

    public static int countMatchesRegular(String string, String substring) {
        int count = 0;
        int startIndex = 0;

        Pattern p = Pattern.compile("Java", Pattern.LITERAL);
        Matcher m = p.matcher(string);

        while (m.find(startIndex)) {
            count++;
            startIndex = m.start() + 1;
        }
        return count;
    }

    /**
     * this method is better than the above 2 methods
     * @param string
     * @param substring
     * @return
     */
    public static int countMatchesSplit(String string, String substring) {
        return string.split(substring).length-1;
    }

    public static int countMatchesCustom(String str, String substring) {
        //išči po začetnih črkah
        Test test = new Test(str); //get indexes
        int substrLength = substring.length();
        String firstChar = Character.toString(substring.charAt(0));

        int numCharacters = test.getNumCharacters(firstChar);
        ArrayList<Integer> characterIndexes = test.getIndexes(firstChar);
        //System.out.println("Displaying characterIndexes: " + getArrayListAsString(characterIndexes));

        int countMatches = 0;
        int strLength = str.length();
        for(int i=0; i<numCharacters; i++) {
            if(characterIndexes.get(i)+substrLength > strLength) {
                return countMatches;
            }
            String substringForCharacter = str.substring(characterIndexes.get(i), characterIndexes.get(i)+substrLength);
            if(substringForCharacter.equals(substring)) {
                countMatches++;
            }
        }
        return countMatches;
    }

    public static String getArrayListAsString(ArrayList<Integer> ar) {
        StringBuilder sb = new StringBuilder();
        for(Integer integer : ar) {
            sb.append(integer + ", ");
        }
        return sb.toString();
    }

    //threshold ... npr 100 = najboljših 100
    public static void displayDelneOcene(ArrayList<DelnaOcena> arr, int threshold) {
        Collections.sort(arr);

        for(int i = arr.size()-threshold; i<arr.size(); i++) {
            DelnaOcena doc = arr.get(i);
            System.out.println("" + doc.getNumMatches() + " : " + doc.getMark() + " | " + doc.getString());
        }
    }



}
