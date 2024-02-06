package org.example;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;

public class MyIterator<E> implements Iterator<E> {
    private MyNode<E> next = null;

    public MyIterator(MyNode<E> next) {
        this.next = next;
    }

    @Override
    public boolean hasNext() {
        return next!= null;
    }

    @Override
    public E next() {
        MyNode<E> tempNext = next;
        if (next != null) next = next.getNext();
        return tempNext.getValue();
    }
}
