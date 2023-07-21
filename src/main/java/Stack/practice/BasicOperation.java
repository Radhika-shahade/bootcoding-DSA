package Stack.practice;
//push,pop,peek
public class BasicOperation {
    int top=-1;
    int arr[]=new int[6];
    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("stack is empty");
        }
        System.out.println(arr[top]);
            return arr[top--];
    }
    public void peek()
    {
        if(isEmpty())
        {
            System.out.println("stack is empty");
        }
        System.out.println(top);
    }


public void push(int value)
    {
       if(isFull())
       {
           System.out.println("stack is empty");
       }
       else {
           arr[++top]=value;
       }
        System.out.println(arr[top]);
    }
    public  boolean isFull()
    {
        return!(top <arr.length);
    }
    public boolean isEmpty()
    {
        return top==-1;
    }

    public static void main(String[] args) {
        BasicOperation obj= new BasicOperation();
        obj.push(20);
        obj.push(30);
        obj.push(45);
        obj.push(50);
        obj.pop();
         obj.peek();

    }


}
