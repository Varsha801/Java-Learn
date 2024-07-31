import java.awt.*;
import java.awt.event.*;
// import java.io.FileInputStream;
// import java.io.FileNotFoundException;
// import java.io.FileOutputStream;
// import java.io.IOException;
// import java.io.ObjectInputStream;
// import java.io.ObjectOutputStream;
// import java.io.ObjectStreamClass;
// import java.io.Serializable;
// import java.util.ArrayList;
// import java.util.Calendar;
// import java.util.HashMap;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import swing.EventSwitchSelected;
import swing.SwitchButton;

// import Tools.Toolbox;




/** docs */
//each Java program should have only one class declared with public access specifier. 
//There cannot be two public classes in a single Java program.
//to print double quote \"\"
// to print backslash use two \
// sout+tab for System.out.println();
//whitespace does not matter 
// String is reference data type - stores and address -holds more than one variable
//    -takes more space 
 // System.out.println("\"Hello World\"");
    // double z= 3.14;
    // System.out.println(z);
    // String name="May";
    // System.out.println("Hello "+name);
    // String x="juice", y ="water" ,temp=null;
    // temp=x;
    // x=y;
    // y=temp;
    

    //using user inputs
    // import necessary package -import java.util.Scanner;
      //  Scanner scanner= new Scanner(System.in);
      //  System.out.println("name?");
      //  String name = scanner.nextLine();
      //  System.out.println("age?");
      //  int age = scanner.nextInt();
      //  scanner.nextLine();  //- if not used then scanner has next line character and does not read next input 
      //  System.out.println("Favorite food?");
      //  String food = scanner.nextLine();
      //  System.out.println("Hello "+name);
      //  System.out.println("You are " +age+ " years old");
      //  System.out.println("Your favorite food is "+food);


      //expressions , operands(values, variables, num,etc) , operators (+,-,/,%,*)

      // Basic GUI application
      //import javax.swing.JOptionPane;- to create simple gui dialog box
      /*String name= JOptionPane.showInputDialog("Enter your name ");
   JOptionPane.showMessageDialog(null,"Hello "+name);

   int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age "));
   // parseInt is a wrapper class since we want to convert string to integer 
      JOptionPane.showMessageDialog(null,"You are "+age+ "years old");
     // use of wrapper class is necessary when using non string data type 
     //Integer.parse is example of wrapper class */ 
     //A Wrapper class in Java is a class whose object wraps or contains primitive data types

     //Math class
  //  double x =3.14;
  //  double y = -10;
  //  //double z= Math.max(x,y);
  //  //double z= Math.abs(y);
  // // double z= Math.sqrt(y);
  // double z= Math.round(x);
  // // double z= Math.ceil(x); //always rounds up
  // // double z= Math.floor(x); // always rounds down
  //  System.out.println(z);

  //Hypotenuse of a triangle
 /*  double x ,y, z;
  Scanner scanner =new Scanner(System.in);
  System.out.println("Enter side x:");
  x= scanner.nextDouble();
  System.out.println("Enter side y:");
  y = scanner.nextDouble();
  z = Math.sqrt((x*x)+(y*y));
  System.out.println("The hypotenuse of the triangle is "+z+"cm");
  scanner.close();//to close scanner good practice*/

  //  //Generating  Random values (useful in game design)
  //  use class import java.util.Random;
  //   Random random =new Random();//pseudorandom numbers
  //   //int x = random.nextInt(6)+1; // limit in parantheses
  //   double x =random.nextDouble(); //b/w 0-1
  //   System.out.println(x);

  // if(condition){   //basic decision making 

  // }
  // else if(condition){

  // }
  // else{}

  // // switch case - test for equality against list of values , use instead of if-else 
  //  String day = "Monday ";
  //  switch(day){
  //   case "Sunday":System.out.println("YAY Sunday ! :)");
  //   break; // important to add ,otherwise displays all code 
  //   case "Monday":System.out.println("Sorry It's a Monday! :()");
  //   break; 
  //   case "Tuesday":System.out.println("It's a Tuesday ");
  //   break;
  //   //no match does nothing can add default 
  //   default:System.out.println("Not a Day "); 
  //  }


   //Logical operators 
    //&& (and), ||(or), !(not) 
    //can be used to evaluate a condition 
    // quit game program  
   /*  Scanner scanner= new Scanner(System.in);
    System.out.println("You are in the game!. Press q or Q to quit");
    String response = scanner.next();
    
    if(response.equals("q")|| response.equals("Q")){
      System.out.println("You quit the game!");
    }
    else {
      System.out.println("You are still in the game ");
    }
    scanner.close();*/ 

    //while - loops as long as condition is true 
    //isBlank()- check if variable is empty or blank 
    //do-while- executes atleast once
    // enter name example
//     import java.util.Scanner;
// public class Main{
//     public static void main(String args[]){
//         Scanner scanner = new Scanner(System.in);
//         String name=" ";
//         while(name.isBlank()){
//             System.out.print("Enter your name:");
//             name = scanner.nextLine();
//         }
//         System.out.println("Hello "+name);
//     }
// }


//for loop - loops specified amount of time 
// counter etc 

 // nested loops- loop inside loop
  // display rectangle of symbol
//    import java.util.Scanner;
// public class Main{
//     public static void main(String args[]){
//         Scanner scanner = new Scanner(System.in);
//         int rows,coloumns;
//         String symbol="";
//         System.out.println("Enter the number of rows:");
//         rows = scanner.nextInt();
//         System.out.println("Enter the number of coloumns:");
//         coloumns = scanner.nextInt();
//         System.out.println("Enter the symbol:");
//         symbol= scanner.next();
//         for(int i=1;i<=rows;i++){
//             System.out.println();
//             for(int j=1;j<=coloumns;j++){
//                 System.out.print(symbol);
//             }
//         }
//     }
//}

// array- multiple values in a single variable 
    //String[] cars = new String[3]; // how to declare an array and assign values later on 
    // traverse through an array using for loop

//2D array 

// import java.util.Scanner;
// public class Main{
//     public static void main(String args[]){
//         Scanner scanner = new Scanner(System.in);
//        String[][] cars={{"Volvo", "Tesla","BMW"},{"Volvo", "Tesla","BMW"},{"Volvo", "Tesla","BMW"}};
//        for(int i=0;i< cars.length;i++){
//            System.out.println();
//            for(int j=0; j< cars[i].length;j++){
//                System.out.print(cars[i][j]+" ");
//            }
//        }
//        scanner.close();
//     }
// }

// import java.util.Scanner;
// public class Main{
//     public static void main(String args[]){
//         Scanner scanner = new Scanner(System.in);
//         //String Methods--reference data type can  store one or more chars
//         //reference data types have access to useful methods
//          String name= "bro";
//          //boolean result = name.equalsIgnoreCase("Bro");// only equals considers case 
//          //int result = name.length();
//          //char result = name.charAt(0);
//          //int result = name.indexOf("o");
//         // boolean result= name.isEmpty();
//         //String result = name.toUpperCase();
//         //String result = name.toLowerCase();
//         //String result = name.trim();
//         String result = name.replace('o','a');
//          System.out.println(result);

//        scanner.close();
//     }

// }

//  public static void main(String args[]){
//         Scanner scanner = new Scanner(System.in);
//         //wrapper class - way to use primitive data type as ref data type
//         //1. Autoboxing
// //The automatic conversion of primitive types to the object of their corresponding wrapper classes is known as autoboxing. For example – conversion of int to Integer, long to Long, double to Double, etc. 
// //2. Unboxing
// //It is just the reverse process of autoboxing. Automatically converting an object of a wrapper class to its corresponding primitive type is known as unboxing. For example – conversion of Integer to int, Long to long, Double to double, etc. 
//       Boolean a= true; //Autoboxing
//       Integer b=123;
//       if(a==true){
//         System.out.println("this is true");  // Example of unboxing 
//       }
//       System.out.println(a);
//        scanner.close();
//     }

//ArrayList -  import java.util.ArrayList; a resizeable array 
       // store ref data types, elements can be added and removed after compilation phase 
      //  ArrayList<String> food = new ArrayList<String>();

      //  food.add("pizza");
      //  food.add("hamburger");
      //  food.add("hotdog");

      //  //to replace the elements of the list use the set method 
      //   food.set(0,"sushi");
      //   food.remove(2);
      //   food.clear();
      //   for(int i=0;i<food.size();i++) //with lists we use size() method instead of length() method 
      //   {
      //     System.out.println(food.get(i));
      //   }

      //2D array
     /*  import java.util.*;
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        //2D Arraylist -- container of multiple arrayLists 
        ArrayList<ArrayList<String>> groceryList = new ArrayList();
        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");
        ArrayList<String> produceList = new ArrayList();
        produceList.add("tomatoes");
        produceList.add("cucumber");
        produceList.add("peppers");

       ArrayList<String> drinkList = new ArrayList();
        drinkList.add("tea");
        drinkList.add("coffee");
        

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinkList);

        System.out.println(groceryList.get(0).get(0)); // to retrieve an element in 2D array list use get method twice
        // to retrieve an arrayList use single get method
       scanner.close();
    }
}*/
// for each loop
// import java.util.ArrayList;
// import java.util.Scanner;
// public class Main{
//     public static void main(String args[]){
//         Scanner scanner = new Scanner(System.in);
//        //foreach loop - iterate through elements in array/collections ,less steps , more readable , less flexible
//         //String[] animals={"cat", "dog","rat", "bird"}; //--array
//         ArrayList<String> animals = new ArrayList<String>(); // Collections
//         animals.add("cat");
//         animals.add("dog");
//         animals.add("rat");
//         animals.add("bird");
//         for(String i : animals ){ //(datatype index : (represents in ) array) 
//           System.out.println(i);
//         }
//        scanner.close();
//     }
// }

// //Methods - block of code executed when called 
// import java.util.Scanner;
// public class Main{
//     public static void main(String args[]){
//         Scanner scanner = new Scanner(System.in);
//         hello("Varsha"); // cannot call a non static method from static main . Hence add precede function with static keyword 
//        scanner.close();
//     }
//  static void hello(String name){  //naming convention suggests use lowercase for first letter of method main
//  System.out.println("Hello " + name );
// }
// }
// //should consist matching set of parameters and arguements.
// //return types- what is the data type of the value being returned .

//Overloaded methods - same name but different parameter to give each a unique method parameter 
// import java.util.Scanner;
// public class Main{
//     public static void main(String args[]){
//         Scanner scanner = new Scanner(System.in);
//         scanner.close();
//         int z= add(1,3);
//         System.out.println(z);

        
// }
//  static int add(int a,int b,int c){
//   System.out.println("You are in #1");
//   return a+b+c ;
//  }

//  static int add(int a, int b){
//   System.out.println("You are in #2");
//   return a+b;
//  }
// }

