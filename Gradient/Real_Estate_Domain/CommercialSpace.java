package Gradient.Real_Estate_Domain;

public class CommercialSpace extends Property{
    private double squareFootage;


    public  CommercialSpace(double squareFootage)
    {
        this.squareFootage = squareFootage;
    }

    public double getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(double squareFootage) {
        this.squareFootage = squareFootage;
    }

    @Override
    public void getPropertyDetails() {
        System.out.println("The Square Footage is : " + squareFootage);
    }

    @Override
    public double calculateRent() {
        return squareFootage * 777 ;
    }
}
