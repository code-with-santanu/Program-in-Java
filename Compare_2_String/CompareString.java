public class CompareString {
    private String s1, s2;

    public CompareString (String str1, String str2)
    {
        this.s1 = str1;
        this.s2 = str2;
    }

    public int compare()
    {
        return s1.compareTo(s2);
    }
}