//printf() -- optional method to control , format and display text to console window 
// two arguements = format string + (object/variable/value)
// %[flags] [precision] [width] [conversion-character]
//%d-decimal , %b-boolean , %c- char ,%s-string , %f - float and double 
// width - min no of chars to be written as output eg -%10d adds 10 spaces before value
// giving negavtive number will left justify the value 
//precision - no of digits of  precision for float eg %.2f
// flag - adds effect to output 
// -: left-justify
// + : output that sign (+) or (-)
//0: numeric values are zero padded 
//, : comma grouping separator if numbers > 1000
// import java.util.Scanner;
// public class Main{
//     public static void main(String args[]){
//         Scanner scanner = new Scanner(System.in);
//         scanner.close();
//         System.out.printf("this is a %10s format string \n", "hello");
//          System.out.printf("this is a %-10s format string ", "hello");
//           System.out.printf("this is a %,f format string ",1000.00);
//  }
// }


//final keyword - cannot be changed for updated once declared 
// import java.util.Scanner;
// public class Main{
//     public static void main(String args[]){
//         Scanner scanner = new Scanner(System.in);
//         final double PI=3.1528378493776; // naming convention suggests using capital letters as variable name for final 
//         // PI=4; // throws an error 
//         System.out.println(PI);
//         scanner.close();
        
//  }
// }

//OOPs 
//object- instance of a class , has methods and attributes
//example using Car.java-- acts as a blueprint 
// import java.util.Scanner;
// public class Main{
//     public static void main(String args[]){
//         Scanner scanner = new Scanner(System.in);
//         scanner.close();
//         Car mycar = new Car(); // create an object of class
//         System.out.printf("%s,%s ",mycar.make,mycar.model);
//         mycar.fullThrottle();

//  }
// }

//Contructor - special method that is called when an object is instantiated/created 
// Example - Human.java
//help to construct object with varying attributes 
// this keyword is used to specify that the current construct object is equal to the parameters passed 
// this can also be used to access class method for an object parameters 
// *Check Human.java 
// import java.util.Scanner;
// public class Main{
//     public static void main(String args[]){
//         Scanner scanner = new Scanner(System.in);
//         scanner.close();
//         Human human = new Human("Bob",45,60.0); //diff objects with diff attributes
//         Human human2 =new Human("Mort", 16, 50);
//         Human human3 = new Human("blake", 23);// overloading eg 
//         System.out.println("human 1 name :"+human.name);
//         System.out.println("human 2 name :"+human2.name);

//         human.eat();
//         human2.drink();
//         human3.eat();
        
//  }
// }

//Output 
// human 1 name :Bob
// human 2 name :Mort

//Variable scope 
//local- declared inside a method , visible in that method
//global - declared outside a method , but within a class , visible to all parts of a class
//Example DiceRoller.java
//import java.util.Scanner;
// public class Main{
//     public static void main(String args[]){
//         Scanner scanner = new Scanner(System.in);
//         scanner.close();
//         DiceRoller diceRoller = new DiceRoller();
        
//  }
// }


//Overloaded constructors - multiple constructors within a class with a same name, but have diff parameters , similar to overloaded methods 
// name + parameter = signature 
//eg Human.java  and constructors main 

//toString - Special method that all objects inherit , that returns a string that testually represents an object 
// can be used both implicitly and explicitly
//eg Car.java 

// import java.util.Scanner;
// public class Main{
//     public static void main(String args[]){
//         Scanner scanner = new Scanner(System.in);
//         scanner.close();
//         Car car = new Car();
//         System.out.println(car); //o/p-Car@71c7db30 - this is the address of the object in memory , here we are implicitly calling the toString method
//         System.out.println(car.toString()); //same as above 
        
//         // we can overide the toString method and explicitly make it display a textual representation - see car.java 
        
//  }
// }


//array of objects 
// import java.util.Scanner;
// public class Main{
//     public static void main(String args[]){
//         Scanner scanner = new Scanner(System.in);
//         scanner.close();
//         //Food[] fridge = new Food[3];
//         Food food1 = new Food("pizza");
//         Food food2 = new Food("hamburger");
//         Food food3 = new Food("hotdog");
// // another way to add an array of objects is to directly assign the objects as array elements
//         Food[] fridge ={food1,food2,food3};
//         // fridge[0] = food1;
//         // fridge[1] = food2;
//         // fridge[2] = food3;

//         System.out.println(fridge[0].name);
//         System.out.println(fridge[1].name);
//         System.out.println(fridge[2].name);
        
//  }
// }

// class Food{
//   String name;
//   Food(String name){
//     this.name=name;

//   }
// }

//32.Pass objects as arguements 
// import java.util.Scanner;
// public class Main{
//     public static void main(String args[]){
//         Scanner scanner = new Scanner(System.in);
//         scanner.close();
//         Garage garage = new Garage();
//         Car1 car1 = new Car1("BMW");
//         Car1 car12 = new Car1("Tesla");
//         garage.park(car1);
//         garage.park(car12);
        
//  }
// }

// //We can use send the object as the arguement and use the class as the datatype 
// class Garage{
//   void park(Car1 car1){
//     System.out.println("The "+car1.name+ " is parked in the garage");
//   }
// }

// class Car1{
//   String name;
//   Car1 ( String name ){
//     this.name = name;
//   }
// }

//33.Static Keyword - modifier . A single copy of a variable/ method is created and shared .
// The class "owns" the static member  
// Do not have to create an object of the other class if modifier static is used.
//All the objects share the static variable . hence its best to access it using the class name 
// We can also create static methods and they can be called directly without creating an object-- eg Math class
// public class Main{
//     public static void main(String args[]){
//     Friends friend1 = new Friends("Katya");
//     Friends friend2 = new Friends("Trixie");  
//     Friends friend3 = new Friends("Bianca");  
//     //System.out.println(Friends.nfriends); // Static reference - total friends in a class 
//     //System.out.println(friend1.nfriends);  // will give output as 2 because same variable is shared by all objects of class 
//     Friends.displayFriends();  
//  }
// }

// class Friends {
//   static int nfriends;
//   String name;
//   Friends(String name){
//     this.name = name;
//     nfriends++;
//   }

//   static void displayFriends(){     //Static method 
//     System.out.println("You have "+nfriends+" friends");
//   }
// }

//34. Inheritance -- once class acquires the attributes and methods of another.
// import java.util.Scanner;
// public class Main{
//     public static void main(String args[]){
//         Scanner scanner = new Scanner(System.in);
//         scanner.close();
//         Car2 car = new Car2();
//         Bike bike = new Bike();
//         car.go();  // has attributes of vehicle class 
//         bike.stop();
//         System.out.println(car.doors);
//         System.out.println(bike.pedals);
//  }
// }

// class Vehicle {   //parent class or superclass
//   double speed;
//   void go(){
//     System.out.println("This vehicle is moving ");
//   }

//   void stop(){
//     System.out.println("This vehicle is stopped");
//   }
// }

// class Car2 extends Vehicle {  //Subclass or child class of vehicle
//   int wheels = 4;  // these are unique to this class other calss cannot use these attributes directly 
//   int doors = 4;
// }

// class Bike extends Vehicle{  //Subclass or child class of vehicle
//    int wheels = 2;
//    int pedals = 2; 
// }

// 35. method overriding -- Declaring a method in a sub class, that is already present in parent class,done so that a child class can give its own implementation 
// static methods cannot be overrided 

// import java.util.Scanner;
// public class Main{
//     public static void main(String args[]){
//         Scanner scanner = new Scanner(System.in);
//         scanner.close();
//         Animal animal = new Animal();
//         Dog dog = new Dog();
//         animal.speak(); // uses its method 
//         dog.speak(); //uses overriden method (own implementation)
//         //output the animal speaks
//               // the dog barks
        
//  }
// }

// class Animal {
//   void speak(){ //overriden method 
//     System.out.println("the animal speaks");
//   }
// }

// class Dog extends Animal {
//   @Override  //not neccessary but good practice 
//   void speak(){ // overriding method -- dogs has its own implementation of speak()
//     System.out.println("the dog barks");
//   }
// }

// 36. super keyword -- refers to superclass (parent ie need to use inheritence )
//similar to this keyword
// import java.util.Scanner;
// public class Main{
//     public static void main(String args[]){
//         Scanner scanner = new Scanner(System.in);
//         scanner.close();
//         Employed emp1 = new Employed("Bob",45,"accountant");
//         System.out.println(emp1);
//         // System.out.println(emp1.age);
//         // System.out.println(emp1.job);

        
//  }
// }

// class Person{
//   String name;
//   int age;
//   Person(String name,int age){
//     this.name = name ;
//     this.age = age ; 
//   }
//    public String toString(){
//       return name+"\n"+age+"\n";
//    }
// }

// class Employed extends Person{
//     String job;
//     Employed(String name , int age , String job){
//         super(name,age);  // Cannot use this keyword since we have to access constructor of parent class 
//         this.job = job ;
//     }

//     public String toString(){
//       return job;
//    }

// }

// 37. abstraction
//abstract - keyword 
// abstract classes - cannot be instantiated , but they can have a subclass 
// abstract methods are declared without an implementation
//adds a layer of security 
// import java.util.Scanner;
// public class Main{
//     public static void main(String args[]){
//         Scanner scanner = new Scanner(System.in);
//         scanner.close();
//        // Vehicle vehicle = new Vehicle(); // gives an error since we cannot create an instance of abstract class
//         Car2 car = new Car2();
//         car.go();
//  }
// }

//  abstract class Vehicle {   //now we cannot create an instance of this class
//   double speed;
//   abstract void go(); // does not need a body , also it is not possible to add a body , it throws an error 

//   void stop(){
//     System.out.println("This vehicle is stopped");
//   }
// }

// class Car2 extends Vehicle {  //must implement the method of abstract class
//   int wheels = 4;   
//   int doors = 4;
//   @Override // we are forced to override since it is an abstract method
//   void go(){
//     System.out.println("the car is running ");
//   }
// }


//38. Access Specifiers in Java - add security to our programs 
// creating packages - 79 chapter 
//default--
//public--
//protected--
//private--

// 39. Encapsulation -- attributes of a class being hidden or private ,
// can be accessed only through methods(get and set )
//layer of security 
// import java.util.Scanner;
// public class Main{
//     public static void main(String args[]){
//         Scanner scanner = new Scanner(System.in);
//         scanner.close();
//         Car car = new Car("Swift", "Maruti", 2021);
//         System.out.println(car.getMake()); // not visisble if we use car.make , since private , have to use the get method 
//         //car.year = 2022; // not visible error have to use set method 
//         car.setYear(2022);
//         System.out.println(car.getYear()); 
       
//     }
// }

//40. Copy objects in java 

