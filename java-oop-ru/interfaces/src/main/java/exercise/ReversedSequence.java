package exercise;

// BEGIN
public class ReversedSequence implements CharSequence {
    private String text;

    public ReversedSequence(String text) {
        this.text = text;
    }

    public String subSequence(int num1, int num2) {
        char[] charArray = this.text.toCharArray();
        String result = "";

        for (int i = num1 + 1; i <= num2; i++) {
            result += charArray[i];
        }
        return result;
    }

    public char charAt(int number) {
        char[] charArray = this.text.toCharArray();
        return charArray[number];
    }

    public int length() {
        char[] charArray = this.text.toCharArray();
        return charArray.length;
    }

    @Override
    public String toString() {
        char[] chars = this.text.toCharArray();
        String result = "";
        for (int i = this.text.length() - 1; i < 0; i++) {
            result += chars[i];
        }
        return result;
    }
}
// END
