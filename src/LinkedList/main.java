package LinkedList;

public class main {
    public static void main(String[] args){
        Node linkedlist = new Node(5);
        Node n2 = new Node(10);
        Node n3 = new Node(15);

        linkedlist.next = n2;
        n2.next = n3;

        printNode(linkedlist);
    }

    public static void printNode(Node n1){
        while(n1.next != null){
            System.out.println(n1.data);
            n1 = n1.next;
            if(n1.next == null){
                System.out.println(n1.data);
                break;
            }
        }
    }

    public static void reverse(Node n1){
        while(n1.next != null){

        }
    }
}
