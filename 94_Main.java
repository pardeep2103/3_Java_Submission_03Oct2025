package demo;

public class main {
    public static void main(String[] args) {
        Carv1 tatasumo, thar, volvo;

        // Creating objects using new keyword
        tatasumo = new Carv1();
        thar = new Carv1();
        volvo = new Carv1();

        // Setting values for Thar
        thar.color = "Black";
        thar.fuel_type = "Petrol";
        thar.brand_name = "Thar";

        // Setting values for Tata Sumo
        tatasumo.color = "Blue";
        tatasumo.fuel_type = "Diesel";
        tatasumo.brand_name = "Tata Sumo";

        // Setting values for Volvo
        volvo.color = "White";
        volvo.fuel_type = "Petrol";
        volvo.brand_name = "Volvo";

        // Calling methods
        tatasumo.display();
        tatasumo.accelerate();

        thar.display();
        thar.reverse();

        volvo.display();
        volvo.start();
    }
}