// public class Main{
//     public static void main(String args[]){
//         Car car = new Car("Swift", "Maruti", 2021);
//         Car car2 = new Car("Ford", "Mustang", 2022);
//        // car = car2; // will not copy , instead give car another name , will have the space in memory 
//        car2.copy(car); 
//         System.out.println(car.getMake()); // not visisble if we use car.make , since private , have to use the get method 
//         //car.year = 2022; // not visible error have to use set method 
//         car.setYear(2022); // have to create a method in Car to copy 
//         System.out.println(car.getYear()); 
       
//     }
//    }

//41.Interface 
//Template that can be applied to a class
//similar to inheritance , but specifies what a class has/must do.
// classes can apply more than one interface , inheritance id limited to 1 super class
//  interface Prey{
// void flee(); // works like abstract methods

// }

// interface Predator{
//    void hunt();
// }

// class Rabbit implements Prey{
//   public void flee(){
//     System.out.println("The rabbit is fleeing");
//   }
// }

// class Hawk implements Predator{
//  public void hunt(){
//   System.out.println("the hawk is hunting ");
//  }
// }

// class Fish implements Prey,Predator{
//   public void flee(){
//     System.out.println("The fish is fleeing from larger fish");
//   }
//   public void hunt(){
//   System.out.println("The fish is hunting smaller fish ");
//  }
// }
// public class Main{
//     public static void main(String args[]){
//        Fish fish = new Fish();
//        fish.flee();
//        fish.hunt();
       
//     }
//    }

//42.Polymorphism -- 
//many forms 
//ability of an object to identify as more than one type 
// public class Main{
//     public static void main(String args[]){
//        Carz carz = new Carz();
//        Boat boat = new Boat();
//        Bicycle bicycle = new Bicycle();
//        Vehicle[] racers = {carz , bicycle , boat };
//        for(Vehicle x : racers){
//           x.go();
//        }
//     }
//    }
//    class Vehicle {   //parent class or superclass
//    public void go(){
//     System.out.println("the bicycle is moving ");
//   }
// }

// class Boat extends Vehicle {  //Subclass or child class of vehicle
//   @Override
//   public void go(){
//     System.out.println("the boat is moving ");
//   }
// }

// class Bicycle extends Vehicle{  //Subclass or child class of vehicle
//   @Override 
//   public void go(){
//     System.out.println("the bicycle is moving ");
//   }
// }
 
// class Carz extends Vehicle {  //Subclass or child class of vehicle
//   @Override
//   public void go(){
//     System.out.println("the car is moving ");
//   }
// }

//Dynamic Polymorphism
// after complilation(during runtime)
// import java.util.Scanner;
// public class Main{
//     public static void main(String args[]){
//         Scanner scanner = new Scanner(System.in);
//         Animal animal ; 
//         System.out.println("Which animal? 1-Dog 2-Cat");
//         int choice = scanner.nextInt();
//         if (choice == 1 ){
//           animal = new Dog();
//           animal.speak();
//         }
//         else if (choice == 2 ){
//           animal = new Cat();
//           animal.speak();
//         }
//         else {
//           animal = new Animal();
//           System.out.println("Invalid");
//           animal.speak();
//         }
      
//       scanner.close();
//  }
// }

// class Animal {
// public void speak(){
//   System.out.println("Brr");
// }
// }

// class Dog extends Animal{
//   @Override
// public void speak(){
//   System.out.println("Bark");
// }
// }

// class Cat extends Animal{
//   @Override
//  public void speak(){
//   System.out.println("meow");
// }
// }

//Exception Handling 
//Exception - An event that occurs during the execution of a program that disrupts the flow 
//import java.util.InputMismatchException;
// import java.util.Scanner;
// public class Main{
//   public static void main(String args[]){
//         Scanner scanner = new Scanner(System.in);
//         try{
//           System.out.println("Enter your age:");
//           int age = scanner.nextInt();
//           System.out.printf("You are %d years old",age);
//         }
//         // catch(InputMismatchException e){ //Specific exception
//         //   System.out.println("enter numeric value!");
//         // }

//         catch(Exception e){ //generic
//           System.out.println("Something went wrong!");
//         }
//         finally{
//           scanner.close();
//         }
//       }
//     }

//45.File class
// import java.io.File;
// public class Main{
//     public static void main(String args[]){
//     File file = new File("D:\\Java_learn\\file_handle\\hello.txt"); 
//     if(file.exists()){
//       System.out.println("it exists");
//       System.out.println(file.getPath());
//       System.out.println(file.getAbsolutePath());
//       System.out.println(file.isFile());
//       file.delete();
//     }
//     else{
//       System.out.println("it does not exist");
//     } 
//     }
//   }

//46.Write to a class
// import java.io.File;
// import java.io.FileWriter;
// import java.io.IOException;
// public class Main{
//     public static void main(String args[]){
//       try{
//         FileWriter writer = new FileWriter("poem.txt");
//         writer.write("Roses are red\nViolets are blue");
//         writer.append("\nPoem by me");
//         writer.close();
//       }
//       catch (IOException e){
//         e.printStackTrace();
//       }
//     }
//   }

//47.File Reader
// import java.io.FileNotFoundException;
// import java.io.FileReader;
// import java.io.IOException;
// public class Main{
//     public static void main(String args[]){
//       try{
//         FileReader reader = new FileReader("poem.txt");
//         int data = reader.read();
//         while(data != -1){
//           System.out.print((char)data);
//           data = reader.read();
//         }
//         reader.close();
//       }
//       catch (FileNotFoundException e){
//         e.printStackTrace();
//       }
//       catch (IOException e){
//         e.printStackTrace();
//       }
//     }
//   }

  //48.Audio-- requires wave audio file.Java inbuilt libraries support only AIFC, AIFF, AU, SND and WAVE formats.
//   import java.io.File;
// import java.io.IOException;
// import java.util.Scanner;

// import javax.sound.sampled.*;
//   public class Main{
//      public static void main(String args[]) throws UnsupportedAudioFileException,IOException,LineUnavailableException{
//       Scanner scanner = new Scanner(System.in);
      
//       File file = new File("sunflower-street-drumloop-85bpm-163900.wav");
//      AudioInputStream audioStream  = AudioSystem.getAudioInputStream(file);
//      Clip clip = AudioSystem.getClip();
//      clip.open(audioStream);
//      String response = "";
//      //clip.loop(Clip.LOOP_CONTINUOUSLY);
//      //clip.start();
     
//       while (!response.equals("Q")){
//         System.out.println("P = play , S = stop , R = reset , Q = Quit");
//         System.out.println("Enter your choice: ");
//         response = scanner.next();
//         response = response.toUpperCase();

//         switch(response){
//           case ("P"): clip.loop(Clip.LOOP_CONTINUOUSLY);
//           break;
//           case ("S"):clip.stop();
//           break;
//           case ("R"):clip.setMicrosecondPosition(0);
//           break;
//           case ("Q"):clip.close();
//           break;
//           default :System.out.println("not a valid response");
//         }
//       }
//       System.out.println("Bye");
//      scanner.close();

//     } 
//     }

//49 . JFrame = A GUI window to add components to 





//  public class Main{
//       public static void main(String args[]){
//         // JFrame frame = new JFrame(); // creates a frame
//         // frame.setTitle("JFrame title"); 
//         // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
//         // frame.setResizable(false);// prevent frame from being resized
//         // frame.setSize(420,420); // x and y dimension
//         // frame.setVisible(true); 
//         // ImageIcon image = new ImageIcon("company_logo.png"); //creates an image icon 
//         // frame.setIconImage(image.getImage()); // change icon of frame 
//         // frame.getContentPane().setBackground(new Color(100,20,10));
//         new  MyFrame();
//       }}

//       class MyFrame extends JFrame{
//         MyFrame(){
         
//         this.setTitle("JFrame title"); 
//         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
//         this.setResizable(false);// prevent frame from being resized
//         this.setSize(420,420); // x and y dimension
//         this.setVisible(true); 
//         ImageIcon image = new ImageIcon("company_logo.png"); //creates an image icon 
//         this.setIconImage(image.getImage()); // change icon of frame 
//         this.getContentPane().setBackground(new Color(100,20,10));
//         }
//       }


//50. Labels - a GUI display area for a string of text , an image , or both 
// public class Main{
//       public static void main(String args[]){
//         ImageIcon image = new ImageIcon("company_logo.png"); //creates an image icon 
//         Border border = BorderFactory.createLineBorder(Color.BLUE,3);
        

//         JLabel label = new JLabel();// create a label
//         label.setText("Hello "); //set text to a label
//         JFrame frame = new JFrame(); // creates a frame
//         frame.setTitle("JFrame title"); 
//         label.setIcon(image); 
//         label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT,CENTER , RIGHT of image icon
//         label.setVerticalTextPosition(JLabel.TOP); // set text TOP , CENTER , BOTTOM of image icon 
//         label.setForeground(new Color(50,50,50)); // set text color
//         label.setFont(new Font("MV Boli",Font.BOLD,20)); //set text font
//         //label.setIconTextGap(-10); //set gap of text to image
//         label.setBackground(Color.GRAY); // set background color
//         label.setOpaque(true); //display background color
//         label.setBorder(border);
//         label.setVerticalAlignment(JLabel.CENTER); // set vertical position within label
//         label.setHorizontalAlignment(JLabel.CENTER); // within label
//         label.setBounds(100,100,250,250); //set x , y position within frame as well as dimension 
        

//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
//         //frame.setResizable(false);// prevent frame from being resized
//         frame.setSize(420,420); // x and y dimension
//         frame.setVisible(true); 
//         //frame.setLayout(null);
//         frame.add(label);
//         frame.pack(); // resize the frame to fit the components//add all components before using pack()
//       }
//     }

// 51.Panels - 
// GUI component that functions as a container to hold other components 
//  public class Main{
//       public static void main(String args[]){

//         JLabel label = new JLabel();
//         label.setText("Hi");
//        label.setVerticalAlignment(JLabel.TOP);
//        label.setHorizontalAlignment(JLabel.RIGHT);
//        //label.setBounds(100, 100, 75, 75);   // not needed if we are using boderlayout and vice versa 
        
        
//         JPanel redpanel = new JPanel();
//         redpanel.setBackground(Color.red);
//         redpanel.setBounds(0,0,250,250);
//         redpanel.setLayout(new BorderLayout());

//         JPanel blue_panel = new JPanel();
//         blue_panel.setBackground(Color.blue);
//         blue_panel.setBounds(250,0,250,250);

//         JPanel greenpanel = new JPanel();
//         greenpanel.setBackground(Color.green);
//         greenpanel.setBounds(0,250,250,250);
        

        
//         JFrame frame = new JFrame(); // creates a frame
//         frame.setTitle("JFrame title"); 
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
//         frame.setLayout(null);
//         frame.setSize(450,450); // x and y dimension
//         frame.setVisible(true);
//         frame.add(redpanel);
//         frame.add(blue_panel);
//         frame.add(greenpanel);

//         redpanel.add(label);
//       }
//     } 


