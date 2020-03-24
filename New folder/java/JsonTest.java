import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.net.URL;

public class JsonTest {
    public static void main(String[] arg) {
        String hi = "Hello World";
        System.out.println(hi);

        //File jsonFile = new File("C:\\Users\\bhaba\\JSON\\src\\Order1.json");


        //String jsonString = "{\"StandardHeader\":{\"SendingTime\":\"2019-12-17T01:00:29.649Z\",\"WMHeader\":{\"WMHeaderProduct\":\"Equtity\",\"WMHeaderChannel\":\"Advisory\",\"WMHeaderTouchpoint\":\"Batch\"}}}";
        String jsonString = "{\"StandardHeader\":{\"SendingTime\":\"2019-12-17T01:00:29.649Z\",\"WMHeader\":{\"WMHeaderProduct\":\"Equtity\",\"WMHeaderChannel\":\"Advisory\",\"WMHeaderTouchpoint\":\"Batch\"}},\"Body\":[{\"Entities\":[{\"BaseReference\":{\"EntityOID\":\"20191216063145-C-TICKET\",\"WMEntityVersionID\":\"1\",\"WMpartition\":\"1\",\"RootID\":\"O326089-C\",\"parentEntityID\":\"O326089-C-SUMMARY\",\"EntityType\":\"TICKET\",\"EntityStatus\":\"NEW\",\"WMEntitySchemaName\":\"minerva-cat-1_0.json\",\"WMEntitySchemaVersion\":\"1_0\",\"WMEntitySchemaCode\":\"1\"}}]}]}";
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();
        MyPOJO myPOJO = gson.fromJson(jsonString, MyPOJO.class);
        System.out.println(myPOJO);
    }
}
