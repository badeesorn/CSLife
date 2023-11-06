public class Car {
    String color;
    String brand;
    int seats;

    public Car(){
        color = "black";
        brand = "BMW";
        seats = 4;
    }

    public Car(String color, String brand, int seats){
        this.color=color;
        this.brand=brand;
        this.seats=seats;
    }

    public Car( String brand, int seats){
        this.color="white";
        this.brand=brand;
        this.seats=seats;
    }

    public String changeColor(String color){
        this.color = color;
        return color;
    }

    public String changeBrand(String brand){
        this.brand = brand;
        return brand;
    }

    public int changeSeats(int seats){
        this.seats = seats;
        return seats;
    }

    public void printInfo(){
        System.out.println("Color is: "+color);
        System.out.println("Brand : "+brand);
        System.out.println("Number of Seats: "+seats);
    }
}

