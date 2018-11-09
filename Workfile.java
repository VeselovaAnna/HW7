package homework7;

import java.io.*;

public class Workfile {


    public static String readFromFile(String path) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String json = "";
        try {
            StringBuilder sb = new StringBuilder();
            String line = reader.readLine();

            while (line != null) {
                sb.append(line);
                sb.append("\n");
                line = reader.readLine();
            }
            json = sb.toString();
            System.out.println(json);
        } finally {
            reader.close();
        }
        return json;
    }

    public static void writeToFile(String json,String path) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
       fileWriter.write(json);
       fileWriter.flush();
       fileWriter.close();
    }


}
