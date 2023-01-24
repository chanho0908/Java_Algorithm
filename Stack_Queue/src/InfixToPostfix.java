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
            a[++top]= c; // 값을 넣으면 top 이 추가된 값을 가르킴
        }
        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println("Stack full, no room to push, size=100");
            System.exit(0);
        }
    }
    char pop()
    {
        return a[top--]; //
    }
    boolean isEmpty()
    {
        return (top==-1) ? true:false;
    }
    char peek() // top 을 확인하는 메소드
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
    System.out.println("계산식을 입력하세요 : ");
    infix = br.readLine();

    System.out.println("Postfix to infix : " + toPostfix(infix));
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
        // ( 이 나올 때 까지 pop
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
    static int prec(char x) // 연산자 우선 순위
    {
        if (x == '+' || x == '-')
            return 1;
        if (x == '*' || x == '/' || x == '%')
            return 2;
        return 0;
    }
}


