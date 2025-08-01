//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(equalIsNot("This is not"));
    }

    public static boolean equalIsNot(String str) {
        String is = "is";
        String not = "not";
        int isCount = 0;
        int notCount = 0;

        for(int i = 0; i <= str.length() - is.length(); i++) {
            if(str.substring(i, i+is.length()).equals("is")) {
                isCount ++;
            }
        }

        for(int i = 0; i <= str.length() - not.length(); i++) {
            String sub = str.substring(i, i + not.length());
            if(sub.equals("not")) {
                notCount++;
            }
        }
        if(isCount == notCount) {
            return true;
        }
        else {
            return false;
        }
    }
}