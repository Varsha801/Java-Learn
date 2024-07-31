//import java.util.Scanner; // Import the Scanner class

class Human {
  String name;
  int age;
  double weight;
   Human(String name , int age , double weight ){
      this.name = name;
      this.age =age;
      this.weight =weight ;
   }

   Human(String name , int age){  // overloading eg 
      this.name = name ;
      this.age = age ;
   }

   void eat(){
    System.out.println(this.name + " is eating");
   }

   void drink(){
    System.out.println(this.name + " is drinking");
   }
} 