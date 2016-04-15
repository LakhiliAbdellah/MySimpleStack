package stackcontrol;

import java.util.EmptyStackException;

/**
 * Created by 21207071 on 24/02/2016.
 */
public interface SimpleStack {
    /**
     * sdsf.
     * @return dsopkdsf
      */
    boolean isEmpty();

    /**
     * dsdsd.
     * @return ssdsd
     */
    int getSize();

    /**
     * Pushes an item onto the top of this stack.
     * null item is allowed.
     */
    void push(Item item);

    /**
     * tfyguhjkl.
     * @return tfyghujk
     * @throws EmptyStackException tfyghujk
     */
    Item peek() throws EmptyStackException;

    /**
     * Removes the object at the top of this stack and returns that object as the
     * value of this function.
     * @return tfyghujk
     * @throws EmptyStackException if this stack is empty.
     */
    Item pop() throws EmptyStackException;
}
