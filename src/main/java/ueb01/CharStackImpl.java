package ueb01;

import java.util.NoSuchElementException;

class CharStackImpl implements CharStack {
    CharElement top;

    @Override
    public void push(char c) {
        top = new CharElement(c, top);
    }

    @Override
    public char pop() {
        if (top == null)
            throw new NoSuchElementException();
        char c = top.value;
        top = top.next;
        return c;
    }

    @Override
    public int size() {
        int len = 0;
        CharElement it = top;
        while (it != null) {
            len++;
            it = it.next;
        }
        return len;
    }
}
