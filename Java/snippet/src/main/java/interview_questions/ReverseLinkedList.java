package interview_questions;

public class ReverseLinkedList {
  // Question: Reverse a singly linked list.
  // Given a linked list: 1 -> 2 -> 3
  // Return the linked list reversed: 3 -> 2 -> 1
  public static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
    SinglyLinkedListNode prev = null;
    SinglyLinkedListNode current = head;
    SinglyLinkedListNode next = null;

    while (current != null) {
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }

    head = prev;
    return head;
  }
}