//52.Buttons 
// JButton - performs an action when clicked 
// public class Main{
//        public static void main(String args[]){
//           new MyFrame();
//        }
//       }


// class MyFrame extends JFrame implements ActionListener{
//   JButton button;
//   JLabel label;
//   MyFrame(){
//     ImageIcon image = new ImageIcon("company_logo.png");
//     ImageIcon img = new ImageIcon("company_logo.png");
//     label = new JLabel();
//     label.setIcon(img);
//     label.setBounds(200,200,200,100);
//     label.setVisible(false);


//     button = new JButton();
//     button.setBounds(100, 100, 300, 100);
//     button.addActionListener(this); //e -> System.out.println("goo")
//     button.setText("I'm a button");
//     button.setFocusable(false);
//     button.setIcon(image);
//     button.setVerticalTextPosition(JButton.BOTTOM);
//     button.setHorizontalTextPosition(JButton.CENTER);
//     button.setFont(new Font("Comic Sans", Font.BOLD , 25));
//     button.setIconTextGap(-15);
//     button.setForeground(Color.CYAN);
//     button.setBackground(Color.LIGHT_GRAY);
//     button.setBorder(BorderFactory.createEtchedBorder());
//    // button.setEnabled(false); // To disable button 

//     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
//     this.setLayout(null);
//     this.setSize(420,420); // x and y dimension
//     this.setVisible(true);
//     this.add(button);
//     this.add(label);
//   }

//   @Override
//   public void actionPerformed(ActionEvent e) {
//     if(e.getSource()==button){
//       System.out.println("goo");
//     button.setEnabled(false); //enable only once 
//     label.setVisible(true);
//     }
//     }
//   }

//53.BorderLayout 
//Layout Manager - defines the natural layout for components within a container 
//3 common managers
//A BorderLayout places components in five areas : north,east, south, west ,center
//extra space is placed in center.
// public class Main{
//        public static void main(String args[]){
//          JFrame frame = new JFrame(); 
//          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//          frame.setLayout(new BorderLayout(10,10));
//          frame.setSize(450,450); // x and y dimension
//          frame.setVisible(true);

//          JPanel panel1 = new JPanel();
//          JPanel panel2 = new JPanel();
//          JPanel panel3 = new JPanel();
//          JPanel panel4 = new JPanel();
//          JPanel panel5 = new JPanel();

//          panel1.setBackground(Color.red);
//          panel2.setBackground(Color.green);
//          panel3.setBackground(Color.yellow);
//          panel4.setBackground(Color.magenta);
//          panel5.setBackground(Color.blue);

//          panel1.setPreferredSize(new Dimension(100, 100));
//          panel2.setPreferredSize(new Dimension(100, 100));
//          panel3.setPreferredSize(new Dimension(100, 100));
//          panel4.setPreferredSize(new Dimension(100, 100));
//          panel5.setPreferredSize(new Dimension(100, 100));

//          //-------------------------Subpanels
//          JPanel panel6 = new JPanel();
//          JPanel panel7 = new JPanel();
//          JPanel panel8 = new JPanel();
//          JPanel panel9 = new JPanel();
//          JPanel panel10 = new JPanel();

//          panel6.setBackground(Color.black);
//          panel7.setBackground(Color.darkGray);
//          panel8.setBackground(Color.gray);
//          panel9.setBackground(Color.lightGray);
//          panel10.setBackground(Color.white);

//          panel5.setLayout(new BorderLayout(10,10));

//          panel6.setPreferredSize(new Dimension(50 , 50));
//          panel7.setPreferredSize(new Dimension(50 , 50));
//          panel8.setPreferredSize(new Dimension(50 , 50));
//          panel9.setPreferredSize(new Dimension(50 , 50));
//          panel10.setPreferredSize(new Dimension(50 , 50));

//          panel5.add(panel6, BorderLayout.NORTH);
//          panel5.add(panel7, BorderLayout.WEST);
//          panel5.add(panel8, BorderLayout.EAST);
//          panel5.add(panel9, BorderLayout.SOUTH);
//          panel5.add(panel10, BorderLayout.CENTER);

//          frame.add(panel1,BorderLayout.NORTH); //changes dimension horizontally when expanded 
//          frame.add(panel2,BorderLayout.WEST);
//          frame.add(panel3,BorderLayout.EAST);
//          frame.add(panel4,BorderLayout.SOUTH);
//          frame.add(panel5,BorderLayout.CENTER);
//        }
//       }


//54.FlowLayout 
//places components in a row , sized at their preferred size .
//if horizontal space in the conatainer is too small , the FlowLayout class uses the next available row 
// public class Main{
//        public static void main(String args[]){
//          JFrame frame = new JFrame(); 
//          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//          frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));//default is center 
//          frame.setSize(450,450); // x and y dimension
         
//         JPanel panel = new JPanel();
//         panel.setPreferredSize(new Dimension(250, 250));
//         panel.setBackground(Color.LIGHT_GRAY);
//         panel.setLayout(new FlowLayout());

//         panel.add(new JButton("1"));
//         panel.add(new JButton("2"));
//         panel.add(new JButton("3"));
//         panel.add(new JButton("4"));
//         panel.add(new JButton("5"));
//         panel.add(new JButton("6"));
//         panel.add(new JButton("7"));
//         panel.add(new JButton("8"));
//         panel.add(new JButton("9"));
       
//         frame.add(panel);
//         frame.setVisible(true); 
//        }
//       }

//55.GridLayout 
//Places components in a grid of cells 
//Each component takes all the available space within its cell, and each cell is the same size .
// public class Main{
//        public static void main(String args[]){
//         JFrame frame = new JFrame(); 
//          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//          frame.setLayout(new GridLayout(3,3,10,4)); //rows and coloumns 
//          frame.setSize(450,450);
//          frame.add(new JButton("1"));
//          frame.add(new JButton("2"));
//          frame.add(new JButton("3"));
//          frame.add(new JButton("4"));
//          frame.add(new JButton("5"));
//          frame.add(new JButton("6"));
//          frame.add(new JButton("7"));
//          frame.add(new JButton("8"));
//          frame.add(new JButton("9"));
//          frame.add(new JButton("10"));

//          frame.setVisible(true);
//        }
//       }

//56. LayeredPane 
//Swing container that provides a third dimension for positioning components ex. depth , Z-index
// public class Main{
//        public static void main(String args[]){
//         JLabel label1 = new JLabel();
//         label1.setOpaque(true);
//         label1.setBackground(Color.red);
//         label1.setBounds(50,50,200,200);

//         JLabel label2 = new JLabel();
//         label2.setOpaque(true);
//         label2.setBackground(Color.green);
//        label2.setBounds(100,100,200,200);

//         JLabel label3 = new JLabel();
//         label3.setOpaque(true);
//         label3.setBackground(Color.blue);
//         label3.setBounds(150,150,200,200);

//         JLayeredPane layeredPane = new JLayeredPane();
//         layeredPane.setBounds(0, 0, 500, 500);
//         layeredPane.add(label1, Integer.valueOf(0)); //or JLayeredPane.DEFAULT_LAYER can be used to detemine oder
//         layeredPane.add(label2,Integer.valueOf(1));
//         layeredPane.add(label3,Integer.valueOf(2));

//         JFrame frame = new JFrame("JLayeredPane"); 
//         frame.add(layeredPane);
//          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//          frame.setLayout(null); //rows and coloumns 
//          frame.setSize(450,450);
//          frame.setVisible(true);
//        }
//       }

//57.open a new GUI window --New Project -- Desktop

//58.Joption Pane 
//pop up a standard dialog box that prompts users for a value or informs them of something. 

// public class Main{
//   public static void main(String[] args) {
//     //JOptionPane.showMessageDialog(null, "This is some useless info", null, JOptionPane.PLAIN_MESSAGE);
//     //JOptionPane.showMessageDialog(null, "This is some useless info", null, JOptionPane.INFORMATION_MESSAGE);
//     // JOptionPane.showMessageDialog(null, "This is some useless info", null, JOptionPane.QUESTION_MESSAGE);
//     // JOptionPane.showMessageDialog(null, "This is some useless info", null, JOptionPane.WARNING_MESSAGE); // can use while(true) to keep it looping 
//     // JOptionPane.showMessageDialog(null, "This is some useless info", null, JOptionPane.ERROR_MESSAGE);

//     //Show confirm dialog
//     //System.out.println( JOptionPane.showConfirmDialog(null,"Do you code?","title",JOptionPane.YES_NO_CANCEL_OPTION));
   
//     //Show input dialog - User can type in message 
//     // String name = JOptionPane.showInputDialog("What is your name?");
//     // System.out.println("Hello "+name);

//     //Show option dialog
//     String[] responses = {"NO","Thank YOU!",":)"};

//     ImageIcon icon = new ImageIcon("company_logo.png");
//     JOptionPane.showOptionDialog(null,"You are Awesome!","Title",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,icon,responses,0);
//   }
// }

//59.Textgfield 
//JTextField - A GUI textbox component that can be used to add , set , or get text 
// public class Main{
//   public static void main(String[] args) {
//       MyFrame frame = new MyFrame();

//   }
// }

// class MyFrame extends JFrame implements ActionListener{

//   JButton button;
//   JTextField textField;


//   MyFrame(){
//     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
//     this.setLayout(new FlowLayout());

//     // button = new JButton("Submit");
//     // button.addActionListener(this);

//     textField = new JTextField();
//     textField.setPreferredSize(new Dimension(250,40));
//     textField.setFont(new Font("Times New Roman",Font.PLAIN,35));
//     //textField.setForeground(new Color(55,55,55));
//     //textField.setBackground(Color.red);
//     textField.setCaretColor(Color.WHITE);  // Color of the cursor 
//     textField.setText("username");
     

//     //this.add(button);
//     this.add(textField);
//     this .setSize(400,400);
//     //this.pack();
//     this.setVisible(true);
//   }

//   @Override
//   public void actionPerformed(ActionEvent e) {
//    if(e.getSource()== button ){
//     button.setEnabled(false);
//     System.out.println("Welcome "+ textField.getText());
//     textField.setEditable(false);
//    }
//   }
  
// }

// 60. Checkbox 
//JCheckBox = A Gui component taht can be selected or deselected 
// public class Main{
//   public static void main(String[] args) {
//     new MyFrame();
//   }
// }

// class MyFrame extends JFrame implements ActionListener{

//   JButton button;
//   JCheckBox checkBox;
//   ImageIcon xIcon;
//   ImageIcon checkIcon;
//   int width=32;
//   int height=32;
//    MyFrame(){
//     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
//     this.setLayout(new FlowLayout());

//     xIcon = new ImageIcon("no.png");
//     checkIcon = new ImageIcon("yes.png");

//      Image image = xIcon.getImage();
//      ImageIcon Xicon = new ImageIcon(image.getScaledInstance(width, height, Image.SCALE_SMOOTH));

