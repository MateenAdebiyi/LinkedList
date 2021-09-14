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
public class Running {
    
    public static void main (String[]args){
        
        LinkedList nt = new LinkedList();
        nt.insertData(15);
        nt.insertData(40);
        nt.insertData(80);
        nt.insertAtStart(100);
        nt.insertAtStart(500);
        nt.insertDataAtIndex(800,2);
        nt.insertDataAtIndex(1000,0);
        nt.deleteAtChar(2);
        nt.show();
}
}