public class CustomStack {
    private String[] stack;
    private int top;

    public CustomStack(int size) {
        stack = new String[size];
        top = -1;
    }

    public void push(String element) {
        if (top == stack.length - 1) {
            System.out.println("Stack is full. Cannot push " + element);
        } else {
            stack[++top] = element;
        }
    }

    public String pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return null;
        } else {
            return stack[top--];
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    public void removeMiddle() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot remove the middle element.");
            return;
        }
        int middleIndex = top / 2;
        System.out.println("Removing middle element: " + stack[middleIndex]);
        for (int i = middleIndex; i < top; i++) {
            stack[i] = stack[i + 1];
        }
        top--;
    }

    public void multiPop(int n) {
        if (n > top + 1) {
            System.out.println("Invalid position. The stack has fewer elements than " + n);
        } else {
            System.out.println("Popping elements until position " + n);
            while (top >= n - 1) {
                System.out.println("Popped: " + pop());
            }
        }
    }

    public void swap(int index1, int index2) {
        if (index1 < 0 || index1 > top || index2 < 0 || index2 > top) {
            System.out.println("Invalid indices for swap.");
            return;
        }
        String temp = stack[index1];
        stack[index1] = stack[index2];
        stack[index2] = temp;
        System.out.println("Swapped elements at indices " + index1 + " and " + index2);
    }

    public boolean isBalanced() {
        if (top == -1) {
            System.out.println("Stack is empty. Cannot check balance.");
            return false;
        }
        int mid = top / 2;
        int sumFirstHalf = 0;
        int sumSecondHalf = 0;

        for (int i = 0; i <= mid; i++) {
            sumFirstHalf += Character.getNumericValue(stack[i].charAt(0));
        }
        for (int i = mid + 1; i <= top; i++) {
            sumSecondHalf += Character.getNumericValue(stack[i].charAt(0));
        }

        return sumFirstHalf == sumSecondHalf;
    }
}
