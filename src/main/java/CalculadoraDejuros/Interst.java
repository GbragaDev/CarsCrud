package CalculadoraDejuros;

public class Interst {
  public static void main(String[] args) {

    double amount;
    double principal = 1000.0;// quantidade inicial antes dos juros
    double rate = 0.05;//taxa de juros

    //Exibe o menu inicial
    System.out.printf("%s%20s %n", "Year", "Amount on deposit");

    //calcula a quantidade de deposito para cada um dos dez anos
    for(int year =1;year<=10;year++){
      amount = principal * Math.pow(1.0+rate,year);

      //exibe o ano e a quantidade
      System.out.printf("%4d%,20.2f%n", year, amount);
    }

  }


}
