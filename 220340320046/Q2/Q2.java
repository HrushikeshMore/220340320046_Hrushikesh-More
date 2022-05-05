import java.util.*;
class Q2{
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int x){
			this.data=x;
			this.next=null;
		}
	}
	void append(int x){
		Node n2=new Node(x);
		Node n=head;
		if(head==null){
			head=n2;
			return;
		}
		while(n.next!=null){
			n=n.next;
		}
		n.next=n2;
	}
	void disp(){
		Node n=head;
		while(n!=null){
			System.out.println(n.data);
			n=n.next;
		}
	}
	void revdisp(int x){
		Node n=head;
		while(n.next!=null){
			
			n=n.next;
		}
		System.out.print(n.data+" ");
			
			for(int i=1;i<x;i++){
				
				// System.out.print(n.data+" ");
				   n=head;
				for(int j=i+1;j<x;j++){
					n=n.next;
				}
				System.out.print(n.data+" ");
			}
	
	}
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
			Q2 ob=new Q2();
			int x=sc.nextInt();
			for(int i=0;i<x;i++){
				ob.append(sc.nextInt());
			}
			System.out.println();
		ob.revdisp(x);
		//ob.disp();
	}
}