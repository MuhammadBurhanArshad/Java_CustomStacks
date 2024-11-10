public class Main {
    public static void main(String[] args) {
        CustomStack customStack = new CustomStack(10);

        String regID = "2312395";
        for (char ch : regID.toCharArray()) {
            customStack.push(String.valueOf(ch));
        }

        customStack.printStack();

        customStack.removeMiddle();
        customStack.printStack();

        customStack.multiPop(3);
        customStack.printStack();

        customStack.swap(0, 1);
        customStack.printStack();

        boolean balanced = customStack.isBalanced();
        System.out.println("Is the stack balanced? " + balanced);
    }
}
