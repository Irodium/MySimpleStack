package jper.test;

import jper.Item;
import jper.SimpleStack;
import jper.SimpleStackImpl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SimpleStackImplTest {

    SimpleStack simpleStack;

    @Before
    public void setUp() throws Exception
    {
        simpleStack = new SimpleStackImpl();
        System.out.println("Je suis executé AVANT chaque test.");
    }

    @After
    public void tearDown() throws Exception
    {
        System.out.println("Je suis executé APRES chaque test.");
    }

    @Test
    public void testIsEmpty() throws Exception
    {
        Assert.assertEquals(true,simpleStack.isEmpty());
        simpleStack.push(new Item(42));
        Assert.assertEquals(false,simpleStack.isEmpty());
    }

    @Test
    public void testGetSize() throws Exception
    {
        Assert.assertEquals(0,simpleStack.getSize());
        simpleStack.push(new Item(42));
        Assert.assertEquals(1,simpleStack.getSize());
        simpleStack.push(new Item(445));
        Assert.assertEquals(2,simpleStack.getSize());
    }

    @Test
    public void testPush() throws Exception
    {
        Item item1 = new Item(45);
        Assert.assertEquals(0,simpleStack.getSize());
        simpleStack.push(item1);
        Assert.assertEquals(1,simpleStack.getSize());
        Item item2 = simpleStack.peek();
        Assert.assertEquals(item2.getValue(),45);
        Assert.assertEquals(item2.getValue(),item1.getValue());

    }

    @Test
    public void testPeek() throws Exception
    {
        Item item1 = new Item(45);
        Assert.assertEquals(0,simpleStack.getSize());
        simpleStack.push(item1);
        Assert.assertEquals(1,simpleStack.getSize());
        Item item2 = simpleStack.peek();
        Assert.assertEquals(1,simpleStack.getSize());
        Assert.assertEquals(item2.getValue(),45);
        Assert.assertEquals(item2.getValue(),item1.getValue());

    }

    @Test
    public void testPop() throws Exception
    {
        Item item1 = new Item(45);
        Assert.assertEquals(0,simpleStack.getSize());
        simpleStack.push(item1);
        Assert.assertEquals(1,simpleStack.getSize());
        Item item2 = simpleStack.pop();
        Assert.assertEquals(0,simpleStack.getSize());
        Assert.assertEquals(1,simpleStack.getSize());
        Assert.assertEquals(item2.getValue(),45);
        Assert.assertEquals(item2.getValue(),item1.getValue());

    }
}