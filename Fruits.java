package homework7;

import java.util.ArrayList;

public class Fruits {

   public int shelfLife; //срок годности
    public  String date;
    public int price;
    public FruitName fruitName;


    public enum FruitName{
        banana,
        apple,
        strawberry,
        pear,
        mango,
        orange,
        ananas,
    }


    public Fruits(int shelfLife, String date, int price, FruitName fruitName) {
        this.shelfLife = shelfLife;
        this.date = date;
        this.price = price;
        this.fruitName = fruitName;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public FruitName getFruitName() {
        return fruitName;
    }

    public void setFruitName(FruitName fruitName) {
        this.fruitName = fruitName;
    }

    @Override
    public String toString() {
        return "Fruits{" +
                "shelfLife=" + shelfLife +
                ", date='" + date + '\'' +
                ", price=" + price +
                ", fruitName=" + fruitName +
                '}';
    }
}
