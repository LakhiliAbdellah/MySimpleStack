package stackControl;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by 21207071 on 24/02/2016.
 */
public class SimpleStackImp  implements SimpleStack {
    Stack<Item> items=new Stack<Item>();

    @Override
    public boolean isEmpty() {
        return items.isEmpty();
    }

    @Override
    public int getSize() {
        return items.size();
    }

    @Override
    public void push(Item item) {
        items.push(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        return items.peek();
    }

    @Override
    public Item pop() throws EmptyStackException {
        return items.pop();
    }
}