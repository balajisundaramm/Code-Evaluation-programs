public class RomanToInteger {
    public static void main(String[] args) {
        String a="1";
        while (a!="0") {
            System.out.println("Enter the Romanletter below 3999");
            Scanner scanner=new Scanner(System.in);
            String s=scanner.nextLine();
            System.out.println(romanToInt(s));

            System.out.println("Enter 1 to continue 0 to exit");
            a=scanner.nextLine();
        }
    }
    public static int romanToInt(String s){
        s=s.toUpperCase();
        int result=0;
        String temp="";
        String[] oneDigit={"","I","II","III","IV","V","VI","VII",
                "VIII","IX"};
        String[] twoDigits={"","X","XX","XXX","XL","L","LX","LXX",
                "LXXX","XC"};
        String[] threeDigits={"","C","CC","CCC","CD","D","DC","DCC",
                "DCCC","CM"};
        String[] fourDigits={"","M","MM","MMM","MMMM"};

// to get single digit Int for the given Roman
            for (int j = 0; j <oneDigit.length; j++) {
               if (s.equals(oneDigit[j])){
                   result=j;
                   return result;
               }
            }
            //To get ten'th digit Int for the given Roman
            for (int i = 0; i <s.length() ; i++) {
                temp = s.substring(0, s.length() - i);
                for (int j = 0; j < twoDigits.length; j++) {
                    if (temp.equals(twoDigits[j])) {
                        result = (j * 10);
                        break;
                    }
                }

                if (result > 0){
                    String temp2=s.substring(temp.length());
                    return result + romanToInt(temp2);
                }
            }

       // three digits

        for (int i = 0; i <s.length() ; i++) {
            temp = s.substring(0, s.length() - i);
            for (int j = 0; j < threeDigits.length; j++) {
                if (temp.equals(threeDigits[j])) {
                    result = (j * 100);
                    break;
                }
            }
            if (result > 0){
                String temp3=s.substring(temp.length());
                return result + romanToInt(temp3);
            }
        }

        //fourth
        for (int i = 0; i <s.length() ; i++) {
            temp = s.substring(0, s.length() - i);
            for (int j = 0; j < fourDigits.length; j++) {
                if (temp.equals(fourDigits[j])) {
                    result = (j * 1000);
                    break;
                }
            }
            if (result > 0){
                String temp4=s.substring(temp.length());
                return result + romanToInt(temp4);
            }
        }
        return 0;
    }
}
