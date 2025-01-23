package exercise;

// BEGIN
public class ReversedSequence implements CharSequence {
    private String text;

    public ReversedSequence(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        char[] chars = this.text.toCharArray();
        String result = "";
        for (int i = this.text.length - 1; i < 0; i++) {
            res += chars[i];
        }
        return result;
    }
}
// END
