package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        LinkedList head = new LinkedList(10);
        LinkedList l2 = new LinkedList(12);
        LinkedList l3 = new LinkedList(4);
        LinkedList l4 = new LinkedList(7);

        //connecting the nodes

        head.next = l2;
        l2.next = l3;
        l3.next = l4;

        LinkedList current = head;

        while (current != null){
            System.out.print(current.data+" ---->");

            current=current.next;


        }
        System.out.println("null");
        int count = 0;


        for(current=head; current!=null; current = current.next){

            count++;
        }
        System.out.println("Length is : "+count);


    }
}