//      Image image2 = checkIcon.getImage();
//      ImageIcon Checkicon =  new ImageIcon(image2.getScaledInstance(width, height, Image.SCALE_SMOOTH));
    
//     button = new JButton();
//     button.setText("Submit");
//     button.addActionListener(this);

//     checkBox = new JCheckBox();
//     checkBox.setText("I,m not a robot");
//     checkBox.setFocusable(false);
//     checkBox.setFont(new Font("Consolas",Font.PLAIN,35));
//     checkBox.setIcon(Xicon);
//     checkBox.setSelectedIcon(Checkicon);
    
//     this.add(button); 
//     this.add(checkBox);
    
//     this.pack();
//     this.setVisible(true);
//   }

//   @Override
//   public void actionPerformed(ActionEvent e) {
//    if(e.getSource()== button ){
//     //button.setEnabled(false);
//     System.out.println(checkBox.isSelected());
//     }
//   }
  
// }

//61.radio buttons 
//JRadioButton
// public class Main{
//   public static void main(String[] args) {
//     new MyFrame();
//   }
// }

// class MyFrame extends JFrame implements ActionListener{

// JRadioButton pizzaButton;
// JRadioButton hamburgerButton;
// JRadioButton hotdogButton; 
// ImageIcon pizza;
// ImageIcon ham;
// ImageIcon hotdog;

//    MyFrame(){
//     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
//     this.setLayout(new FlowLayout());
//     pizza = new ImageIcon(new ImageIcon("pizza.jpg").getImage().getScaledInstance(32, 32, Image.SCALE_DEFAULT));
//     ham = new ImageIcon(new ImageIcon("ham.jpg").getImage().getScaledInstance(32, 32, Image.SCALE_DEFAULT));
//     hotdog = new ImageIcon(new ImageIcon("hotdog.jpg").getImage().getScaledInstance(32, 32, Image.SCALE_DEFAULT));


//     pizzaButton = new JRadioButton("pizza");
//     hamburgerButton = new JRadioButton("hamburger");
//     hotdogButton = new JRadioButton("hotdog");

//     pizzaButton.setIcon(pizza);
//     hamburgerButton.setIcon(ham);
//     hotdogButton.setIcon(hotdog);

//     ButtonGroup group = new ButtonGroup();
//     group.add(pizzaButton);
//     group.add(hamburgerButton);
//     group.add(hotdogButton);
//     pizzaButton.setFocusable(false);
//     hamburgerButton.setFocusable(false);
//     hotdogButton.setFocusable(false);

    
//     pizzaButton.addActionListener(this);
//     hamburgerButton.addActionListener(this);
//     hotdogButton.addActionListener(this);


//     this.add(pizzaButton);
//     this.add(hamburgerButton);
//     this.add(hotdogButton);
//     this.pack();
//     this.setVisible(true);
//   }

//   @Override
//   public void actionPerformed(ActionEvent e) {
//     if(e.getSource() == pizzaButton){
//         System.out.println("You get Pizza!");
//     }
//     else if(e.getSource() == hamburgerButton){
//         System.out.println("You get hamburger!");
//     }
//     else if(e.getSource() == hotdogButton){
//         System.out.println("You get hotdog!");
//     }
//   }
  
// }

//combobox
//JComboBox = combines button or editable field ans a drop down list 
// public class Main{
//   public static void main(String[] args) {
//     new MyFrame();
//   }
// }

// class MyFrame extends JFrame implements ActionListener{

// JComboBox comboBox;

//    MyFrame(){
//     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
//     this.setLayout(new FlowLayout());
//     String[] animals = {"dog","cat","bird"}; //have to use reference data type , cannot use primitive data types; can use wrapper classes instead
//     comboBox = new JComboBox(animals);
//     comboBox.setPreferredSize(new Dimension(100,30));
//     comboBox.addActionListener(this);
//     //comboBox.setEditable(true);
//     // comboBox.insertItemAt("horse",0);
//     // comboBox.setSelectedIndex(0);
//     //comboBox.removeItemAt(0);
//     //comboBox.removeItem("dog");
//     //comboBox.removeAllItems();
//     this.add(comboBox);
//     this.pack();
//     this.setVisible(true);
//   }

//   @Override
//   public void actionPerformed(ActionEvent e) {
//    if(e.getSource()==comboBox){
//     System.out.println(comboBox.getSelectedItem());
//     //System.out.println(comboBox.getSelectedIndex());
//    }
  
// }
// }

//Slider
//adjustable sliding knob on a track
// public class Main{
//   public static void main(String[] args) {
//     SliderDemo sliderDemo = new SliderDemo();
// }
// }

// class SliderDemo implements ChangeListener{
//   JFrame frame;
//   JPanel panel;
//   JLabel label;
//   JSlider slider;
//   SliderDemo(){
//       frame = new JFrame("Slider Demo");
//       panel = new JPanel();
//       label = new JLabel();
//       slider = new JSlider(0,100,50);
//       slider.setPaintTicks(true);
//       slider.setMinorTickSpacing(10);
//       slider.setPaintTrack(true);
//       slider.setMajorTickSpacing(25);
//       slider.setPaintLabels(true);
//       slider.setFont(new Font("Times New Roman",Font.PLAIN,15));
//       slider.setOrientation(SwingConstants.VERTICAL);
//       label.setText("°C = "+ slider.getValue());
//       slider.addChangeListener(this);
//       panel.add(slider);
//       panel.add(label);
//       frame.add(panel);
//       frame.pack();
//       frame.setVisible(true);
//   }

//   @Override
//   public void stateChanged(ChangeEvent e) {
//     label.setText("°C = "+ slider.getValue());
//   }

  

// }

//progress bar = to let user know that an operation is processing 
// public class Main{
//   public static void main(String[] args) {
//     ProgressBarDemo Demo = new ProgressBarDemo();
//   }
// } 

// class ProgressBarDemo{
//   JFrame frame = new JFrame();
//   JProgressBar bar = new JProgressBar(0,500);

//   ProgressBarDemo(){

//     bar.setValue(0);
//     bar.setBounds(0,0,420,50);
//     bar.setStringPainted(true);
//     bar.setFont(new Font("MV Boli",Font.PLAIN,25));
//     bar.setForeground(Color.RED);
//     bar.setBackground(Color.black);

//     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
//     frame.setLayout(null);
//     frame.setSize(450,450);
//     frame.setVisible(true);
//     frame.add(bar);

//     fill();
//   }

//   public void fill(){
//     int counter = 500;
//     while(counter>0){
//       bar.setValue(counter);
//       try{
//       Thread.sleep(50);
//       }
//       catch(InterruptedException e){
//         e.printStackTrace();
//       }
//       counter -= 1;
//     }
//     bar.setString("Done! ");
//   }
// }

//Menubar 
//setnuemonic method to add keyboard shortcuts 
// public class Main{
//  public static void main(String[] args) {
//    new MyFrame();
//  }
// }

// class MyFrame extends JFrame implements ActionListener{
//   JMenuItem load;
//   JMenuItem save;
//   JMenuItem exit;
//   ImageIcon loadIcon;
//   ImageIcon saveIcon;
//   ImageIcon exitIcon;
//   MyFrame(){
//     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     this.setSize(500,500);
//     this.setLayout(new FlowLayout());

//     JMenuBar menuBar = new JMenuBar();
//     JMenu filemenu = new JMenu("File");
//     JMenu editMenu = new JMenu("Edit");
//     JMenu helpMenu = new JMenu("Help");

//      load = new JMenuItem("Load");
//      save = new JMenuItem("Save");
//      exit = new JMenuItem("Exit");

//      loadIcon = new ImageIcon(new ImageIcon("load.jpg").getImage().getScaledInstance(29, 29, Image.SCALE_DEFAULT));
//      saveIcon = new ImageIcon(new ImageIcon("save.jpg").getImage().getScaledInstance(29, 29, Image.SCALE_DEFAULT));
//      exitIcon = new ImageIcon(new ImageIcon("no.png").getImage().getScaledInstance(29, 29, Image.SCALE_DEFAULT));

//      load.setIcon(loadIcon);
//      save.setIcon(saveIcon);
//      exit.setIcon(exitIcon);
//      filemenu.setMnemonic(KeyEvent.VK_F); //alt +F
//      editMenu.setMnemonic(KeyEvent.VK_E);
//      helpMenu.setMnemonic(KeyEvent.VK_H);
//      load.setMnemonic(KeyEvent.VK_L); // only l
//      save.setMnemonic(KeyEvent.VK_S);
//      exit.setMnemonic(KeyEvent.VK_E);

//     filemenu.add(load);
//     filemenu.add(save);
//     filemenu.add(exit);


//     menuBar.add(filemenu);
//     menuBar.add(editMenu);
//     menuBar.add(helpMenu);

//     load.addActionListener(this);
//     save.addActionListener(this);
//     exit.addActionListener(this);

//     this.setJMenuBar(menuBar);
//     this.setVisible(true);
//   }

//   @Override
//   public void actionPerformed(ActionEvent e) {
//    if(e.getSource()== load){
//     System.out.println("You loaded a file!");
//    }
//    else if(e.getSource()== save){
//     System.out.println("You saved a file!");
//    }
//    else if(e.getSource()== exit){
//     System.exit(0);
//    }
//   }
  
// }

//66.JFileChooserv-lets user choose a file 
// public class Main{
//   public static void main(String[] args) {
//     new MyFrame();
//   }
// }

// class MyFrame extends  JFrame implements ActionListener{
//   JButton button ;
//   MyFrame(){
//   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//   this.setLayout(new FlowLayout());

//   button = new JButton("Select File");
//   button.addActionListener(this);
//   this.add(button);
//   this.pack();
//   this.setVisible(true);
//   }


//   @Override
//   public void actionPerformed(ActionEvent e) {
//    if(e.getSource() == button){
//       JFileChooser fileChooser = new JFileChooser();
//       fileChooser.setCurrentDirectory(new File("."));
//       //int response = fileChooser.showOpenDialog(null); // this will select file to open
//       int response =  fileChooser.showSaveDialog(null); // select file to save 
//       if(response == JFileChooser.APPROVE_OPTION){
//         File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
//         System.out.println(file);
//       }
//    }
//   }

// }

//67.Color Chooser
//JColorChooser - lets user choose a color 
// public class Main{
//   public static void main(String[] args) {
//     new MyFrame();
//   }
// }

// class MyFrame extends  JFrame implements ActionListener{
//   JButton button ;
//   JLabel label;
//   MyFrame(){
//   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//   this.setLayout(new FlowLayout());
//     button = new JButton("Pick a color");
//     button.addActionListener(this);
//     label = new JLabel();
//     label.setBackground(Color.white);
//     label.setText("this is some text ");
//     label.setFont(new Font("Times New Roman",Font.PLAIN,50));
//     label.setOpaque(true);
//  this.add(button);
//  this.add(label);
//   this.pack();
//   this.setVisible(true);
//   }


