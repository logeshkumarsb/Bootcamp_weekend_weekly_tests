import java.util.Scanner;

public class prolem1 {
     public static void Solve(String str1){
        int x=0;
        String[] ans=str1.split(" ");
        for(int i=-0;i<ans.length;i++){
           String str=ans[i];
           if(str.charAt(1)=='+'){
               x+=1;
           }
           if(str.charAt(1)=='-'){
               x+=-1;
           }
        }
        System.out.println(x);
      }
     public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str1=input.nextLine();
        Solve(str1);
     }
}
