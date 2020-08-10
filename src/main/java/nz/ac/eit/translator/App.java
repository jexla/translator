package nz.ac.eit.translator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<String> germanTranslations=new ArrayList<>();
        germanTranslations.add("Einz");
        germanTranslations.add("Zwei");
        germanTranslations.add("Drei");
        germanTranslations.add("Drei");
        germanTranslations.add("Drei");
        germanTranslations.add("Drei");
        germanTranslations.add("Drei");
        germanTranslations.add("Drei");
        germanTranslations.add("Drei");
        germanTranslations.add("Drei");
        germanTranslations.add("Drei");
        germanTranslations.add("Drei");

        List<String> frenchTranslations=new ArrayList<>();
        frenchTranslations.add("Un");
        frenchTranslations.add("Deux");
        frenchTranslations.add("Trois");
        frenchTranslations.add("Trois");
        frenchTranslations.add("Trois");
        frenchTranslations.add("Trois");
        frenchTranslations.add("Trois");
        frenchTranslations.add("Trois");
        frenchTranslations.add("Trois");
        frenchTranslations.add("Trois");
        frenchTranslations.add("Trois");
        frenchTranslations.add("Trois");
        frenchTranslations.add("Trois");
        frenchTranslations.add("Trois");


        System.out.println( "What is the number to translate?" );
        Scanner scanner=new Scanner(System.in);
        String numberAsString=scanner.nextLine();

        Integer number=null;
        try {
            number = Integer.parseInt(numberAsString);
            System.out.println(number);
        }
        catch (NumberFormatException nfe) {
            System.out.println("Please enter ONLY a numeric value");
            System.exit(0);
        }
        System.out.println( "Select a language? (1. French 2. German)" );

        String optionAsString=scanner.nextLine();

        Integer option=null;
        try {
            option = Integer.parseInt(optionAsString);
            System.out.println(option);
        }
        catch (NumberFormatException nfe) {
            System.out.println("Please enter 1 for french or 2 for German");
            System.exit(0);
        }

        if (option==1) {
            String translated = frenchTranslations.get(number-1);
            System.out.println(translated);
        }





    }
}