//   @Override
//   public void actionPerformed(ActionEvent e) {
//     if(e.getSource() == button){
//       JColorChooser colorChooser = new JColorChooser();
//       Color color = JColorChooser.showDialog(null, "Pick a color", Color.black);
//       //label.setForeground(color);
//       label.setBackground(color);
//     }
   
//    }
//   }

//68.KeyListener 
// public class Main{
//   public static void main(String[] args) {
//     new MyFrame();
//   }
// }

// class MyFrame extends  JFrame implements KeyListener{
  
//   JLabel label;
//   ImageIcon pizza;
//   MyFrame(){
//   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//   this.setLayout(null);
//    this.addKeyListener(this); 
// label = new JLabel();
// label.setBounds(0,0,100,100);
// pizza = new ImageIcon(new ImageIcon("pizza.jpg").getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT));
// label.setIcon(pizza);
// // label.setBackground(Color.red);
// // label.setOpaque(true);
// this.getContentPane().setBackground(Color.black);
// this.add(label);

//   this.setSize(500,500);
//   this.setVisible(true);
//   }
//   @Override
//   public void keyTyped(KeyEvent e) {
//     //System.out.println();
//     //invoked when a key is typed . uses KeyChar , char output
//     switch(e.getKeyChar()){
//       case 'w':label.setLocation(label.getX()-10,label.getY());
//       break;
//        case 'a':label.setLocation(label.getX(),label.getY()-10);
//       break;
//        case 'd':label.setLocation(label.getX(),label.getY()+10);
//       break;
//        case 's':label.setLocation(label.getX()+10,label.getY());
//       break;
//     } 
//   }
//   @Override
//   public void keyPressed(KeyEvent e) {
//    // System.out.println();
//   //invoked when a physical key is pressed down . Uses KeyCode , int output 
//   switch(e.getKeyCode()){
//       case 37:label.setLocation(label.getX()-10,label.getY());
//       break;
//        case 38:label.setLocation(label.getX(),label.getY()-10);
//       break;
//        case 40:label.setLocation(label.getX(),label.getY()+10);
//       break;
//        case 39:label.setLocation(label.getX()+10,label.getY());
//       break;
//     }   
//    }
//   @Override
//   public void keyReleased(KeyEvent e) {
//     System.out.println(e.getKeyChar());
//     System.out.println(e.getKeyCode());
//   //called whenever a button is released 
//   }


  
//   }

//69. MouseListener
// public class Main{
//   public static void main(String[] args) {
//     new MyFrame();
//   }
// }

// class MyFrame extends  JFrame implements MouseListener{
//   ImageIcon pizza;
//   ImageIcon ham;
//  ImageIcon hotdog;
//  ImageIcon no;
//   JLabel label;
//   MyFrame(){
//   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//   this.setLayout(new FlowLayout());
//   label = new JLabel();
//   //label.setBounds(0,0,100,100);
//   //  label.setBackground(Color.RED);
//   //  label.setOpaque(true);
//    label.addMouseListener(this);
  
//    pizza = new ImageIcon(new ImageIcon("pizza.jpg").getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT));
//     ham = new ImageIcon(new ImageIcon("ham.jpg").getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT));
//     hotdog = new ImageIcon(new ImageIcon("hotdog.jpg").getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT));
//     no = new ImageIcon(new ImageIcon("no.png").getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT));
//     label.setIcon(pizza);
//      this.add(label);
//      this.pack();
//  // this.setSize(500,500);
//  this.setLocationRelativeTo(null);
//   this.setVisible(true);
//   }
//   @Override
//   public void mouseClicked(MouseEvent e) {
//    // label.setBackground(Color.blue);
//     //System.out.println("Mouse Clicked");
//   }
//   @Override
//   public void mousePressed(MouseEvent e) {
//     //label.setBackground(Color.yellow);
//     label.setIcon(no);
//     //System.out.println("Mouse Pressed");
    
//   }
//   @Override
//   public void mouseReleased(MouseEvent e) {
//     label.setIcon(ham);
//     //label.setBackground(Color.green);
//    // System.out.println("Mouse Released");
//   }
//   @Override
//   public void mouseEntered(MouseEvent e) {
//     //label.setBackground(Color.blue);
//     label.setIcon(hotdog);
//     //System.out.println("Mouse Entered");
//   }
//   @Override
//   public void mouseExited(MouseEvent e) {
//     label.setIcon(pizza);
//     //label.setBackground(Color.red);
//     //System.out.println("Mouse Exited");
   
//   }
//   }

// 70.Drag an drop
// public class Main{
//   public static void main(String[] args) {
//    MyFrame myFrame = new MyFrame();
//   }
// }


// class MyFrame extends JFrame{
 
//   DragPanel dragPanel = new DragPanel();
//   MyFrame(){
//     this.add(dragPanel);
//     this.setTitle("Drag and Drop demo");
//     this.setSize(600,600);
//     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     this.setVisible(true);
//   }

// }

// class DragPanel extends JPanel{
//   ImageIcon image = new ImageIcon(new ImageIcon("pizza.jpg").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
//   int width = image.getIconWidth();
//   int height = image.getIconHeight();
//   Point imageCorner ; 
//   Point prevPt;

//   DragPanel(){
//       imageCorner = new Point(0,0);
//       ClickListener clickListener = new ClickListener();
//       DragListener dragListener = new DragListener();
//       this.addMouseListener(clickListener);
//       this.addMouseMotionListener(dragListener);
//   }

//   public void paintComponent(Graphics g){
//     super.paintComponent(g);
//     image.paintIcon(this, g,(int)imageCorner.getX(),(int)imageCorner.getY());

//   }

//   private class ClickListener extends MouseAdapter{
//     public void mousePressed(MouseEvent e){
//       prevPt = e.getPoint();
//     }
//   }

//   private class DragListener extends MouseMotionAdapter{
//     public void mouseDragged(MouseEvent e){
//       Point currePoint = e.getPoint();
//       imageCorner.translate((int)(currePoint.getX()-prevPt.getX()),
//        (int)(currePoint.getY()-prevPt.getY()));

//        prevPt= currePoint;
//        repaint();
//     }
//   }

// }


//71.Key Bindings - bind an action  to a key stroke 
//don't require you to click a component to give it focus 
//all swing components use key bindings 
//increased flexibility  compared to keyListeners 
//can assign key stokes to individual swing components 
//more difficult to utilize and set up 

// public class Main{
//   public static void main(String[] args) {
//     Game game = new Game();
//   }
// }
// class Game{
//   JFrame frame;
//   JLabel label;
//   Action upAction;
//   Action downAction;
//   Action leftAction;
//   Action rightAction;
//   Game(){
//     frame = new JFrame("Key binding demo");
//      frame.setSize(600,600);
//     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     frame.setLayout(null);

//     label = new JLabel();
//     label.setBackground(Color.red);
//     label.setBounds(100,100,100,100);
//     label.setOpaque(true);

//     upAction = new UpAction();
//     downAction = new DownAction();
//     leftAction = new LeftAction();
//     rightAction = new RightAction();

//     label.getInputMap().put(KeyStroke.getKeyStroke("UP"), "upAction");

//     label.getActionMap().put("upAction", upAction);
//     label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "downAction");
//     label.getActionMap().put("downAction", downAction);
//     label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "leftAction");
//     label.getActionMap().put("leftAction", leftAction);
//     label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "rightAction");
//     label.getActionMap().put("rightAction", rightAction);
//     frame.add(label);
//     frame.setVisible(true);
//   }

//   public class UpAction extends AbstractAction{

//     @Override
//     public void actionPerformed(ActionEvent e) {
//       label.setLocation(label.getX(),label.getY()-10);
//     }
    
//   }

//   public class DownAction extends AbstractAction{

//     @Override
//     public void actionPerformed(ActionEvent e) {
//      label.setLocation(label.getX(),label.getY()+10);
//     }
    
//   }

//   public class LeftAction extends AbstractAction{

//     @Override
//     public void actionPerformed(ActionEvent e) {
//      label.setLocation(label.getX()-10,label.getY());
//     }
    
//   }

//   public class RightAction extends AbstractAction{

//     @Override
//     public void actionPerformed(ActionEvent e) {
//       label.setLocation(label.getX()+10,label.getY());
//     }
    
//   }
// }

//72.2D Graphics
// public class Main{
//   public static void main(String[] args) {
//     new MyFrame();
//   }
// }

// class MyFrame extends JFrame {
//   MyPanel panel;
//   MyFrame(){
//     panel = new MyPanel();
//     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
//     this.add(panel);
//     this.pack();
//     this.setLocationRelativeTo(null);
//     this.setVisible(true);

//   }

 
// }

// class MyPanel extends JPanel{
//   Image image;
//   MyPanel(){
//     this.setPreferredSize(new Dimension(500,500));
//     image = new ImageIcon("pizza.jpg").getImage();
//   }
//    public void paint(Graphics g ){
//     Graphics2D g2D = (Graphics2D) g;
//     //g2D.setStroke(new BasicStroke(5));
//     g2D.setPaint(Color.red);
//     //g2D.drawLine(0, 0, 500, 500);
//     //g2D.drawRect(100,100,78,96);
//     //g2D.fillRect(100,100,77,95);
//     //g2D.drawOval(0,0,100,100);

//     // g2D.fillArc(0,0,100,100,0,180);
//     // g2D.setPaint(Color.white);
//     // g2D.fillArc(0,0,100,100,180,180);
//     // int[] x = {150,250,350};
//     // int[] y = {300,150,300};
//     //g2D.drawPolygon(x , y , 3);
//     //g2D.fillPolygon(x,y,3);
//     // g2D.setFont(new Font("Times New Roman",Font.PLAIN,40));
//     // g2D.drawString("You are a winner !", 50, 50);

//     g2D.drawImage(image,0,0,null);
//   }
// }

//2D animation
// public class Main{
// public static void main(String[] args) {
//   new MyFrame();
// }
// }

//  class MyFrame extends JFrame {
//   MyPanel panel;
//   MyFrame(){
//     panel = new MyPanel();
//     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
//     this.add(panel);
//     this.pack();
//     this.setLocationRelativeTo(null);
//     this.setVisible(true);

//   }

 
// }

// class MyPanel extends JPanel implements ActionListener{
//   final int PANEL_WIDTH = 500;
//   final int PANEL_HEIGHT = 500;
//   Image enemy;
//   Image enemy2;
//   Image earth;
//   Timer timer;
//   int xvelocity = 2;
//   int yvelocity = 1;
//   int x = 0;
//   int y = 0;
//   MyPanel(){
//     this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
//     this.setBackground(Color.black);
//     enemy = new ImageIcon("enemy.png").getImage();
//     enemy2 = enemy.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
//     earth = new ImageIcon("earth.jpg").getImage().getScaledInstance(500, 500, Image.SCALE_SMOOTH);
//     timer = new Timer(10, this);
//     timer.start();
    
