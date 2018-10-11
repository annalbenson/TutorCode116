package lab5;

public class CharacterFrequency {

    public static final int MAX_SIZE = 100;
    private Data [] frequencyTable;
    private int count;

    public CharacterFrequency(){
        frequencyTable = new Data [MAX_SIZE];
        count = 0;
    }

    public void counter(String input){

        boolean found;
        char c, symbol;
        for(int i = 0; i < input.length(); i++ ){
            // go through input character by character
            c = input.charAt(i);
            found = false;
            for(int j = 0; j < count; j++){
                //determine whether character c already has a Data object
                symbol = frequencyTable[j].getSymbol();
                if(c == symbol){
                    // c does have an entry, increment count
                    frequencyTable[j].incrementCount();
                    found = true;
                    break; // avoid extra looping
                }
            }
            if( ! found ){
                // create new data object
                frequencyTable[count] = new Data(c);
                count++;
            }
        }

    }

    public Data [] getFrequency(){
        return frequencyTable;
    }


}
