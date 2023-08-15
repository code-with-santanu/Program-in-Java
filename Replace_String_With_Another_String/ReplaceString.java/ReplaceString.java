public class ReplaceString {
    
    public ReplaceString(){}

    public String replace(String str, String replace, String replaceWith)
    {
        String replaceString = str.replaceAll(replace, replaceWith);

        return replaceString;
    }
}
