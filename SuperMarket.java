package polymorphism;



class Product {
    private String name;
    private double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}

// Derived class: FoodItem
class FoodItem extends Product {
    private String expirationDate;

    FoodItem(String name, double price, String expirationDate) {
        super(name, price);
        this.expirationDate = expirationDate;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Expiration Date: " + expirationDate);
    }
}

// Derived class: NonFoodItem
class NonFoodItem extends Product {
    private String manufacturer;

    NonFoodItem(String name, double price, String manufacturer) {
        super(name, price);
        this.manufacturer = manufacturer;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Manufacturer: " + manufacturer);
    }
}

// Derived class: ElectronicItem
class ElectronicItem extends NonFoodItem {
    private String warrantyPeriod;

    ElectronicItem(String name, double price, String manufacturer, String warrantyPeriod) {
        super(name, price, manufacturer);
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Warranty Period: " + warrantyPeriod);
    }
}

public class SuperMarket {

	public static void main(String[] args) {
		 // Create products
        Product apple = new FoodItem("Munch Chocolate", 10, "2024-12-31");
        Product samsungTV = new ElectronicItem("Samsung Z-Fold", 150000, "Samsung", "2 years");
        Product toothbrush = new NonFoodItem("Toothbrush", 2.49, "Colgate");

        // Display product details
        System.out.println("Product 1:");
        apple.displayDetails();
        System.out.println();

        System.out.println("Product 2:");
        samsungTV.displayDetails();
        System.out.println();

        System.out.println("Product 3:");
        toothbrush.displayDetails();
    }
}
	
	
		

	