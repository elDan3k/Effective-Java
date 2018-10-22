package t7_clearing_references;

import java.util.Arrays;
import java.util.EmptyStackException;

public class NonLeakingStack {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public NonLeakingStack(int initialCapacity){
        this.elements = new Object[initialCapacity];
    }

    public void push(Object o){
        ensureCapacity();
        elements[size++] = o;
    }

    //Object will be garbage collected when we overwrite existing pointer with null.
    //Even though it's a good way of freeing VM memory, we should use it as a last resort.
    //Preferred way of dealing with memory leak spots should be reusing of existing pointers with new objects or keeping them in smallest possible scopes.
    public Object pop(){
        if (size == 0) {
            throw new EmptyStackException();
        }
        Object result = elements[size--];
        elements[size] = null;
        return result;
    }

    public void ensureCapacity(){
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size);
        }
    }
}