//   }

//   public void paint(Graphics g){
//     super.paint(g); // paint background
//     Graphics2D g2D = (Graphics2D) g;
//     g2D.drawImage(earth, 0 ,0,null);
//     g2D.drawImage(enemy2, x ,y,null);

//   }
//   @Override
//   public void actionPerformed(ActionEvent e) {
//   if(x >= PANEL_WIDTH-enemy2.getWidth(null) || x<0 ){
//     xvelocity = xvelocity * -1;
//   }
//    x += xvelocity;
//   if(y >= PANEL_HEIGHT-enemy2.getHeight(null) || y<0 ){
//     yvelocity = yvelocity * -1;
//   }
//    y += yvelocity;
//    repaint();
//   }
   
//   }


//74. Generics
 //enables types{classes and interfaces} to be parameter when defining classes interfaces and methods 
 // a benefit is to eliminate the need to create multiple versions of methods or classes for various data types.
 //use one version for all reference data types.
 //generic method
// public class Main{
//   public static void main(String[] args) {
//     Integer[] intArray = {1,2,3,4,5};
//     Double[] doubleArray = {1.1,2.2,3.3,4.4,5.5};
//     Character[] charArray = {'h','e','l','l','o'};
//     String[] stringarray = {"bye","hi","hello","yellow","mellow"};

//     // display(intArray);
//     // display(doubleArray);
//     // display(charArray);
//     // display(stringarray);
//     System.out.println(getFirst(intArray));
//     System.out.println(getFirst(doubleArray));
//     System.out.println(getFirst(charArray));
//     System.out.println(getFirst(stringarray));
//   }

//   public static <Thing> void display(Thing[] array){
//     for(Thing x: array){
//       System.out.print(x+" ");
//     }
//     System.out.println();
//   }

//   public static <Thing> Thing getFirst(Thing[] array){
   
//     return array[0];
//   }
// }

//generic classes 
//Bounded types - you can create the objects of a generic class to have data of specific derived types eg:Numbers 
// public class Main{
// public static void main(String[] args) {
//  MyGeneric <Integer,Character> myint = new MyGeneric<>(1,'e');
//  MyGeneric <Double,Double> cMychar= new MyGeneric<>(8.0,4.6);
//   MyGeneric <Double,String> mydub = new MyGeneric<>(1.2,"Yellow");
//   MyGeneric <Integer,Integer> mystr = new MyGeneric<>(8,8);

//  // ArrayList <String> myFriends = new ArrayList<>();
//  //HashMap <Integer,String> users = new HashMap<>();

//   System.out.println(myint.getValue());
//   System.out.println(mydub.getValue());
//   System.out.println(cMychar.getValue());
//   System.out.println(mystr.getValue());
// }
// }

// class MyGeneric <T extends Number,V>{
// T x;
// V y;
// MyGeneric(T x,V y){
//   this.x=x;
//   this.y=y;
//   }

//   public V getValue(){
//     return y;
//   }
// }


//75.Serialization - the process of converting an object into a byte stream.
//Persists the object after program exits .This byte stream can be svaed as a file or sentg over a network 
//Can be sent to different machine 

//Deserialzation - the reverse process .byte stream to onject
//Steps
//1.implement Serializable
//2.import java.io.Serializable;
//3.
//serialVersionUID = it is a unique ID that functions like a version that 
// public class Main{
// public static void main(String[] args) throws IOException {
//   User user = new User();
//   user.name="Varsha ";
//   user.password="12345";

//   FileOutputStream fileOutputStream =new FileOutputStream("UserInfo.ser");
//   ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);
//   out.writeObject(user);
//   out.close();
//   fileOutputStream.close();
//   System.out.println("Object info saved");

//   long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
//   System.out.println(serialVersionUID);
// }
// }


// class User implements Serializable{
//   String name;
//   transient String password;

//   public void sayHello(){
//     System.out.println("Hello"+name);
//   }
// }

// //Deserializer to be written under different project 

// public class Main{
//   public static void main(String[] args) throws IOException, ClassNotFoundException {
//     User user = null;
//         FileInputStream fileInputStream = new FileInputStream("D:\\Java_learn\\UserInfo.ser");
//         ObjectInputStream in = new ObjectInputStream(fileInputStream);
//         user = (User) in.readObject();
//         in.close();
//         fileInputStream.close();

//         System.out.println(user.name);
//         System.out.println(user.password);
//         long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
//   System.out.println(serialVersionUID);
//   }
// }


//imp notes -
//1.children classes of parent classes that implement Serializable will do so as well
//2.static fields are not serialized 
//3.the classes's definition is not itself recorded ,cast it as the object type
//4.Fields declared as transient are'nt serialized , they are ignored 
//5.serialisationUId is a unique version ID

//76. Timer Task
//Timer - Facility for threads to schedule tasks for future execution in a background thread

//TimerTask - a task that can be scheduled for one time or repeated execution by a timer 
// import java.util.Timer;
// import java.util.TimerTask;
// public class Main{
//   public static void main(String[] args) {
//     Timer timer = new Timer();
//     TimerTask timerTask = new TimerTask() {
//       int counter =10;
//       @Override
//       public void run() {
//         if(counter>0){
//           System.out.println(counter+ "seconds");
//           counter--;
//         }
//         else{
//           System.out.println("Another minute!");
//           timer.cancel();
//         }
//         // System.out.println("Task is complete");
//       }
      
//     };
//     Calendar date = Calendar.getInstance();
//     date.set(Calendar.YEAR,2023);
//     date.set(Calendar.MONTH,Calendar.NOVEMBER);
//     date.set(Calendar.DAY_OF_MONTH,8);
//     date.set(Calendar.HOUR_OF_DAY,17);
//     date.set(Calendar.MINUTE,40);
//     date.set(Calendar.SECOND,49);
//     date.set(Calendar.MILLISECOND,0);
//     //timer.schedule(timerTask, 5000);

//     //timer.schedule(timerTask, date.getTime());
//     timer.scheduleAtFixedRate(timerTask, date.getTime(),1000);

//   }
// }

//Threads
//User threads
//Demon threads - Used for garbabge collection 
// public class Main{
//   public static void main(String[] args) throws InterruptedException {
//     //System.out.println(Thread.activeCount());
//     // Thread.currentThread().setName("crank");
//     // System.out.println(Thread.currentThread().getName());
//     Thread.currentThread().setPriority(10);
//     // System.out.println(Thread.currentThread().getPriority());
//     //System.out.println(Thread.currentThread().isAlive());
//     //counter
//     // for(int i = 3;i>0;i--){
//     //   System.out.println(i);
//     //   Thread.sleep(1000);
//     // }
//     // System.out.println("You are done!");

//     MyThread thread = new MyThread();
//     thread.setDaemon(false);
//     System.out.println(thread.isDaemon());
//     thread.start();
//     // thread.setName("other");
//     // thread.setPriority(1);
//     //   System.out.println(thread.isAlive());
//     //   System.out.println(thread.getName());
//     //   System.out.println(thread.getPriority());
//       System.out.println(thread.activeCount());
//   }
// }

// class MyThread extends Thread{
//   @Override
//   public void run(){
//     if(this.isDaemon()){
//     System.out.println("This is a demon thread running ");
//     }
//     else {
//       System.out.println("This is a user thread running");
//     }
//   }
// }

//78.Multithreading
// public class Main{
//   public static void main(String[] args) throws InterruptedException {
//     MyThread thread1 = new MyThread(); //Way 1 to create a thread
//     MyRunnable runnable1 = new MyRunnable(); //way 2 , used more often 
//     Thread  thread2 = new Thread(runnable1);
//     thread1.setDaemon(true);
//     thread2.setDaemon(true);
//     thread1.start();
//     thread1.join(3000); //Main thread waits till thread one is finished //Can add a delay
//     thread2.start();
//     System.out.println(1/0);
//   }
// }

// class MyThread extends Thread{
//   public void run(){
//     for(int i = 10; i > 0 ; i--){
//       System.out.println("thread 1 : "+i);
//       try {
//         Thread.sleep(1000);
//       } catch (InterruptedException e) {
//         e.printStackTrace();
//       }
      
//     }
//     System.out.println("Thread 1 is finished ");
//   }
// }

// class MyRunnable implements Runnable{

//   @Override
//   public void run() {
//     for(int i = 0; i<10 ; i++){
//       System.out.println("thread 2 : "+i);
//       try {
//         Thread.sleep(1000);
//       } catch (InterruptedException e) {
//         e.printStackTrace();
//       }
//     }
//     System.out.println("Thread 2 is finished ");
//   }
  
// }



//79.Packages in java 
// public class Main{
//   public static void main(String[] args) {
//     Toolbox toolbox = new Toolbox();
    
//   }
// }


//80.Compile and run java file with command prompt
// public class Main{
//  public static void main(String[] args) {
//   System.out.println("Hello");
//  }
// }

//81.Java program to an executable (.jar)

//Method Chaining - Condensing code to less lines 
// public class Main{
//   public static void main(String[] args) {
//     String name = "   Varsha";
//     // name = name.concat(" Narayan ");
//     // name = name.toUpperCase();
//     // name = name.trim();
//     name = name.concat(" Narayan ").toUpperCase().trim(); //Method chain
//     System.out.println(name);
//   }
// }


//enums - enumerated - odered listing of items in a collection
//grouping of constants that behave similarly to objects 
// enum Planet{
//   MERCURY(1) , 
//   VENUS(2) , 
//   EARTH(3) , 
//   MARS (4), 
//   JUPITER(5) , 
//   SATURN (6), 
//   URANUS (7), 
//   NEPTUNE(8) , 
//   PLUTO(9);

//   int number ;

//   Planet(int number){
//     this.number = number;
//   }
// }
// public class Main{
//   public static void main(String[] args) {
    
//     Planet myPlanet = Planet.EARTH;
//     canILiveHere(myPlanet);
//   }

//   static void canILiveHere(Planet myPlanet){

//     switch(myPlanet){
//       case EARTH:
//       System.out.println("Yes");
//       System.out.println("This is planet #" +myPlanet.number);
//       break;
//       default :
//       System.out.println("No");
//       System.out.println("This is planet #" +myPlanet.number);
//       break;
//     }
//   }
// }

//enum example 
// import java.util.Scanner;
// enum Animals{
//   CAT(18 ,"Meow") ,
//   DOG(15 , "Bow Bow"),
//   COW(20 , "Moooooo") , 
//   GOAT(18,"Mahhahh") ,
//   LION(12,"Roar!") ,
//   CHEETAH(8, "chirp chirp") ,
//   HIPPO(50 , "Grunt grunt") ; 
//    int lifespan ;
//    String sound ;
//    Animals(int lifespan , String sound ){
//       this.lifespan = lifespan ;
//       this.sound = sound ; 
//    }
  
