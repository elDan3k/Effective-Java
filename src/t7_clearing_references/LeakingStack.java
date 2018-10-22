package t7_clearing_references;

import java.util.Arrays;
import java.util.EmptyStackException;

public class LeakingStack {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public LeakingStack( int initialCapacity){
        this.elements = new Object[initialCapacity];
    }

    public void push(Object o){
        ensureCapacity();
        elements[size++] = o;
    }

    //Method that moves pointer index of next value but leaves unused object on VM stack.
    //That object will not be garbage collected because there is still valid reference to it in array,
    //although there is no way to retrieve it second time.
    //Garbage collector will be invoked when we push new object to that array index.
    public Object pop(){
        if (size == 0) {
            throw new EmptyStackException();
        }
        return elements[size--];
    }

    public void ensureCapacity(){
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size);
        }
    }
}
