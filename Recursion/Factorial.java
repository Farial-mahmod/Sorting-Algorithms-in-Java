/*
This Java Program implements Recursion. 
Recursion is the characteristic of a function for which it calls itself .
A function that keeps calling itself is known as a 'Recursive Function.'
*/


class Factorial{
    public static int factorial(int n){
      // returning n in case n is less than or equal to zero
        if(n<=0)
        return n;

        else{
            System.out.println(n);
          
          // returning the factorial values with recursive function calls
            return n * factorial(n-1);
        }
    }

    public static void main(String args[]){
      
      // calling factorial() function inside the same Factorial class
        System.out.println(factorial(5));
}}
