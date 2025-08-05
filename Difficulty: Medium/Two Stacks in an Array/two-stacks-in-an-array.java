class twoStacks {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    twoStacks() {
        stack1=new Stack<>();
        stack2=new Stack<>();
    }

    // Function to push an integer into the stack1.
    void push1(int x) {
        // code here
        stack1.push(x);
    }

    // Function to push an integer into the stack2.
    void push2(int x) {
        stack2.push(x);
        // code here
    }

    // Function to remove an element from top of the stack1.
        
    int pop1() {
        // code here
        if(!stack1.isEmpty())
        {
            int ele=stack1.peek();
            stack1.pop();
            return ele;
        }
        else{
            return -1;
        }
    }

        
    // Function to remove an element from top of the stack2.
    int pop2() {
        // code here
        if(!stack2.isEmpty())
        {
            int ele=stack2.peek();
            stack2.pop();
            return ele;
        }
        else{
            return -1;
        }
    }
}