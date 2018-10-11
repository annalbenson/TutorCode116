package lab5;

public class CharacterFrequency {

    public static final int MAX_SIZE = 100;
    Data [] frequencyTable;
    int count;

    public CharacterFrequency(){
        frequencyTable = new Data [MAX_SIZE];
        count = 0;
    }

    public void counter(String input){

    }

    public Data [] getFrequency(){
        return frequencyTable;
    }


}
