
class LinkedList{
    class Node{
        int data;
        Node next;


        Node(int data){
            this.data = data;
            next = null;
        }
    }

    Node head1;
    Node head2;

    public void insertList1(int newData){
        Node newNode1 = new Node(newData);
        newNode1.next = head1;
        head1 = newNode1;
    }
    public void insertList2(int newData){
        Node newNode2 = new Node(newData);
        newNode2.next = head2;
        head2 = newNode2;
    }

    public void comapreLists(){
        Node tempNode1 = head1;
        Node tempNode2 = head2;
        while(tempNode1!= null){                
            while(tempNode1.data != tempNode2.data){
            
                tempNode2 = tempNode2.next;
            }
            while (tempNode1.data == tempNode2.data){
                System.out.println("the value: " + tempNode1.data + " was found in list 1 & 2.");
                tempNode1 = tempNode1.next;
                tempNode2 = head2;
                if(tempNode1 == null){
                    break;
                }

            }
        }
        System.out.println("This is the end of the list.");   
    }
}
        // ! THIS CODE ONLY WORKS IF THE LISTS ARE THE SAME LENGTH

public class CompareContentsLL {
    public static void main(String[] args){
        LinkedList list = new LinkedList();

        list.insertList1(1);
        list.insertList1(2);
        list.insertList1(3);
        list.insertList1(4);
        list.insertList1(5);

        list.insertList2(5);
        list.insertList2(4);
        list.insertList2(3);
        list.insertList2(2);
        list.insertList2(1);

        list.comapreLists();
    }
}

