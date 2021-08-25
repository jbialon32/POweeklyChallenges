package julyweekfour;

import java.util.LinkedList;

/**
 * Created by IntelliJ IDEA.
 * User: Jbialon
 * Date: 7/30/2021
 * Time: 10:40 AM
 * Description: {Insert Description}
 */
public class MyStack<E> extends LinkedList<E> {

    public MyStack() {};

    public boolean empty() {
        if (this.peekLast() == null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public E peek() {
        if (this.peekLast() == null) {
            return null;
        }

        return this.peekLast();
    }

    @Override
    public E pop() {
        if (this.peek() == null) {
            return null;
        }

        return this.pollLast();
    }

    @Override
    public void push(E item) {
      this.addLast(item);
    }

    public int search (Object o) {
        int retVal = indexOf(o);

        if (retVal == -1) {
            return retVal;
        }

        return ++retVal;
    }

}
