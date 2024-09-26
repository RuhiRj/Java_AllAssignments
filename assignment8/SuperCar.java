package assignment8;

public class SuperCar {
    String ownerName;
    float price;
    String colour;
    String brand;
    void setOwnerName(String ownerName){
        this.ownerName=ownerName;
    }
    void setPrice(float price){
        this.price=price;
    }
    void setColour(String colour){
        this.colour=colour;
    }
    void setBrand(String brand){
        this.brand=brand;
    }
    String getOwnerName(){
        return  ownerName;
    }
    float getPrice(){
        return price;
    }
    String getColour(){
        return colour;
    }
    String getBrand(){
        return brand;
    }
}
class ShowSuperCarFeature{
    public static void main(String[] args){
        SuperCar car=new SuperCar();
        car.setOwnerName("Mukesh");
        String owner=car.getOwnerName();
        System.out.println("owner name is = " +owner);
        car.setBrand("Lamborghini Aventador");
        String brand=car.getBrand();
        System.out.println("car brand name is = " +brand);
        car.setColour("White");
        String colour=car.getColour();
        System.out.println("car colour is = " +colour);
        car.setPrice(20000000f);
        float price=car.getPrice();
        System.out.println("car price is = " +price);
    }
}
