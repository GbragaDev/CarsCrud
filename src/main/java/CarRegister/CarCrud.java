package CarRegister;



import java.util.ArrayList;
import java.util.Scanner;

public class CarCrud {
  private static final ArrayList<Car> cars = new ArrayList<>();
  private static final Scanner sc = new Scanner(System.in);

  public static void displayMenu() {
    System.out.println("Car Register Menu");
    System.out.println("1.Add a new car");
    System.out.println("2.Display all cars");
    System.out.println("3.Update a car info");
    System.out.println("4.Delete all car information");
  }
    public static void addaCar(){
      System.out.println("Enter Car Maker : ");
      String maker = sc.nextLine();
      System.out.println("Enter Car Model : ");
      String model = sc.nextLine();
      System.out.println("Enter Car year");
      int year = Integer.parseInt(sc.nextLine());
      System.out.println("Enter Car Price");
      double price = Double.parseDouble(sc.nextLine());
      cars.add(new Car(model,maker,year,price));
      System.out.println("Car has been added successfully!");
  }

  public static void displayCars(){
    if(cars.isEmpty()){
      System.out.println("No cars available");
    }else{
      for(int i = 0 ; i < cars.size();i++){
        System.out.printf("%d . %s/n ,",i+1,cars.get(i).toString());
      }
    }
  }

  public static void updateCars(){
    displayCars();
    if (!cars.isEmpty()){
      System.out.println("Enter the number of the car to update :");
      int carIndex = Integer.parseInt(sc.nextLine());
      if (carIndex >= 0 && carIndex < cars.size()) {
        Car car = cars.get(carIndex);
        System.out.println("Enter new Make(Current: " + car.getMaker());
        String make = sc.nextLine();
        System.out.println("Enter new Model(Current: " + car.getModel());
        String model = sc.nextLine();
        System.out.println("Enter new Year ( Current:" + car.getYear());
        int year = Integer.parseInt(sc.nextLine());
        System.out.println("Enter new Price ( Current:" + car.getPrice());
        double price = Double.parseDouble(sc.nextLine());

        if (!make.isEmpty()) car.setMaker(make);
        if (!model.isEmpty()) car.setModel(model);
        if (year > 0) car.setYear(year);
        if (price > 0) car.setPrice(price);

        System.out.println("Car updated!");
      }else{
        System.out.println("Invalid Selection");

      }
    }
  }
  public static void deleteCar(){
    displayCars();
    if(!cars.isEmpty()){
      System.out.println("Enter the number of the car to delete");
      int carindex = Integer.parseInt(sc.nextLine());
      if(carindex>=0 && carindex < cars.size()) {
        cars.remove(carindex);
        System.out.println("Car Deleteted");
      }else{
          System.out.println("Invalid Selection");
        }
      }

    }

  public static void main(String[] args) {
    while (true){
      displayMenu();
      System.out.println("Enter your Choice :");
      String choice = sc.nextLine();
      switch (choice){
        case "1":
          addaCar();
          break;
        case "2":
          displayCars();
          break;
        case "3":
          updateCars();
          break;
        case "4":
          deleteCar();
          break;
        case "5" :
          System.exit(0);
          break;
        default:
          System.out.println("Invalid Selection.Please try again.");
      }

    }
  }
}

