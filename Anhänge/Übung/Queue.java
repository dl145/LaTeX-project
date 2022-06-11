public class Queue<ContentType> {
  private Node head;
  private Node tail;

  private class Node{
    private ContentType content;
    private Node nextNode;
    

    public Node(ContentType pContent){
      setContent(pContent);
    }

    public ContentType getContent(){
      return this.content;
    }

    public void setContent(ContentType pContent){
      this.content = pContent;
    }

    public Node getNextNode(){
      return this.nextNode;
    }

    public void setNextNode(Node pNode) {
      this.nextNode = pNode;
    }
  }
  

   public Queue(){
    head = null;
    tail = null;
  }


   public boolean isEmpty(){
    return (head == null);
   }


  public void enqueue(ContentType pContent){
    Node neu = new Node(pContent);
    if (isEmpty()) {
      head = neu;
      tail = neu;      
    } else {
      tail.setNextNode(neu);
      tail = neu;  
    }
  }
  
  public void dequeue(){
    if (!isEmpty()) head = head.getNextNode();
  }
  
   public ContentType front(){
     if (head!=null) {
      return head.getContent(); 
    } 
    return null; 
  }
}
