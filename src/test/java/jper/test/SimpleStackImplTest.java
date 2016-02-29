package jper.test;

import jper.SimpleStackImpl;
import jper.Item;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class SimpleStackImplTest {

    @Test
    public void testIsEmpty() throws Exception {
        SimpleStackImpl stack= new SimpleStackImpl();
        //code under test
        stack.isEmpty();

        assertEquals("stack must be empty", 0, stack.getSize());
    }

    @Test
    public void testGetSize() throws Exception {
        SimpleStackImpl stack = new SimpleStackImpl();
        Item item = new Item();
        stack.push(item);
        //code under test

        int i = stack.getSize();
        //assertions

        assertEquals("The stack contain 1 item",1, i);
    }

    @Test
    public void testPush() throws Exception {
        SimpleStackImpl stack = new SimpleStackImpl();
        Item item = new Item();

        // Code under test
        stack.push(item);

        // assertions (oracle)
        assertFalse("The stack must be not empty", stack.isEmpty());
        assertEquals("The stack contains 1 item", 1, stack.getSize());
        assertSame("The pushed item is on top of the stack", item, stack.peek());

    }

    @Test
    public void testPeek() throws Exception {

        SimpleStackImpl stack = new SimpleStackImpl();
        Item item = new Item(2);
        stack.push(item);
        //Code under test

        stack.peek();

        //assertions

        assertSame("The item must be the same", item, stack.peek());
    }

    @Test
    public void testPop() throws Exception {
        SimpleStackImpl stack = new SimpleStackImpl();
        Item item = new Item(1);
        stack.push(item);

        //code under test

        stack.pop();

        //assertions
        assertTrue("The Stack must be empty", stack.isEmpty());
        assertEquals("The Stack must be contains 0 element",0,stack.getSize());

    }


    @Test(expected = EmptyStackException.class)
    public void testPeekException() throws EmptyStackException{
        SimpleStackImpl stack = new SimpleStackImpl();
        stack.peek();

    }

    @Test(expected = EmptyStackException.class)
    public void testPopException() throws EmptyStackException{
        SimpleStackImpl stack = new SimpleStackImpl();
        stack.pop();
    }
}