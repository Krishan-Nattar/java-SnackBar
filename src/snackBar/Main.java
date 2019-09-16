package snackBar;

public class Main {

    public static void workWithData() {
        System.out.println("Work With Data Running");
        Customer c1 = new Customer("Jane", 45.25);
        Customer c2 = new Customer("Bob", 33.14);

        VendingMachine v1 = new VendingMachine("Food");
        VendingMachine v2 = new VendingMachine("Drink");
        VendingMachine v3 = new VendingMachine("Office");

        Snack s1 = new Snack("Chips", 36, 1.75, v1.getId());
        Snack s2 = new Snack("Chocolate Bar", 36, 1.00, v1.getId());
        Snack s3 = new Snack("Pretzel", 30, 2.00, v1.getId());

        Snack s4 = new Snack("Soda", 24, 2.50, v2.getId());
        Snack s5 = new Snack("Water", 20, 2.75, v2.getId());

        // Problem 1
        c1.buyItem(3 * s4.getCost());
        s4.buySnack(3);

        System.out.println(c1.getCash());
        System.out.println(s4.getQuantity());

        // Problem 2
        c1.buyItem(1 * s3.getCost());
        s3.buySnack(1);

        System.out.println(c1.getCash());
        System.out.println(s3.getQuantity());

        // Problem 3
        c2.buyItem(2 * s4.getCost());
        s4.buySnack(2);

        // Problem 4
        System.out.println(c2.getCash());
        System.out.println(s4.getQuantity());

        c1.addCash(10);
        System.out.println(c1.getCash());

        // Problem 5
        c1.buyItem(1 * s2.getCost());
        s2.buySnack(1);

        System.out.println(c1.getCash());
        System.out.println(s2.getQuantity());

        //Problem 6
        s3.addQuantity(12);
        System.out.println(s3.getQuantity());


        //Problem 7
        c2.buyItem(3 * s3.getCost());
        s3.buySnack(3);

        System.out.println(c2.getCash());
        System.out.println(s3.getQuantity());

        //Stretch
        Object[] vendingObjects = {v1,v2,v3};
        Object[] snackObjects = {s1,s2,s3,s4,s5};

        for (int i = 0; i < snackObjects.length; i++) {
            ((Snack)snackObjects[i]).getDetails(vendingObjects);
        }

    }

    public static void main(String[] args) {
        workWithData();
    }
}