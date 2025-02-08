package exercise;

import java.util.stream.Collectors;
import java.util.Map;

// BEGIN
public class Tag {
    private String tagName;
    private Map<String, String> tagAtributes;

    public Tag(String tagName, Map<String, String> tagAtributes) {
        this.tagName = tagName;
        this.tagAtributes = tagAtributes;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public Map<String, String> getTagAtributes() {
        return tagAtributes;
    }

    public void setTagAtributes(Map<String, String> tagAtributes) {
        this.tagAtributes = tagAtributes;
    }
}
// END
