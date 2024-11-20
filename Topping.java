public class Topping implements Calculator {
    private final String topping;
    double price;

    public  Topping(String topping){
        this.topping=topping;

    }

switch (topping):

    if(topping)
        price=2.8;
    }
    if (topping=="Marshmallow"){
        price=3;
    }
    if (topping=="Crushed Oreo"){
        price=2.75;
    }
    if (topping=="Fresh Strawberries){
        price=3.25;
    }

    @Override
    public double calculate() {
        double totalPrice=price*0.8;
        return totalPrice;

    }


}


