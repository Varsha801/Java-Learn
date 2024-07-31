import java.util.Random;
public class DiceRoller {
   int number = 0; // declare globally so it can be used in other methods or have to pass it as arguements 
   Random random;
  DiceRoller(){
   random = new Random();
   
    roll();
  }

  void roll(){
    number = random.nextInt(6)+1;
    System.out.println(number);
  }
}
