class Practice{
    class Node
    {
        int data;
        Node next;
    }
    private Node head;
    Practice(){
        head=new Node();
        head=null;
      
        
    }
    void Create(int n){
        Node p,r;
        if(head==null){
            head = new Node();
            head.data=n;
            head.next=null;
        }
        else
        {
            r=new Node();
            r.data=n;
            r.next=null;
            p=head;
            while(p.next!=null){
                p=p.next;
            }
            p.next=r;
        }
    }
    void Display(){
        Node p=head;
        while(p!=null){
            System.out.print(p.data+" ");
            p=p.next;
        }
    }

    int count(){
        int c=0;
        Node p,r;
        p=head;
        while(p!=null){
            c++;
            p=p.next;

        }
        return c;
    }
    void insert(int pos,int n){
        int c=count();
        if(pos>c){
            System.out.println("Out of range !");
        }
        else{
         Node r=new Node();
         r.data=n;
         
         Node p=head;
         for(int i=1;i<pos;i++){
            p=p.next;
         }
         r.next=p.next;
         p.next=r;
        }
    }
    void deleteByPosition(int pos){
        int c=count();
        Node r=new Node();
        if(head==null){
            System.out.println("LiskedList is empty");
        }
        else if(pos>=c){
            System.out.println("Out of range");
        }
        else if(pos==0){
            Node p=head;
            head=head.next;
            p=null;
        }
        else{
            Node p=head;
            for(int i=1;i<=pos;i++){
                r=p;
                p=p.next;
            }
            r.next=p.next;
            p=null;
        }

    }
    void reverse(){
        Node r,p,s;
        r=null;
        p=head;
        while(p!=null){
            s=r;
            r=p;
            p=p.next;
            r.next=s;
            
        }
        head=r;

    }
    void sort(){
        Node p,q;
        int t;
        p=head;
        while(p.next!=null){
            q=p.next;
            while(q!=null){
                if(p.data>q.data){
                    t=p.data;
                    p.data=q.data;
                    q.data=t;
                }
                q=q.next;

            }
            p=p.next;
        }
    }
}
class LinkedList
{
    public static void main(String args[]){
        Practice x=new Practice();
        x.Create(23);
         x.Create(23);
          x.Create(233);
           x.Create(13);
           x.Create(48);
            // x.Display();
        //   int m= x.count();
        //   System.out.println("Count is "+ m);
        // x.insert(4, 69);
        // x.deleteByPosition(2);
        //   x.Display();
        // x.reverse();
        // x.Display();
        x.sort();
        x.Display();
        
    }
}