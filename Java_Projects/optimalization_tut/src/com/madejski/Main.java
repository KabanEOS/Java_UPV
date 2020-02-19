package com.madejski;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) throws WrongIndexException {
        ListImpl<Integer> lst = new ListImpl<Integer>();
        lst.insert(0, 100);
        System.out.println(lst);
    }
}
