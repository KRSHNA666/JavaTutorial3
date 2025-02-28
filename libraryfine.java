class Library {
    int fineAmount;

    // Default Constructor
    Library() {
        fineAmount = 5; // Initializing the default fine amount
    }

    // Method to display fine amount
    void displayFine() {
        System.out.println("Default Fine Amount: $" + fineAmount);
    }

    public static void main(String[] args) {
        // Creating an object of Library class
        Library lib = new Library();
        
        // Displaying the fine amount
        lib.displayFine();
    }
}
