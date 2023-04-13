import java.util.LinkedList;

public class linklist {
    class Node{
         String data;
         Node nextNode;
       Node(String data){
            this.data = data;
            this.nextNode=null;
        }


    }

    public void addfirst(String head){
        Node newNode=new Node("data");
        if(head == null){
            head  = newNode.toString();
        }
    }
    public static void main(String[] args) {
        LinkedList<Integer> obj=new LinkedList<>();
obj.addFirst(10);
obj.add(20);
obj.add(30);
obj.add(50);
obj.add(60);
obj.add(70);
obj.add(80);
obj.add(3,40);
obj.remove(3);
        System.out.println(obj);
    }
}
