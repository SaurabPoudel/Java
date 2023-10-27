public class Introduction {
  public static void main(String[] args) {
    Car lambhorghini = new Car();
    System.out.println("lambhorghini " + "id :" + lambhorghini.id+" price :" + lambhorghini.price);
    Car Maruti = new Car(2,2000f,"Petrol","Blue");
    System.out.println(Maruti.engine);
  }
}
class Car{
  int id;
  float price;
  String engine;
  String color;
  Car(){
    this.id = 1;
    this.price = 200000f;
    this.engine = "Diesel";
    this.color = "Black";
  }
  Car(int id,float price , String engine, String color){
    this.id = id;
    this.price = price;
    this.engine = engine;
    this.color = color;
  }
}
