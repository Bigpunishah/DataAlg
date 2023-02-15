import java.util.Scanner;
public class Project6{
    public static void main(String[] args){
        Circle circle = new Circle();
        Scanner sc = new Scanner(System.in);
        int menu;
        String choice = "yes";

        while(choice == "yes"){
            System.out.print("1) EnQueue Circle\n2) Display Queue\n3) Clear circle \n4) Exit:\t");
            menu = sc.nextInt();
            
                if(menu ==1){ 
                    circle.enqueue();
                }

                if(menu == 2){
                    circle.displayQueue();
                }  
                
                if(menu == 3){
                    circle.deleteCircle();
                    
                }
                
                if(menu == 4){
                    choice = "no"; 
                    System.out.println("Bye!");                   
                }
        }   
                sc.close();
    }
}
