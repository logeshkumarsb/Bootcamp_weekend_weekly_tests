import java.util.Scanner;

public class problem3 {
    public static void main(String args[] ) throws Exception {
        Scanner input=new Scanner(System.in);
        String ans=input.next();
        int[] count=new int[10];
        boolean[] vis1=new boolean[10];
        boolean[] vis2=new boolean[10];
        boolean[] vis3=new boolean[10];
        for(int i=0;i<ans.length()-1;i=i+2){
            if(ans.charAt(i)=='B'){
                int pos=ans.charAt(i+1)-'0';
                if(!vis1[pos]){
                    count[pos]++;
                    vis1[pos]=true;
                }
            }
            if(ans.charAt(i)=='R'){
                int pos=ans.charAt(i+1)-'0';
                if(!vis2[pos]){
                    count[pos]++;
                    vis2[pos]=true;
                }
            }
            if(ans.charAt(i)=='G'){
                int pos=ans.charAt(i+1)-'0';
                if(!vis3[pos]){
                    count[pos]++;
                    vis3[pos]=true;
                }
            }
        }
        int ans1=0;
        for(int i=0;i<count.length;i++){
            if(count[i]==3){
                ans1=ans1+1;
            }
        }
        System.out.println(ans1);
     }
}