// } 

// public class Main{
//   public static void main(String[] args) {
//     Scanner scanner = new Scanner(System.in);
//     //System.out.println("Enter the name of an animal");
//     String animal_name = JOptionPane.showInputDialog("Enter the name of an animal");//scanner.nextLine();
//     try {
//       Animals animal = Animals.valueOf(animal_name.toUpperCase());
//       JOptionPane.showMessageDialog(null, animal_name+" can live around " + animal.lifespan+ "years\n It makes the sound: " + animal.sound,animal_name, JOptionPane.INFORMATION_MESSAGE);
//       //JOptionPane.showMessageDialog(null,animal_name+" makes the sound: " + animal.sound,animal_name, JOptionPane.INFORMATION_MESSAGE);
//       //System.out.println(animal_name+" can live around " + animal.lifespan+ "years");
//       //System.out.println(animal_name+" makes the sound: " + animal.sound);
//   } catch (IllegalArgumentException e) {
//       JOptionPane.showMessageDialog(null,"Cannot find info on this animal",animal_name, JOptionPane.INFORMATION_MESSAGE);
//   }
//   scanner.close();

//   }
  
// }

//Hashmaps - map interface 
//stores key value pair 
//stores objects , need to use wrapper class

// import java.util.HashMap;
// public class Main{
//   public static void main(String[] args) {
//     HashMap<String , String> countries = new HashMap<String , String >();
//     countries.put("USA","Washington DC");
//     countries.put("India","New Delhi");
//     countries.put("Russia","Moscow");
//     countries.put("China","Beijing");

//     //countries.remove("USA");
//     //countries.replace("USA","Detroit");
//     //System.out.println(countries.containsKey("England"));
//     //System.out.println(countries.containsValue("Beijing"));
//     //System.out.println(countries.get("Russia"));

//     //countries.clear();
//     //System.out.println(countries.size());
//     //System.out.println(countries);

//     for(String i : countries.keySet()){
//       System.out.print(i+"\t");
//       System.out.println(countries.get(i));
//     }

//   }
// }


//Dark/Light mode using JToggleButton
// import javax.swing.JFrame;
// import javax.swing.JToggleButton;
// import java.awt.Dimension;

// public class Main  {
  
//     public static void main(String[] args) {
//         new MyFrame();
//     }

   
// }

// class MyFrame extends JFrame implements ActionListener{

// JToggleButton toggleButton;
// MyFrame(){
        
//         this.setSize(400, 400);
//         this.getContentPane().setBackground(Color.WHITE);

//         // JPanel panel = new JPanel();
//         // panel.setSize(50,50);

//         toggleButton = new JToggleButton("Mode");
//         // Set the preferred size
//         Dimension buttonSize = new Dimension(100, 50);
//         toggleButton.setPreferredSize(buttonSize);
//         toggleButton.addActionListener(this);
//         // frame.setLayout(new BorderLayout());
//         // frame.add(toggleButton, BorderLayout.SOUTH);
//         //panel.add(toggleButton);
//         //this.add(panel);
//         this.add(toggleButton, BorderLayout.NORTH);
//         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         this.setVisible(true);
//   }
//    @Override
//     public void actionPerformed(ActionEvent e) {
//       AbstractButton button = (AbstractButton)e.getSource();
//       boolean selected = button.getModel().isSelected();
//       if(selected){
//         this.getContentPane().setBackground(Color.BLACK);
//       }
//       if(!selected){
//           this.getContentPane().setBackground(Color.WHITE);
//         }
//     }
// }

//Dark/Light mode using JSlider
// import javax.swing.*;
// import javax.swing.plaf.basic.BasicSliderUI;
// import java.awt.*;
// import java.awt.geom.Ellipse2D;
// import java.awt.geom.RoundRectangle2D;
// public class Main implements ChangeListener{
//   JFrame frame;
//   JSlider slider;
//   Main(){
//     frame = new JFrame();
//     frame.setSize(400,400);
//     frame.getContentPane().setBackground(Color.WHITE);
//      frame.setVisible(true);
//     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    

    

//     slider = new JSlider(0,1,0);
//     slider.setOpaque(true);
//     slider.setSize(50, 30);
//     slider.setUI(new CircularThumbSliderUI(slider));
    
//     //slider.setBackground(Color.WHITE);
//     slider.addChangeListener(this);
//     // slider.setPaintTicks(true);
//     // slider.setPaintLabels(true);
    
//     frame.add(slider);
    
    
//   }
//   public static void main(String[] args) {
//     new Main();
//   }
//   @Override
//   public void stateChanged(ChangeEvent e) {
//     System.out.println(slider.getValue());
//     if(slider.getValue()==1){
//     frame.getContentPane().setBackground(Color.BLACK);
//     //slider.setBackground(Color.BLACK);
//   }
//     else{
//       frame.getContentPane().setBackground(Color.WHITE);
//       //slider.setBackground(Color.WHITE);
//     }
//   }
// }

// class CircularThumbSliderUI extends BasicSliderUI {

//     public CircularThumbSliderUI(JSlider b ) {
//         super(b);
//     }

    

//     @Override
//     public void paintThumb(Graphics g) {
//         // Graphics2D g2d = (Graphics2D) g;
//          int diameter = thumbRect.width;

//         // Ellipse2D thumb = new Ellipse2D.Double(thumbRect.x, thumbRect.y, diameter, diameter);

//         //   //g2d.setColor(slider.getBackground());
//         //  g2d.fill(thumb);

//         // g2d.setColor(Color.BLACK);
//         // g2d.draw(thumb);
//         g.setColor(Color.GRAY);
//         g.fillOval(thumbRect.x, thumbRect.y,diameter, diameter );
        
//     }

//     @Override
//     protected Dimension getThumbSize() {
//         return new Dimension(15, 15); // Set the size of the circular thumb
//     }
// @Override
//         public void paint(final Graphics g, final JComponent c) {
//             ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//             super.paint(g, c);
//         }
// }

// class Scratch {
//     public static void main(final String[] args) {
//         SwingUtilities.invokeLater(() -> {
//             JPanel content = new JPanel(new BorderLayout());
//             content.setPreferredSize(new Dimension(300, 100));
//             JSlider slider = new JSlider(0,1,0) 
//         {
//                 @Override
//                 public void updateUI() {
//                     setUI(new CustomSliderUI(this));
//                 }
//             };
            
//             content.add(slider);

//             JFrame frame = new JFrame();
//             frame.setContentPane(content);
//             frame.pack();
//             frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//             frame.setLocationRelativeTo(null);
//             frame.setVisible(true);
//         });
//     }

//     private static class CustomSliderUI extends BasicSliderUI {

//         private static final int TRACK_HEIGHT = 20;
//         private static final int TRACK_WIDTH = 0;
//         private static final int TRACK_ARC = 20;
//         private static final Dimension THUMB_SIZE = new Dimension(15, 15);
//         private final RoundRectangle2D.Float trackShape = new RoundRectangle2D.Float();

//         public CustomSliderUI(final JSlider b) {
//             super(b);
//         }

//         @Override
//         protected void calculateTrackRect() {
//             super.calculateTrackRect();
//             if (isHorizontal()) {
//                 trackRect.y = trackRect.y + (trackRect.height - TRACK_HEIGHT) / 2;
//                 trackRect.height = TRACK_HEIGHT;
//             } else {
//                 trackRect.x = trackRect.x + (trackRect.width - TRACK_WIDTH) / 2;
//                 trackRect.width = TRACK_WIDTH;
//             }
//             trackShape.setRoundRect(trackRect.x, trackRect.y, trackRect.width, trackRect.height, TRACK_ARC, TRACK_ARC);
//         }

//         @Override
//         protected void calculateThumbLocation() {
//             super.calculateThumbLocation();
//             if (isHorizontal()) {
//                 thumbRect.y = trackRect.y + (trackRect.height - thumbRect.height) / 2;
//             } else {
//                 thumbRect.x = trackRect.x + (trackRect.width - thumbRect.width) / 2;
//             }
//         }

//         @Override
//         protected Dimension getThumbSize() {
//             return THUMB_SIZE;
//         }

//         private boolean isHorizontal() {
//             return slider.getOrientation() == JSlider.HORIZONTAL;
//         }

//         @Override
//         public void paint(final Graphics g, final JComponent c) {
//             ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//             super.paint(g, c);
//         }

//         @Override
//         public void paintTrack(final Graphics g) {
//             Graphics2D g2 = (Graphics2D) g;
//             Shape clip = g2.getClip();

//             boolean horizontal = isHorizontal();
//             boolean inverted = slider.getInverted();

//             // Paint shadow.
//             g2.setColor(new Color(170, 170 ,170));
//             g2.fill(trackShape);

//             // Paint track background.
//             g2.setColor(new Color(200, 200 ,200));
//             g2.setClip(trackShape);
//             trackShape.y += 1;
//             g2.fill(trackShape);
//             trackShape.y = trackRect.y;

//             g2.setClip(clip);

//             // Paint selected track.
//             if (horizontal) {
//                 boolean ltr = slider.getComponentOrientation().isLeftToRight();
//                 if (ltr) inverted = !inverted;
//                 int thumbPos = thumbRect.x + thumbRect.width / 2;
//                 if (inverted) {
//                     g2.clipRect(0, 0, thumbPos, slider.getHeight());
//                 } else {
//                     g2.clipRect(thumbPos, 0, slider.getWidth() - thumbPos, slider.getHeight());
//                 }

//             } else {
//                 int thumbPos = thumbRect.y + thumbRect.height / 2;
//                 if (inverted) {
//                     g2.clipRect(0, 0, slider.getHeight(), thumbPos);
//                 } else {
//                     g2.clipRect(0, thumbPos, slider.getWidth(), slider.getHeight() - thumbPos);
//                 }
//             }
//            // g2.setColor(Color.BLACK);
//            // g2.fill(trackShape);
//             g2.setClip(clip);
//         }

//         @Override
//         public void paintThumb(final Graphics g) {
//             g.setColor(Color.BLACK);
//             g.fillOval(thumbRect.x, thumbRect.y, thumbRect.width, thumbRect.height);
//         }

//         @Override
//         public void paintFocus(final Graphics g) {}
//     }
// }


public class Main {


  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setSize(400,400);
    frame.setLayout(new FlowLayout());

    JPanel panel = new JPanel();
    panel.setPreferredSize(new Dimension(50,50));
    SwitchButton button = new SwitchButton();
   button.addEventSelected(new EventSwitchSelected() {
      @Override
      public void onSelected(boolean selected) {
          if (selected) {
            frame.getContentPane().setBackground(Color.BLACK);
            panel.setBackground(Color.BLACK); 
          } else {
              frame.getContentPane().setBackground(null);
              panel.setBackground(null);
          }
      }
  });
   
  


    panel.add(button);
    frame.add(panel);
    frame.setVisible(true);
  }
}
























  



