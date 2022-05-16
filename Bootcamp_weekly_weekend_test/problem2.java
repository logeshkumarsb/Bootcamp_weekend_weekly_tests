import java.util.Scanner;
public class problem2 {
    public static void Solve(String str1){
        String ans1="";
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)=='G'){
                ans1=ans1+"G";
            }
            if(str1.charAt(i)=='('){
                if(str1.charAt(i+1)==')'){
                ans1=ans1+"o";
                }
                else{
                    ans1=ans1+"al";
                    i=i+3;
                }
            }
        }
        System.out.println(ans1);
    }
    public static void main(String args[] ) throws Exception {
      Scanner input=new Scanner(System.in);
      String str1=input.next();
      Solve(str1);
    }
}
