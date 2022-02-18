class MinStack {

  private Node head;

  public MinStack() {
  }

  public void push(int val) {
    if (head == null) {
      head = new Node(val, val, null);
      return;
    }
    head = new Node(val, Math.min(val, head.getMin()), head);
  }

  public void pop() {
    if (head != null) {
      head = head.getNext();
    }
  }

  public int top() {
    return head != null ? head.getValue() : 0;
  }

  public int getMin() {
    return head != null ? head.getMin() : 0;
  }
}

class Node {

  private Integer value;
  private Integer min;
  private Node next;

  public Node(Integer value, Integer min, Node next) {
    this.value = value;
    this.min = min;
    this.next = next;
  }

  public Integer getValue() {
    return value;
  }

  public Integer getMin() {
    return min;
  }

  public Node getNext() {
    return next;
  }
}