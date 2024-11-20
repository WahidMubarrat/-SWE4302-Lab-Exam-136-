public class Flavour implements Calculator {
 double price;
    String flavour;
    double basicprice;
    public  Flavour(String flavour){
        this.flavour=flavour;

    }



    if (flavour=="Mint Choclate Chip"){
        price=2.8;
    }
    if (flavour=="Mint Choclate Chip"){
        price=3;
    }
    if (flavour=="Mint Choclate Chip"){
        price=2.75;
    }
    if (flavour=="Mint Choclate Chip"){
        price=3.25;
    }
    @Override
    public double calculate() {
      basicPrice=price*0.8;
        return basicPrice;

    }
    @Override
    public double calculateTotal(int amount) {
        double totalPrice=basicprice*amount;
        return totalPrice;

    }
}
