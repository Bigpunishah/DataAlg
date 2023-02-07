
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
        if(head1 == null && head2 == null){
        System.out.println("End of the list.");
        }

        while(head1 != null && head2 != null){
            if(head1.data == head2.data){
                System.out.println( "values: " + head1.data + " & " + head2.data + " are equal.");
                
            }
            else{
                System.out.println( "values: " + head1.data + " & " + head2.data + " not equal.");
        } 
            head1 = head1.next;
            head2 = head2.next;
    }
                
    }
}

public class ComparedLinkedLists {
    public static void main(String[] args){
        LinkedList list = new LinkedList();

        list.insertList1(1);
        list.insertList2(1);

        list.insertList1(2);
        list.insertList2(2);

        list.insertList1(3);
        list.insertList2(3);

        list.insertList1(4);
        list.insertList2(4);

        list.insertList1(5);
        list.insertList2(6);

        list.insertList1(25);
        list.insertList2(-4);        

        list.comapreLists();
        
    }
}
