package lab5;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CharacterFrequencyApp {

    /**
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {

        CharacterFrequency counts = new CharacterFrequency();

        Data [] c;

        String fileName;
        final int SIZE=100;
        Scanner userIn = new Scanner(System.in);
        System.out.print("What is the name of the input file? ");
        fileName = userIn.next();

        File inputFile = new File( fileName );
        Scanner scan = new Scanner( inputFile );

        while (scan.hasNext())
            counts.counter(scan.nextLine());

        c = counts.getFrequency();
        for (int i=0;i<c.length ;i++ )
            System.out.print(c[i].getSymbol() + "=" + c[i].getCount() +" ");
        System.out.print("\n");
    }

}