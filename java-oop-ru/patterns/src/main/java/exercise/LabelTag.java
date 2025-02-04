package exercise;

// BEGIN
public class LabelTag implements TagInterface {
    private String firstTag;
    private TagInterface dautherTag;

    LabelTag (String firstTag, TagInterface dautherTag) {
        this.firstTag = firstTag;
        this.dautherTag = dautherTag;
    }

    @Override
    public String render() {
        return "<label>" + this.firstTag + dautherTag.render() + "</label>";
    }
}
// END
