# Factorial-java
Factorial of n number using java

import java.lang.*;
public class Factorial {

public static void Factorial (int i,int n, int fact){
if(n==i){
fact*=i;
System.out.println("The factorial is: "+fact);
return;
}

fact*=i;
Factorial(i+1,n,fact);
}

public static void main(String[] args){
Factorial(1,5,1);
}
}
