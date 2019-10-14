package com.company;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Global {
    public static String line;
    public static String [] words;
    public static int counterLine=0;
    public static String space = " ";
    public static String [] keyWordArr = {"xor", "end","return"};
    public static String [] symArr = {"/", "\\","+","-","=","*"};
    public static int [] intArr=new int[100];
    public static int match;
    //Want these global or not???
    public static InputStream in;
    public static InputStreamReader inR;
    public static BufferedReader br;
    public static OutputStream out;
    public static OutputStreamWriter outW;
    public static BufferedWriter bw;
    }


