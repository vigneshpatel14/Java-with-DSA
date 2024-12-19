package Gradient.Real_Estate_Domain;

public class RealEstateManagement {
    public static void main(String[] args) {
        Apartment mayur = new Apartment(3);
        mayur.getPropertyDetails();
        System.out.println("Rent : " + mayur.calculateRent());

        CommercialSpace cs = new CommercialSpace(100);
        cs.getPropertyDetails();

        System.out.println("Rent : " + cs.calculateRent());

    }
}
