public class Car{
  private String make="Honda";
  private String model="Swift";
  String color = "yellow";
  private int year = 2020; 
  int price=500000;
  Car(String make , String model , int year ){
    this.make = make ;
    this. model = model ;
     this.setYear(year);
  }
  public String getMake(){
    return make;
  }
  public int getYear(){
    return year;
  }
  public void setYear(int year){
    this.year= year;
  }
  public void fullThrottle() {
    System.out.println("This car is going as fast as it can!");
  }

  public void speed(int maxSpeed) {
    System.out.println("Max speed is: " + maxSpeed);
  }

  public String toString() {
    // String myString = make +"\n"+model+"\n"+color+"\n"+year;
    // return myString; or
    return make +"\n"+model+"\n"+color+"\n"+year;
  }
  public void copy(Car X){
    this.setYear(X.getYear());
  }
}
