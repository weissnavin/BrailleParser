package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Dictionary {
    public HashMap<Character, Letter> dict = new HashMap<>();

    public static final Letter A = new Letter(new Tuple(true, false),
            new Tuple(false, false),
            new Tuple(false, false));

    public static final Letter B = new Letter(new Tuple(true, false),
            new Tuple(true, false),
            new Tuple(false, false));

    public static final Letter C = new Letter(new Tuple(true, true),
            new Tuple(false, false),
            new Tuple(false, false));

    public static final Letter D = new Letter(new Tuple(true, true),
            new Tuple(false, true),
            new Tuple(false, false));

    public static final Letter E = new Letter(new Tuple(true, false),
            new Tuple(false, true),
            new Tuple(false, false));

    public static final Letter F = new Letter(new Tuple(true, true),
            new Tuple(true, false),
            new Tuple(false, false));

    public static final Letter G = new Letter(new Tuple(true, true),
            new Tuple(true, true),
            new Tuple(false, false));

    public static final Letter H = new Letter(new Tuple(true, false),
            new Tuple(true, true),
            new Tuple(false, false));

    public static final Letter I = new Letter(new Tuple(false, true),
            new Tuple(true, false),
            new Tuple(false, false));

    public static final Letter J = new Letter(new Tuple(false, true),
            new Tuple(true, true),
            new Tuple(false, false));

    public static final Letter K = new Letter(new Tuple(true, false),
            new Tuple(false, false),
            new Tuple(true, false));

    public static final Letter L = new Letter(new Tuple(true, false),
            new Tuple(true, false),
            new Tuple(true, false));

    public static final Letter M = new Letter(new Tuple(true, true),
            new Tuple(false, false),
            new Tuple(true, false));

    public static final Letter N = new Letter(new Tuple(true, true),
            new Tuple(false, true),
            new Tuple(true, false));

    public static final Letter O = new Letter(new Tuple(true, false),
            new Tuple(false, true),
            new Tuple(true, false));

    public static final Letter P = new Letter(new Tuple(true, true),
            new Tuple(true, false),
            new Tuple(true, false));

    public static final Letter Q = new Letter(new Tuple(true, true),
            new Tuple(true, true),
            new Tuple(true, false));

    public static final Letter R = new Letter(new Tuple(true, false),
            new Tuple(true, true),
            new Tuple(true, false));

    public static final Letter S = new Letter(new Tuple(false, true),
            new Tuple(true, false),
            new Tuple(true, false));

    public static final Letter T = new Letter(new Tuple(false, true),
            new Tuple(true, true),
            new Tuple(true, false));

    public static final Letter U = new Letter(new Tuple(true, false),
            new Tuple(false, false),
            new Tuple(true, true));

    public static final Letter V = new Letter(new Tuple(true, false),
            new Tuple(true, false),
            new Tuple(true, true));

    public static final Letter W = new Letter(new Tuple(false, true),
            new Tuple(true, true),
            new Tuple(false, true));

    public static final Letter X = new Letter(new Tuple(true, true),
            new Tuple(false, false),
            new Tuple(true, true));

    public static final Letter Y = new Letter(new Tuple(true, true),
            new Tuple(false, true),
            new Tuple(true, true));

    public static final Letter Z = new Letter(new Tuple(true, false),
            new Tuple(false, true),
            new Tuple(true, true));

    public static final Letter HASH = new Letter(new Tuple(false, true),
            new Tuple(false, true),
            new Tuple(true, true));

    public static final Letter ONE = new Letter(new Tuple(true, false),
            new Tuple(false, false),
            new Tuple(false, false));

    public static final Letter TWO = new Letter(new Tuple(true, false),
            new Tuple(true, false),
            new Tuple(false, false));

    public static final Letter THREE = new Letter(new Tuple(true, true),
            new Tuple(false, false),
            new Tuple(false, false));

    public static final Letter FOUR = new Letter(new Tuple(true, true),
            new Tuple(false, true),
            new Tuple(false, false));

    public static final Letter FIVE = new Letter(new Tuple(true, false),
            new Tuple(false, true),
            new Tuple(false, false));

    public static final Letter SIX = new Letter(new Tuple(true, true),
            new Tuple(true, false),
            new Tuple(false, false));

    public static final Letter SEVEN = new Letter(new Tuple(true, true),
            new Tuple(true, true),
            new Tuple(false, false));

    public static final Letter EIGHT = new Letter(new Tuple(true, false),
            new Tuple(true, true),
            new Tuple(false, false));

    public static final Letter NINE = new Letter(new Tuple(false, true),
            new Tuple(true, false),
            new Tuple(false, false));

    public static final Letter ZERO = new Letter(new Tuple(false, true),
            new Tuple(true, true),
            new Tuple(false, false));


    public Dictionary(){
        this.initialize();
    }

    public void initialize(){
        dict.put('A', A);
    }

}
