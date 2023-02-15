import java.util.Scanner;
public class CircularLinkedList {
    
    Scanner sc = new Scanner(System.in);

        class Node{
            int data;
            Node next;

            Node(int data){
                this.data = data;

            }
        }

        Node head = null;
        Node tail = null;

        public void insert(int newData){
            Node newNode = new Node(newData);

            if(head == null){
                head = newNode;
            }
            else{
                tail.next = newNode;
                
            }
            tail = newNode;
            tail.next = head;
        }

    public void delete(int dataToDelete){
        Node move = head;
        if(move == null){
            System.out.println("Circle is empty");
            return;
        }
        else{
            do{
                Node ahead = move.next;
                if(ahead.data == dataToDelete){
                    if(head == tail){
                        head = null;
                        tail = null;
                    }
                    else{
                        move.next = move.next.next;
                        head = move;
                    }
                }
                move = ahead;
            }
            while(move != head);
            head = move;
        
        }
    }
            
        public void display(){
            Node temp = head;
            
            if(head == null){
                System.out.println("Circle is empty.");
            }
            else{
                System.out.print("The circle values:\t");
                do{
                    System.out.print(temp.data + " ");
                    temp = temp.next;
                }
                while(temp != head);
                head = temp;
                System.out.println();
            }
        }


        public void clearCircle(Node nodeDelete){
            Node temp = head;
            if(temp == null){
                System.out.println("Circle is empty");
                return;
            }
            while(temp != nodeDelete){
                head = null;
                tail = null;
                break;
            }
        }
}
    

