package ds.sql;

public class LinkList {
	private Node head, tail;
	
	public void add(int data){
		if(head==null){
			head=new Node();
			head.setData(data);
		}else{
			if(tail==null){
				tail=new Node();
				tail.setData(data);
				head.setNext(tail);
			}else{
				Node temp=new Node();
				temp.setData(data);
				tail.setNext(temp);
				tail=temp;
			}
		}
	}
	
	/*public Node remove(int data){
		if(head.getData()==data){
			head=head.getNext();
		}else{
			
		}
	}*/

}
