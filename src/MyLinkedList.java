public class MyLinkedList {

  public static class Node {
    public int value;
    public Node next;

    public Node(int value) {
      this.value = value;
    }
  }

  public static Node append(Node head, int value) {
    if (head == null){
      return new Node(value);
    }
    Node current = head;
    while (current.next != null){
      current = current.next;
    }
    current.next = new Node(value);
    return head;
  }

  public static int length(Node head) {
    int count = 0;
    Node current = head;
    while (current != null){
      count++;
      current = current.next;
    }
    return count;
  }

  public static boolean hasCycle(Node head) {
    if (head == null) return false;
    Node slow = head;
    Node fast = head;
    while (fast != null && fast.next != null){
      slow = slow.next;
      fast = fast.next.next;
    }
    return false;
  }

  public static void main(String[] args) {
    // Build: 1 -> 2 -> 3 -> 4
    Node head = null;
    head = append(head, 1);
    head = append(head, 2);
    head = append(head, 3);
    head = append(head, 4);

    System.out.println(length(head));       // 4
    System.out.println(hasCycle(head));     // false

    // Now create a cycle: 4.next -> 2
    Node tail = head;
    while (tail.next != null) tail = tail.next;  // find the 4 node
    tail.next = head.next;                        // point it back to 2

    System.out.println(hasCycle(head));     // true
    // Don't call length(head) now — it'd loop forever!
  }
}