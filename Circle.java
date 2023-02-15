public class Circle extends CircularLinkedList{
    CircularLinkedList c = new CircularLinkedList();
    public void enqueue(){
        
        System.out.print("How many values do you want add:\t");
        int listSize = sc.nextInt();
        int input;
        for(int i = 0; i < listSize; i++){
            System.out.print("Enter value:\t");
            input = sc.nextInt();
            c.insert(input);
        }
    }

    public void displayQueue(){
        System.out.println("Are there any values you want to delete?\n1)Yes\n2)No");
        int yes = sc.nextInt();
        if(yes == 1){
        System.out.print("Enter value to delete:\t");
        int num = sc.nextInt();
        c.delete(num);
        }
        c.display();
    }

    public void deleteCircle(){
        c.clearCircle(null);
        System.out.println("\nList has been cleared!\n");
    }
}

