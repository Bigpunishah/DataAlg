package Project4;

public class LinkedList {
     
    Node head;

    class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

        public void insert(int newData){

            Node newNode = new Node(newData);

            newNode.next = head;

            head = newNode;
        }
        
        class Circle{
            
            int radius;
    
            public void setRadius(int radius) {
                this.radius = radius;
            }
            public void getRadius() {
                System.out.println("Radius: " + radius);  
            }
            public void calculateArea(){
                double area = (radius * radius) * 3.141592653589793238;
                System.out.println("Area: " + area);
                
            }
        }

        public void DisplayElements(){

                Circle getData = new Circle();
                Node tnode = head;

                while(tnode != null){
                    System.out.println("The Elements of this circle: ");
                        //System.out.println(tnode.data);
                getData.setRadius(tnode.data);
                getData.getRadius();
                getData.calculateArea();
                System.out.println("\n");
                tnode = tnode.next;
                }
                


        }

    public static void main(String[] args){
        LinkedList list = new LinkedList();

        list.insert(5);
        list.insert(7);
        list.insert(9);
        list.insert(3);

        list.DisplayElements();

    }
}
