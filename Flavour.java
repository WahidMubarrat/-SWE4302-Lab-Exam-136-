public class Flavour implements Calculator {
 double price;
    String flavour;
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
      double totalPrice=price*0.8;
        return totalPrice;

    }
}
