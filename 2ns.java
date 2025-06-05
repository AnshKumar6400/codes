// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static boolean ispalin(String s){
        int i=0;
        int j=s.length();
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
            
        }
        return true;
    }
    public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
String s=sc.nextLine();

String res="";
for(int i=0;i<s.length();i++){
if(s.charAt(i)<'9'&&s.charAt(i)>='0')res+=s.charAt(i);
if(s.charAt(i)>'A'&&s.charAt(i)<'Z')res+=s.charAt(i)-'A'+'a';
}

System.out.println(res);
    }
}