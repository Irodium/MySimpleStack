package jper;

import java.util.EmptyStackException;
import java.util.ArrayList;
import jper.SimpleStack;

/**
 * Created by 21503800 on 24/02/2016.
 */
public class SimpleStackImpl implements SimpleStack
{
    public ArrayList<Item> arrayItem;

    public boolean isEmpty()
    {
        if (arrayItem.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public int getSize()
    {
        return arrayItem.size();
    }

    public void push(Item item)
    {
        arrayItem.add(item);
    }

    public Item peek() throws EmptyStackException
    {
        Item item = arrayItem.get(arrayItem.size());
        return item;
    }

    public Item pop() throws EmptyStackException
    {
        Item item = arrayItem.get(arrayItem.size());
        arrayItem.remove(arrayItem.size());
        return item;
    }
}
