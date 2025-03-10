// Time Complexity : O(1) for all operations (isEmpty, push, pop, peek)
// Space Complexity : O(1000) for the stack array
// Did this code successfully run on Leetcode : N/A
// Any problem you faced while coding this : No
class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        if(top == -1)
        {
            return true;
        }
        return false;
    } 

    Stack() 
    { 
        //Initialize your constructor 
        this.top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top == 999)
        {
            return false;
        }
        top++;
        a[top] = x;
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top == -1)
        {
            System.out.println(" Stack Underflow");
            return 0;
        }
        int y = top;    
        top--;
        return a[y];
    } 
  
    int peek() 
    { 
        //Write your code here
        if (top == -1) 
        {
            System.out.println("Stack is empty");
            return -1;
        }
        return a[top];
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
