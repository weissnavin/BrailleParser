package com.company;

import java.util.*;

class Tuple {
    public final Boolean x;
    public final Boolean y;

    public Tuple(Boolean x, Boolean y) {
        this.x = x;
        this.y = y;
    }
}

class Letter {
    Tuple row1;
    Tuple row2;
    Tuple row3;
    public Letter(Tuple row1, Tuple row2, Tuple row3){
        this.row1=row1;
        this.row2=row2;
        this.row3=row3;
    }
    List<Tuple> rep = Arrays.asList(new Tuple[3]);
    public Letter(List<Tuple> ls){
        this.rep=ls;
    }
}

public class BrailleParser {
    public static HashMap<Character, Letter> dict = new HashMap<>();

    public static void initialize(){
        dict.put('A', Dictionary.A);
        dict.put('B', Dictionary.B);
        dict.put('C', Dictionary.C);
        dict.put('D', Dictionary.D);
        dict.put('E', Dictionary.E);
        dict.put('F', Dictionary.F);
        dict.put('G', Dictionary.G);
        dict.put('H', Dictionary.H);
        dict.put('I', Dictionary.I);
        dict.put('J', Dictionary.J);
        dict.put('K', Dictionary.K);
        dict.put('L', Dictionary.L);
        dict.put('M', Dictionary.M);
        dict.put('N', Dictionary.N);
        dict.put('O', Dictionary.O);
        dict.put('P', Dictionary.P);
        dict.put('Q', Dictionary.Q);
        dict.put('R', Dictionary.R);
        dict.put('S', Dictionary.S);
        dict.put('T', Dictionary.T);
        dict.put('U', Dictionary.U);
        dict.put('V', Dictionary.V);
        dict.put('W', Dictionary.W);
        dict.put('X', Dictionary.X);
        dict.put('Y', Dictionary.Y);
        dict.put('Z', Dictionary.Z);
        dict.put('#', Dictionary.HASH);
        dict.put('1', Dictionary.ONE);
        dict.put('2', Dictionary.TWO);
        dict.put('3', Dictionary.THREE);
        dict.put('4', Dictionary.FOUR);
        dict.put('5', Dictionary.FIVE);
        dict.put('6', Dictionary.SIX);
        dict.put('7', Dictionary.SEVEN);
        dict.put('8', Dictionary.EIGHT);
        dict.put('9', Dictionary.NINE);
        dict.put('0', Dictionary.ZERO);
    }
//    Dictionary brailleDict = new Dictionary();

        public static void tupleToPrint(Tuple t){
            if(t.x==true){
                System.out.print('*');
            }else{
                System.out.print(' ');
            }

            if(t.y==true){
                System.out.print("* ");
            }else{
                System.out.print("  ");
            }
        }

        public static void parser(String str){
            for (char c : str.toCharArray()){
                Character up = Character.toUpperCase(c);
                if(dict.containsKey(up)){
                    tupleToPrint(dict.get(up).row1);
                }
            }
            System.out.println();
            for (char c : str.toCharArray()){
                Character up = Character.toUpperCase(c);
                if(dict.containsKey(up)){
                    tupleToPrint(dict.get(up).row2);
                }
            }
            System.out.println();
            for (char c : str.toCharArray()){
                Character up = Character.toUpperCase(c);
                if(dict.containsKey(up)){
                    tupleToPrint(dict.get(up).row3);
                }
            }
            System.out.println();

    }

    public static void main(String[] args) {
            initialize();
        parser("ABCDEFGHIJKLM");
        parser("NOPQRSTUVWXYZ");
        parser("#1234567890");


        // write your code here

    }
}
