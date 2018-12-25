package data.queue;

import data.NodeItem;

import java.util.NoSuchElementException;

// Queues are first in first out (FIFO) data structures.
public class Queue<T> {
  private NodeItem<T> first;
  private NodeItem<T> last;

  /**
   * Add an item onto the end of the Queue
   * @param T item
   */
  public void add(T item) {
    NodeItem<T> t = new NodeItem<>(item);
    if (last != null) {
      last.next = t;
    }

    last = t;
    if (first == null) {
      first = last;
    }
  }

  /**
   * Remove first item in queue
   * @return T - First item in queue
   */
  public T remove() {
    if (first == null) {
      throw new NoSuchElementException();
    }

    T data = first.data;
    first = first.next;

    if (first == null) {
      last = null;
    }
    return data;
  }

  /**
   * Get first item in the stack
   * @return T - First item in stack
   */
  public T peek() {
    if (first == null) {
      throw new NoSuchElementException();
    }

    return first.data;
  }

  /**
   * Check if the Queue is empty;
   * @return Boolean - True if queue is empty else false
   */
  public boolean isEmpty() {
    return first == null;
  }
}