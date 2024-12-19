package Gradient.Real_Estate_Domain;

public class Apartment extends Property{
    private int numOfBedRooms;

    public Apartment(int numOfBedRooms)
    {
        this.numOfBedRooms = numOfBedRooms;
    }

    public int getNumOfBedRooms() {
        return numOfBedRooms;
    }

    public void setNumOfBedRooms(int numOfBedRooms) {
        this.numOfBedRooms = numOfBedRooms;
    }


    @Override
    public double calculateRent() {
        return numOfBedRooms * 1000;
    }

    @Override
    public void getPropertyDetails() {
        System.out.println("It contains : " + numOfBedRooms);
    }
}