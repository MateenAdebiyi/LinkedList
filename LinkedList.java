/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author MATEEN
 */
public class LinkedList {

    /**
     * @param args the command line arguments
     */
    Node head;
    
    public void insertData(int data){
        
        Node node = new Node();
        node.data = data;
        node.next = null;
        
        if (head ==null)
            
            head = node;
        
        else{
            Node n = head;
            
            while(n.next!=null){
                n= n.next;

}
            n.next = node;
}
}
    
    public void show(){
        
        Node node = head;
        
        while(node.next!=null){
            
            System.out.println(node.data);
            node = node.next;
}
     System.out.println(node.data);
}
    
    public void insertAtStart(int data){
        
       Node node = new Node();
       node.data = data;
       node.next = head;
       head = node;
}

    public void insertDataAtIndex(int data, int index){
         Node node = new Node();
       node.data = data;
       node.next= null;
       if (index == 0){
          insertAtStart(data);
       }
       else{
      Node n = head;
      for (int i =0;i<index-1;i++){
          n=n.next;
}
      node.next = n.next;
      n.next = node;
}
}
    
    public void deleteAtChar(int k)
    {
        
        if (k==0){
            head = head.next;
}
        else{
            Node n = head;
            Node n1 = null;
    for (int i = 0; i<k-1;i++){
        n = n.next;
}
    n1 = n.next;
    n.next = n1.next;
    System.out.println ("The removed data is"+ n1.data);
}
}
}