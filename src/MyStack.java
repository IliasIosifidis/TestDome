public class MyStack {
  private int[] data;
  private int size;

  public MyStack() {
    this.data = new int[10];
    this.size = 0;
  }

  public void push(int value) {
    if (size == data.length) {
      int[] newData = new int[data.length * 2];
      for (int i = 0; i < size; i++) {
        newData[i] = data[i];
      }
      data = newData;
    }

    data[size] = value;
    size++;
  }

  public int pop() {
    if (size > 0){
      size--;
      return data[size];
    } else {
      throw new IndexOutOfBoundsException();
    }
    // remove and return the top; throw if empty
  }

  public int peek() {
    if (size == 0){
      throw new IndexOutOfBoundsException();
    } else {
      return data[size-1];
    }
    // return the top; throw if empty
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public int size() {
    return size;
  }

  public static void main(String[] args) {
    MyStack stack = new MyStack();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    System.out.println(stack.peek());    // 3
    System.out.println(stack.pop());     // 3
    System.out.println(stack.pop());     // 2
    System.out.println(stack.isEmpty()); // false
    System.out.println(stack.pop());     // 1
    System.out.println(stack.isEmpty()); // true

    // This should throw:
    try {
      stack.pop();
    } catch (RuntimeException e) {
      System.out.println("Correctly threw: " + e.getMessage());
    }
  }
}