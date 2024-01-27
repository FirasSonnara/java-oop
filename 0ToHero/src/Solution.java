import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                String strX = ""+x ;
                while (strX.length()<3){
                    strX = "0" + strX;
                }
                System.out.println(s1+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+strX);
                
            }
            sc.close();
            System.out.println("================================");

    }
}


