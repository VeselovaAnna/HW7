package homework7;

import com.alibaba.fastjson.JSON;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        ArrayList<Fruits> fruits = new ArrayList<>();

        fruits.add(new Fruits(10, "05/05/2022", 85, Fruits.FruitName.ananas));
        fruits.add(new Fruits(20, "01/11/2029", 150, Fruits.FruitName.apple));
        fruits.add(new Fruits(30, "01/11/2018", 45, Fruits.FruitName.banana));
        fruits.add(new Fruits(25, "03/04/2014", 33, Fruits.FruitName.mango));

        Shop shop1 = new Shop("Shop1", fruits);


        String json = JSON.toJSONString(shop1);
        System.out.println(json);


        Shop clonejson = JSON.parseObject(json, Shop.class);
        System.out.println(clonejson);


        //  pathJsonFile = "./src/homework7/test1";


        Workfile workfile = new Workfile();
        workfile.readFromFile("./src/main/java/homework7/test1");
        workfile.writeToFile(json, "./src/main/java/homework7/test2");

    }


}
