import java.util.Scanner;

public class problem4 {
     public static void Solve(String str1){
        String[] ans=new String[str1.split(" ").length];
        for(String st:str1.split(" "))
        {
            ans[st.charAt(st.length()-1)-'1']=st.substring(0,st.length()-1);
        }
        String ans1="";
        for(int i=0;i<ans.length;i++){
            ans1=ans1+ans[i]+" ";
        }
        System.out.println(ans1);
 }
 public static void main(String args[] ) throws Exception {
     Scanner input=new Scanner(System.in);
     String str1=input.nextLine();
     Solve(str1);
 }
}
