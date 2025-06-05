// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
     
       int n=sc.nextInt();
       int nums[]=new int [n];
       for(int i=0;i<n;i++){
           nums[i]=sc.nextInt();
       }
   
       int res=0;
       int curr=0;
       for(int i=1;i<nums.length;i++){
           System.out.println(nums[i]);
           int prev=nums[i-1];
           if(prev<nums[i]){
                curr++;
               
           }else{
              res=Math.max(res,curr);
               curr=0;
           }
       }
       System.out.println(res);
    }
}