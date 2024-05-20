package CarRegister;

public class Car {

  private String model;
  private String maker;
  private int year;
  private double price;

  public Car() {
  }

  public Car(String model, String maker, int year, double price) {
    this.model = model;
    this.maker = maker;
    this.year = year;
    this.price = price;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getMaker() {
    return maker;
  }

  public void setMaker(String maker) {
    this.maker = maker;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "Car{" +
      "model='" + model + '\'' +
      ", maker='" + maker + '\'' +
      ", year=" + year +
      ", price=" + price +
      '}';
  }
}
