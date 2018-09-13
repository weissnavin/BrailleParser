package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Dictionary {

    public static final Letter A = new Letter(Collections.unmodifiableList(
            new ArrayList<Tuple>() {{
                add(new Tuple(true, false));
                add(new Tuple(false, false));
                add(new Tuple(false, false));
            }}));
}
