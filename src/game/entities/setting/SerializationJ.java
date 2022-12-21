package game.entities.setting;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;

public class SerializationJ {
    public Object jackson(Configuration configuration) throws IOException {
        //it's just an attempt to overtake the class into a file
        // make mapper
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        // do serialization to string
        String asString = objectMapper.writeValueAsString(configuration);
        System.out.println(asString);
        // do serialization to file
        objectMapper.writeValue(new File("src/res.json"), configuration);
        // do deserialization from file
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        Configuration husbandJackson = objectMapper.readValue(new File("src/res.json"), Configuration.class);
        configuration = husbandJackson;
        System.out.println(configuration);
        return configuration;
    }
}
