import java.util.Scanner; 

class MyClass {
  public static void main(String[] args) {
    int x, y, sum;
    Scanner scanner = new Scanner(System.in); 
    System.out.println("Type a number:");
    x = scanner.nextInt(); 

    System.out.println("Type another number:");
    y = scanner.nextInt(); 

    sum = x + y;  
    System.out.println("Sum is: " + sum); 
  }
} 

 
    
