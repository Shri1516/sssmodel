package shri;
import java.util.Stack;  
public class StackExample
{  
public static void main(String[] args)   
{  
    //creating an instance of Stack class  
Stack<Integer> sss= new Stack<>();  
    // checking stack is empty or not  
boolean result = sss.empty();  
System.out.println("Is the stack empty? " + result);  
    // pushing elements into stack  
sss.push(100);  
sss.push(10);  
sss.push(50);  
sss.push(150);  
   //prints elements of the stack  
System.out.println("Elements in Stack: " + sss);  
result = sss.empty();  
System.out.println("Is the stack empty? " + result);  
}  
}  