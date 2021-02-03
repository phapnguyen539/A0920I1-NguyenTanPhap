package th_list;

import java.util.Arrays;

public class MyList<E> {
    private static final int DEFAULT_CAPACYTY = 10;
    private Object elements[];
    private int size = 0;

    public MyList() {
        elements = new Object[DEFAULT_CAPACYTY];
    }

    private void ensureCaPa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCaPa();
        }
        elements[size++] = e;
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index" + i + ",Size" + i);
        }
        return (E) elements[i];
    }
    }
