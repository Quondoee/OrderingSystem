package ordersystem;

public class New {
    public static void main(String[] args) {


        String product = "Rice";
        int qty = 20;
        double price = 5.0;
        double miles = 10.0;

        int fee;
        if (miles <= 5) {


            fee = 2;
        } else if (miles <= 15) {
            fee = 5;
        } else if (miles <= 25) {
            fee = 15;
        } else if (miles <= 50) {
            fee = 15;
        } else {
            fee = 20;
        }

        double totalPrice = qty * price;
        double totalcost = totalPrice + fee;

        System.out.println("product" + product);
        System.out.println("Quantity" + qty);
        System.out.println("Price per unit: $" + price);
        System.out.println("Miles traveled: " + miles);
        System.out.println("Delivery fee: $" + fee);
        System.out.println("Total cost: $" + totalcost);

    }
}
