class FoodOrder {
    String itemName;
    int quantity;

    FoodOrder() {
        itemName = "Burger";
        quantity = 1;
    }

    FoodOrder(String itemName) {
        this.itemName = itemName;
        this.quantity = 1;
    }

    FoodOrder(String itemName, int quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
    }

    // Method to Display Order Details
    void showOrder() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("---------------------");
    }

    public static void main(String[] args) {
        FoodOrder order1 = new FoodOrder();                   
        FoodOrder order2 = new FoodOrder("Pizza");            
        FoodOrder order3 = new FoodOrder("Pasta", 3);         

        // Displaying Orders
        order1.showOrder();
        order2.showOrder();
        order3.showOrder();
    }
}
