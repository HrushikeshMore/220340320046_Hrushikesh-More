class Q3{
	int s1[]=new int [100];
	int top1,top2;
	Q3(){
		top1=-1;
		top2=100;
	}
	boolean isEmpty(){
		return(top1==-1&&top2==100);
	}
	boolean isFull(){
		if(top2==top1+1){
			return true;
		}
		return false;
	}
	 void push1(int x){
		if(isFull()){
			return;
		}
		s1[++top1]=x;
	}
	 void push2(int x){
		if(isFull()){
			return;
		}
		s1[--top2]=x;
	}
	 int pop1(){
		if(isEmpty()){
			return 0;
		}
		int z=s1[top1--];
		return z;
	}
	 int pop2(){
		if(isEmpty()){
			return 0;
		}
		int z=s1[top2++];
		return z;
	}
	public static void main(String[] args){
		Q3 ob=new Q3();
		ob.push1(5);
		ob.push1(50);
		ob.push1(70);
		ob.push2(100);
		ob.push2(200);
		ob.push2(300);
		ob.push2(400);
		int n=ob.pop1();
		System.out.println("Popped element from stack1 is "+n);
		int n1=ob.pop2();
		System.out.println("Popped element from stack2 is "+n1);
	}
}