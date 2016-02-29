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

    public SimpleStackImpl()
    {
        arrayItem = new ArrayList<Item>();
    }

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

        if (getSize() > 0)
        {
            return arrayItem.get(getSize() - 1);
        } else {
            throw new EmptyStackException();
        }


    }

    public Item pop() throws EmptyStackException
    {
        if (getSize() > 0) {
            Item item = new Item(arrayItem.get(getSize() - 1));
            arrayItem.remove(getSize() - 1);
            return item;
        } else {
            throw new EmptyStackException();
        }
    }
}
