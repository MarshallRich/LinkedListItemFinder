package com.theironyard;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

/**
 * Created by MacLap on 5/16/16.
 */
public class MainTest {

    @Test
    public void testListChecker() throws Exception {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        String item = Main.ListChecker(list).toString();

        Assert.assertTrue(item.equals("4"));
    }
}