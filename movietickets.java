class MovieTicket {
    String customerName;
    int numTickets;

    // Parameterized Constructor
    MovieTicket(String customerName, int numTickets) {
        this.customerName = customerName;
        this.numTickets = numTickets;
    }

    // Method to display booking details
    void showBooking() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Number of Tickets: " + numTickets);
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        // Creating objects
        MovieTicket ticket1 = new MovieTicket("John Doe", 3);
        MovieTicket ticket2 = new MovieTicket("Alice Smith", 2);

        // Displaying Booking Details
        ticket1.showBooking();
        ticket2.showBooking();
    }
}
