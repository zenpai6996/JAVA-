class lab2 {
    public static void main(String[] args)
    {
    
    int x=121;
    int original = x;
    int rev=0,n;
    while(original!=0)
    {
    n = original % 10;
    rev=rev*10+n;
    original = original/10;
    }
    if(x == rev )
    {
     System.out.println("Palindrome");
    }
    else
    {
     System.out.println("Not Palindrome");
    }
    }
    }