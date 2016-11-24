package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * Created by 77060 on 2016/11/19.
 */
public class LearnJava {
    public void doSomeThing() {
        ConcurrentLinkedDeque<Integer> linkedDeque = new ConcurrentLinkedDeque<>(new ArrayList<Integer>());
        Vector<Integer> z = new Vector<>();
        z.add(1);
        z.get(1);
        Integer x = linkedDeque.getFirst();
        List<Integer> h = Collections.synchronizedList(new ArrayList<Integer>());
        linkedDeque.add(1);
    }
}
