import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //String[] keywordArray = new String[4];
        String[] keywordArray = {"if", "while", "do", "for", "end"};
        String[] operatorArray = {"+", "-", "*", "/", "=", "==", "~=", ">", "<", ">=", "<="};

        File file = new File("C:\\Users\\John\\IdeaProjects\\Scanner\\src\\input.txt");
        Scanner scan = new Scanner(file);

        int counter = 0;

        while (scan.hasNext()) {
            scan.nextLine();
            counter++;
        }

        scan = new Scanner(file); //to get to the beginning of the file

        String[] words = new String[counter];

        for (int i = 0; i < counter; i++) {
            words[i] = scan.nextLine();
        }

        //while (scan.hasNextLine())
            //System.out.println(scan.nextLine());

       //System.out.println("Ahh");
    }
}
