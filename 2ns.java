import java.util.*;

class Main {
    public static boolean ispalin(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') res += c;
            else if (c >= 'A' && c <= 'Z') res += (char)(c + 32);
            else if (c >= 'a' && c <= 'z') res += c;
        }

        System.out.println(res);
        System.out.println(ispalin(res));
    }
}