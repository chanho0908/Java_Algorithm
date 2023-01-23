import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Stacks
{
    char a[] = new char[100];
    int top=-1;
    void push(char c)
    {
        try
        {
            a[++top]= c;
        }
        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println("Stack full, no room to push, size=100");
            System.exit(0);
        }
    }
    char pop()
    {
        return a[top--];
    }
    boolean isEmpty()
    {
        return (top==-1)?true:false;
    }
    char peek()
    {
        return a[top];
    }
}

public class InfixToPostfix
{
    static Stacks operators = new Stacks();

    public static void main(String[] args) throws IOException {
    String infix;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //get input from user
    System.out.println("Enter the infix expression you want to convert: ");
    infix = br.readLine();

    System.out.println("Postfix expression for the given infix expression is:" + toPostfix(infix));
}

private static String toPostfix(String infix)
{
    char symbol;
    String postfix = "";

    for (int i=0; i < infix.length(); i++)
    {
        symbol = infix.charAt(i);

        if (Character.isLetter(symbol)) postfix += symbol;
        else if (symbol == '(')
        {
            //push (
            operators.push(symbol);
        } else if (symbol == ')')
        // push everything back to(
        {
            while (operators.peek() != '(')
            {
                postfix += operators.pop();
            }
            operators.pop(); // remove'('
        }
        else //print operators occurring before it that have greater precedence
        {
            while (!operators.isEmpty() && !(operators.peek()=='(') && prec(symbol) <= prec(operators.peek()))
                postfix = postfix + operators.pop();
            operators.push(symbol);
        }
        }
    while (!operators.isEmpty())
        postfix = postfix + operators.pop();
    return postfix;
}
    static int prec(char x)
    {
        if (x == '+' || x == '-')
            return 1;
        if (x == '*' || x == '/' || x == '%')
            return 2;
        return 0;
    }
}


