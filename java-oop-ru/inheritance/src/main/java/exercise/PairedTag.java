package exercise;

import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag {
    private String tagBody;
    private List<Tag> listOfSingleTags;

    public PairedTag(String tagName, Map<String, String> tagAtributes, String tagBody, List<Tag> listOfSingleTags) {
        super(tagName, tagAtributes);
        this.tagBody = tagBody;
        this.listOfSingleTags = listOfSingleTags;
    }

    @Override
    public String toString() {
        var newList = new ArrayList<String>();
        var keys = super.getTagAtributes().keySet();
        for (var key : keys) {
            newList.add(key);
        }
        String result = "<" + super.getTagName() + " ";
        for (int i = 0; i < newList.size(); i++) {
            result += newList.get(i) + "=\"" + super.getTagAtributes().get(newList.get(i)) + "\" ";
        }
        result = result.trim();
        result += ">" + this.tagBody;
        if (this.listOfSingleTags.size() > 0) {
            for (int i = 0; i < this.listOfSingleTags.size(); i++) {
                result += this.listOfSingleTags.get(i).toString();
            }
        }
        result += "</" + this.getTagName() + ">";
        return result;
    }
}
// END
