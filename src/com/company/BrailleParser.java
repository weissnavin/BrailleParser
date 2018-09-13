package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Tuple {
    public final Boolean x;
    public final Boolean y;

    public Tuple(Boolean x, Boolean y) {
        this.x = x;
        this.y = y;
    }
}

class Letter {
    List<Tuple> rep = Arrays.asList(new Tuple[3]);
    public Letter(List<Tuple> ls){
        this.rep=ls;
    }
}

public class BrailleParser {

        public List parser(String str){

        return null;
    }

    public static void main(String[] args) {
        // write your code here
    }
}
