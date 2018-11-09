package homework7;


import java.util.List;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

import java.util.Date;

import java.util.stream.Collectors;

public class Shop {

    public String name;
    public ArrayList<Fruits> fruits;

    public Shop(String name, ArrayList<Fruits> fruits) {
        this.name = name;
        this.fruits = fruits;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Fruits> getFruits() {
        return fruits;
    }

    public void setFruits(ArrayList<Fruits> fruits) {
        this.fruits = fruits;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", fruit=" + fruits +
                '}';
    }


    public List<Fruits> getSpoiledFruits(Date expiredData){
        List<Fruits>spoiledFruits = new ArrayList<>();
        for (Fruits fruits:fruits){
            if(isFruitSpoiled(fruits,expiredData)){
                spoiledFruits.add(fruits);
            }


        }
        return spoiledFruits;

    }

    private boolean isFruitSpoiled(Fruits fruits,Date date){
        return date.toInstant()
                .isAfter(Instant.ofEpochMilli(fruits.getProductionDate())
                        .plus(fruits.getExpiresDays(), ChronoUnit.DAYS));
    }


    public List<Fruits>getSpoiledFruits(Date expiredDate){
        return fruits.stream()
                .filter(fruits1 -> isFruitSpoiled(fruits,expiredDate)).collect(Collectors.toList());
    }

    private boolean isFruitsSpoiled(Fruits fruits,Date date){
        return date.toInstant().isAfter(Instant.ofEpochMilli(fruits.getDate()).plus(fruits.getExpiresDays()));
    }

}

