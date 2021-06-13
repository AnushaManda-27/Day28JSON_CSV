import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVWriter;

public class WriteToCSV {

    public static void main(String args[]) throws Exception {

        CSVWriter writer = new CSVWriter(new FileWriter("C:\\Users\\M Veeraiah\\csv file\\data.txt"));

        List<String[]> list = new ArrayList<String[]>();
        String header[] = {"fname", "lname", "city", "State"};
        String line2[] = {"Anusha", "Manda", "Hyderabad", "Telangana"};
        String line3[] = {"Ajith", "Kumar", "Hyderabd", "Telangana"};
        String line4[] = {"Pushpa", "Latha", "Hyderabad", "Telangana"};

        list.add(header);
        list.add(line2);
        list.add(line3);
        list.add(line4);

        writer.writeAll(list);
        writer.flush();
        System.out.println("Data entered");
    }
}

