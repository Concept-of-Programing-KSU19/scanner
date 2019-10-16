package com.company;

import java.io.*;

public class Global
{
    public static String line;
    public static String [] words;
    public static int counterLine=0;
    public static String space = " ";
    public static String [] keyWordArr = {"end","return", "begin" , "while", "if", "for", "try", "return", "break" ,"continue", "function", "macro" ,"quote ","let ","local ","global", "const ","do","struct","end"," else ","catch ","finally"};

    //Add +x and -x(unary plus	the identity operation and unary minus	maps values to their additive inverses)
    //Add !x negation	changes true to false and vice versa    
    public static String [] symArr = {"/", "\\","+","-","=","*","==", "!=", "<", ">", "<=", ">=","xor", "^", "%" };
    public static int [] intArr=new int[100];
}
