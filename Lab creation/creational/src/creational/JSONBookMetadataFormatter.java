package creational;

import java.io.IOException;
import java.io.StringWriter;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {

    private Map JSONObj;

    public JSONBookMetadataFormatter(){
        reset();
    }
    @Override
    public BookMetadataFormatter reset() {
        // Please implement this method. You may create additional methods as you see fit.
        Map  JSONObj = new LinkedHashMap();
        return this;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        // Please implement this method. You may create additional methods as you see fit.
        JSONObj.put("ISBN",b.getISBN());
        JSONObj.put("title",b.getTitle());
        JSONObj.put("publisher",b.getPublisher());
        JSONObj.put("authors",b.getAuthors());
        return this;
    }

    @Override
    public String getMetadataString() {
        // Please implement this method. You may create additional methods as you see fit.

        String jsonText = JSONValue.toJSONString(JSONObj);
        return jsonText;
    }
}
