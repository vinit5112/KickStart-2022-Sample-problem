
import java.util.Scanner;
public class Sample_problem_code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numcase = sc.nextInt();
        for (int i = 1; i <= numcase; i++) {
            
        int num_bags = sc.nextInt();
        int num_kids = sc.nextInt();
        int total_cady=0;
        for(int j =0;j<num_bags;j++){
           
            int candy = sc.nextInt();
            total_cady += candy;
        }
        int r= total_cady % num_kids;
            System.out.println("Case #" + i + ": " + r);
        }
    
    }
}
