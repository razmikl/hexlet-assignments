package exercise;

import java.util.Map;

// BEGIN
import java.util.ArrayList;

public class SingleTag extends Tag {

    public SingleTag(String tagName, Map<String, String> tagAtributes) {
        super(tagName, tagAtributes);
    }

    @Override
    public String toString() {
        var newList = new ArrayList<String>();
        var keys = super.getTagAtributes().keySet();
        for (var key : keys) {
            newList.add(key);
        }
        String result = "<" + this.getTagName() + " ";
        for (int i = 0; i < newList.size(); i++) {
            result += newList.get(i) + "=\"" + super.getTagAtributes().get(newList.get(i)) + "\" ";
        }
        result = result.trim();
        result += ">";
        return result;
    }
}
// END
