import java.util.*;

/* since my custom class implements the List interface
 * and implements all the required methods from the List interface
 * it can be substituted with any other class that implements the
 * List interface, like LinkedList, ArrayList, Stack, Vector, etc.
 *
 * if, say, I figured out how to make a quantum linked list,
 * as long as i implemented the List interface, it could be 
 * substituted seamlessly without the need to change anything else 
 * in that codebase. 
 *
 * (this class is not tested)
 */

public class CustomLinkedList<T> implements List<T> {

    // Node class for the LinkedList
    private class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head node of the LinkedList
    private Node<T> head;
    private int size;

    public CustomLinkedList() {
        head = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public boolean contains(Object o) {
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(o)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node<T> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                T data = current.data;
                current = current.next;
                return data;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];
        int i = 0;
        for (T item : this) {
            array[i++] = item;
        }
        return array;
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        if (a.length < size) {
            a = Arrays.copyOf(a, size);
        }
        int i = 0;
        for (T item : this) {
            a[i++] = (T1) item;
        }
        if (a.length > size) {
            a[size] = null;
        }
        return a;
    }

    @Override
    public boolean add(T item) {
        Node<T> newNode = new Node<>(item);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (isEmpty()) {
            return false;
        }
        if (head.data.equals(o)) {
            head = head.next;
            size--;
            return true;
        }
        Node<T> prev = head;
        Node<T> current = head.next;
        while (current != null) {
            if (current.data.equals(o)) {
                prev.next = current.next;
                size--;
                return true;
            }
            prev = current;
            current = current.next;
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object o : c) {
            if (!contains(o)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        boolean modified = false;
        for (T item : c) {
            if (add(item)) {
                modified = true;
            }
        }
        return modified;
    }

    public boolean addAll(int index, Collection<? extends T> c) {
    if (index < 0 || index > size) {
        throw new IndexOutOfBoundsException();
    }
    boolean modified = false;
    Node<T> prev = null;
    Node<T> current = head;
    int i = 0;
    for (T item : c) {
        Node<T> newNode = new Node<>(item);
        if (prev == null) {
            head = newNode;
        } else {
            prev.next = newNode;
        }
        newNode.next = current;
        prev = newNode;
        i++;
        modified = true;
    }
    size += i;
    return modified;
}

@Override
public boolean removeAll(Collection<?> c) {
    boolean modified = false;
    Node<T> prev = null;
    Node<T> current = head;
    while (current != null) {
        if (c.contains(current.data)) {
            if (prev == null) {
                head = current.next;
            } else {
                prev.next = current.next;
            }
            size--;
            modified = true;
        } else {
            prev = current;
        }
        current = current.next;
    }
    return modified;
}

@Override
public boolean retainAll(Collection<?> c) {
    boolean modified = false;
    Node<T> prev = null;
    Node<T> current = head;
    while (current != null) {
        if (!c.contains(current.data)) {
            if (prev == null) {
                head = current.next;
            } else {
                prev.next = current.next;
            }
            size--;
            modified = true;
        } else {
            prev = current;
        }
        current = current.next;
    }
    return modified;
}

@Override
public void clear() {
    head = null;
    size = 0;
}

@Override
public T get(int index) {
    if (index < 0 || index >= size) {
        throw new IndexOutOfBoundsException();
    }
    Node<T> current = head;
    for (int i = 0; i < index; i++) {
        current = current.next;
    }
    return current.data;
}

@Override
public T set(int index, T item) {
    if (index < 0 || index >= size) {
        throw new IndexOutOfBoundsException();
    }
    Node<T> current = head;
    for (int i = 0; i < index; i++) {
        current = current.next;
    }
    T data = current.data;
    current.data = item;
    return data;
}

@Override
public void add(int index, T item) {
    if (index < 0 || index > size) {
        throw new IndexOutOfBoundsException();
    }
    Node<T> newNode = new Node<>(item);
    if (index == 0) {
        newNode.next = head;
        head = newNode;
    } else {
        Node<T> prev = head;
        Node<T> current = head.next;
        for (int i = 1; i < index; i++) {
            prev = current;
            current = current.next;
        }
        prev.next = newNode;
        newNode.next = current;
    }
    size++;
}

@Override
public T remove(int index) {
    if (index < 0 || index >= size) {
        throw new IndexOutOfBoundsException();
    }
    T data;
    if (index == 0) {
        data = head.data;
        head = head.next;
    } else {
        Node<T> prev = head;
        Node<T> current = head.next;
        for (int i = 1; i < index; i++) {
          prev = current;
          current = current.next;
        }
        data = current.data;
        prev.next = current.next;
      }
      size--;
      return data;
    }

@Override
public int indexOf(Object o) {
    Node<T> current = head;
    int index = 0;
    while (current != null) {
        if (Objects.equals(o, current.data)) {
            return index;
        }
        index++;
        current = current.next;
    }
    return -1;
}

@Override
public int lastIndexOf(Object o) {
    Node<T> current = head;
    int index = -1;
    int i = 0;
    while (current != null) {
        if (Objects.equals(o, current.data)) {
            index = i;
        }
        i++;
        current = current.next;
    }
    return index;
}

@Override
public ListIterator<T> listIterator() {
    return new LinkedListIterator(0);
}

@Override
public ListIterator<T> listIterator(int index) {
    if (index < 0 || index > size) {
        throw new IndexOutOfBoundsException();
    }
    return new LinkedListIterator(index);
}

@Override
public List<T> subList(int fromIndex, int toIndex) {
    if (fromIndex < 0 || fromIndex > toIndex || toIndex > size) {
        throw new IndexOutOfBoundsException();
    }
    LinkedList<T> sublist = new LinkedList<>();
    Node<T> current = head;
    for (int i = 0; i < fromIndex; i++) {
        current = current.next;
    }
    for (int i = fromIndex; i < toIndex; i++) {
        sublist.add(current.data);
        current = current.next;
    }
    return sublist;
}

/**
 * Returns a string representation of this list.
 *
 * @return a string representation of this list
 */
@Override
public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("[");
    Node<T> current = head;
    while (current != null) {
        sb.append(current.data);
        if (current.next != null) {
            sb.append(", ");
        }
        current = current.next;
    }
    sb.append("]");
    return sb.toString();
}

/**
 * Node class represents a node in the linked list.
 *
 * @param <T> the type of elements in the node
 */
private static class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        this.next = null;
    }
}

/**
 * LinkedListIterator class provides an implementation of ListIterator for the LinkedList class.
 */
private class LinkedListIterator implements ListIterator<T> {
    private Node<T> current;
    private Node<T> lastReturned;
    private int currentIndex;

    LinkedListIterator(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        lastReturned = null;
        currentIndex = index;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T data = current.data;
        lastReturned = current;
        current = current.next;
        currentIndex++;
        return data;
    }
}

