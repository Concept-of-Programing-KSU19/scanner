//input and output for Intelij goes in C:\...\IdeaProjects\projName
package com.company;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String args[]) throws IOException {


            for (int test=0; test<Global.keyWordArr.length+1;test++){
                //System.out.println(test);
                // System.out.println(Global.keyWordArr[test]);
                if(test<100){
                Global.tokenKeyword[test]=(1100+(test));
          //     System.out.println(Global.tokenKeyword[test]);
                }
            }

            for (int test1=0; test1<Global.symArr.length+1;test1++){
                //System.out.println(test);
                // System.out.println(Global.keyWordArr[test]);
                if(test1<100){
                    Global.tokenSym[test1]=(1200+(test1));
            //        System.out.println(Global.tokenSym[test1]);
                }
            }



       //Buffered reader & Buffered Writer
        try     (
                InputStream in = new FileInputStream("input.txt");
                InputStreamReader inR = new InputStreamReader(in, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(inR);
                OutputStream out = new FileOutputStream("output.txt");
                OutputStreamWriter outW = new OutputStreamWriter(out, StandardCharsets.UTF_8);
                BufferedWriter bw = new BufferedWriter(outW)
                ) {
            //Takes line and breaks it into "words" by space
            while ((Global.line = br.readLine()) != null) {
                    Global.words = Global.line.split(Global.space);
                    for (int i = 0; i < Global.words.length; i++) {
                        if (i == 0) {
                            Global.counterLine++;
                            //    bw.write("Line: " + Global.counterLine);
                             bw.newLine();

                        }
                        //System.out.println("Place at array: " + i + " and its value is: " + Global.words[i]);
                        // bw.write("Place at array: " + i + " and its value is: " + Global.words[i]);
                        //       bw.newLine();
                        //Token for Keyarray 100-199


                            //    System.out.println(tokenGenKey);

                            if (match(i, 1) != 100) {
                                // bw.write("                                                                              I have match for \"" + Global.words[i] + "\" with \"" + Global.keyWordArr[match(i,1)]+"\"");
                                bw.write("Line: " + Global.counterLine + "           Lexeme: " + Global.words[i] /*+ Global.keyWordArr[match(i, 1)]*/ + "       Token: " + Global.tokenKeyword[match(i, 1)]);
                                bw.newLine();
                            }




                            if (match(i, 2) != 100) {
                                //   bw.write("                                                                              I have match for \"" + Global.words[i] + "\" with \"" + Global.symArr[match(i,2)]+"\"");
                                bw.write("Line: " + Global.counterLine + "          Lexeme: " + Global.words[i] /*+ Global.symArr[match(i, 2)]*/ + "       Token: " +Global.tokenSym[match(i, 2)]);
                                bw.newLine();
                            }


                        if (isInteger(Global.words[i])) {

                                // System.out.println("Integer: " + Global.words[i] );
                                //   bw.write("                                                                              I have match for \"" + Global.words[i] + "\" with \" a number\"");
                                bw.write("Line: " + Global.counterLine + "          Lexeme: " + Global.words[i] +  "       Token: " + Global.tokenDigit);
                                bw.newLine();

                        } else if (Character.isLetter(Global.words[i].charAt(0)) && Global.words[i].length() == 1) {

                            //   System.out.println("letter:  "+ Global.words[i]);
                            //   bw.write("                                                                              I have match for \"" + Global.words[i] + "\" with \" a letter\"");
                            bw.write("Line: " + Global.counterLine + "          Lexeme: " + Global.words[i] +  "       Token: " + Global.tokenLetter);
                            bw.newLine();
                        }
                    }
            }
        }
    }

    //a=i
    //i is the for loop for "words" in the array
    //b decides if keywordarray or symbolarray
    public static int match (int a, int b)
    {
        if (b==1) {
            for (int n = 0; n < Global.keyWordArr.length; n++) {
                if ((Global.words[a]).equals("" + Global.keyWordArr[n])) {
                    return n;
                }
            }
        }
        if (b==2) {
            for (int n = 0; n < Global.symArr.length; n++) {
                if ((Global.words[a]).equals("" + Global.symArr[n])) {
                    return n;
                }
            }
        }
        return 100;
    }
    public static boolean isInteger(String s) {
        boolean isValidInteger = false;
        try
        {
            Integer.parseInt(s);
            isValidInteger = true;
        }
        catch (NumberFormatException ex)
        {
        }
        return isValidInteger;
    }
}
