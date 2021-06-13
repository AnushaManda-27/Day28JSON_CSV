import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.jar.JarException;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSON {
    public static void main(String[] args) throws JarException, JarException, IOException {

        try {
            ObjectMapper mapper = new ObjectMapper();
            InputStream inputStream = new FileInputStream(new File("D:\\Json\\test.json"));
            TypeReference<List<Person>> typeReference = new TypeReference<List<Person>>() {};
            List<Person> persons = mapper.readValue(inputStream, typeReference);
            for(Person p : persons) {
                System.out.println("Name is: " + p.getFirstName() + p.getLastName() +
                        "\nage is: " + p.getAge() + "\nCity is: " + p.getAddress().getCity() +
                        "\nState is : " + p.getAddress().getState() +"\nContact No: " + p.getAddress().getPhoneNo() +
                        "\nAll details is: " + p.getDetails());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }



}
