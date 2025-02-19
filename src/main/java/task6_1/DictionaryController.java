package task6_1;

public class DictionaryController {

    private DictionaryView dictionaryView;
    private Dictionary dictionary = new Dictionary();

    public DictionaryController(DictionaryView dictionaryView) {
        this.dictionaryView = dictionaryView;
    }

    public void addWord(String[] word) {
        if(dictionary.addWord(word)){
            dictionaryView.setDefinition("Success added " + word[0] + " to the dictionary");
        }else
            dictionaryView.setDefinition("Error. The word is already in the dictionary");

    }

    public void getWord(String word) {
        //System.out.println(dictionary.getWord(word));
        if (dictionary.getWord(word) != null)
            dictionaryView.setDefinition(dictionary.getWord(word));
        else
            dictionaryView.setDefinition("No such word");

        //dictionaryView.
        //return dictionary.getWord(word);
    }
}
