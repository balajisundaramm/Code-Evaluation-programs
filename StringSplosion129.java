public class StringSplosion129 {
    public static void main(String[] args) {
        String str="abcd";
        System.out.println(stringSplosion(str));
    }
    public static String stringSplosion(String str) {
        String result="";
        for (int i = str.length()-1; i>=0 ; i--) {
            result=result+str.substring(0,(str.length()-i));
        }
        return result;
    }
}
