package creational;

import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Array;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import java.io.StringWriter;
import org.json.simple.JSONArray;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {

//    private Map JSONObj;
    private JSONObject JSONObj;
    JSONArray list = new JSONArray();
    public JSONBookMetadataFormatter(){
        reset();
    }
    @Override
    public BookMetadataFormatter reset() {
        // Please implement this method. You may create additional methods as you see fit.
        JSONObject JSONObj = new JSONObject();
        JSONArray list = new JSONArray();
        return this;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        // Please implement this method. You may create additional methods as you see fit.
//        System.out.print(b.getISBN());

        JSONObject JSONObj = new JSONObject();
        String authors = String.join("|", b.getAuthors());
        JSONObj.put("ISBN",b.getISBN());
        JSONObj.put("title",b.getTitle());
        JSONObj.put("publisher",b.getPublisher());
        JSONObj.put("authors",authors);
        list.add(JSONObj);
        return this;
    }

    @Override
    public String getMetadataString() {
        // Please implement this method. You may create additional methods as you see fit.

//        String jsonText = JSONValue.toJSONString(JSONObj);
//        return jsonText;
        return list.toJSONString();
    }
}
