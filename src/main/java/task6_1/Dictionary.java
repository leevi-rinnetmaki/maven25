package task6_1;

import java.util.ArrayList;

public class Dictionary {
    ArrayList<String[]> dictionary = new ArrayList<String[]>();

    public boolean addWord(String[] word){
        if(getWord(word[0])==null) {
            dictionary.add(word);
            return true;
        }
        return false;
    }

    public String getWord(String word){
        for(String[] i: dictionary) {
            if (word.equals(i[0])) {
                return i[1];
            }
        }
        return null;
    }
}
