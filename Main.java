import java.io.*;
import java.io.FileInputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] keywordArray = {"if", "while", "do", "for", "end"};
        int[] keywordCodes =    {100, 101, 102, 103, 104};
        String[] operatorArray = {"=", "+", "-", "*", "/", "==", "~=", ">", "<", ">=", "<="};
        int[] operatorCodes =    {200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210};
        int intIdentifierCode = 300;
        int intLiteralCode = 400;

        try {
            File file = new File("C:\\Users\\John\\IdeaProjects\\Scanner\\src\\input.txt");
            Scanner scan = new Scanner(file);

            int counter = 0;

            while (scan.hasNext()) {
                scan.next();
                counter++;
            }

            scan = new Scanner(file); //to get to the beginning of the file

            String[] words = new String[counter];

            for (int i = 0; i < counter; i++) {
                words[i] = scan.next();
            }

        //while (scan.hasNextLine())
          //  System.out.println(scan.nextLine());

             for(int i = 0; i < words.length; i++)
                System.out.println(words[i]);

             for(int i = 0; i < words.length; i++){

                 for(int j = 0; j < operatorArray.length; j++){
                     if(words[i].equals(operatorArray[j]))
                         System.out.println("The Next Token is: " + operatorCodes[j]);
                 }

                 for(int j = 0; j < keywordArray.length; j++){
                     if(words[i].equals(keywordArray[j]))
                         System.out.println("The Next Token is: " + keywordCodes[j]);
                 }

                 if(isInteger(words[i]))
                     System.out.println("The Next Token is: " + intLiteralCode);

                 else if(Character.isLetter(words[i].charAt(0)) && words[i].length() == 1)
                     System.out.println("The Next Token is: " + intIdentifierCode);

                 
             }
        }
        catch(FileNotFoundException e) {
            e.printStackTrace();
        }


    }

    public static boolean isInteger(String s) {
        boolean isValidInteger = false;
        try
        {
            Integer.parseInt(s);

            // s is a valid integer

            isValidInteger = true;
        }

        catch (NumberFormatException ex)
        {
            // s is not an integer
        }

        return isValidInteger;
    }
}
