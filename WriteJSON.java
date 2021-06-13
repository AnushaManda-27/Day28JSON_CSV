package com.jsonannotation;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class WriteJSON {
    public static void main(String[] args)  {

        try {
            ObjectMapper mapper = new ObjectMapper();
            InputStream inputStream = new FileInputStream(new File("C:\\Users\\M Veeraiah\\jsonfile\\Data.json"));

            //To write data
            Person person = new Person();
            person.setFirstName("Anusha");
            person.setLastName("Manda");
            person.setAge(22);
            person.setAddress(new Address("Hyd", "Telangana", 504302, "9876543210", "anushamand27@gmail.com"));
            person.setDetails("This is My Details");
            mapper.writeValue(new File("C:\\Users\\M Veeraiah\\jsonfile\\Data.json"), person);
            inputStream.close();
            System.out.println("Data is Entered;");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JsonParseException e) {
            
            e.printStackTrace();
        } catch (JsonMappingException e) {
            
            e.printStackTrace();
        } catch (IOException e) {
            
            e.printStackTrace();
        }
    }
}

