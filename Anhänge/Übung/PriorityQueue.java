public class PriorityQueue<ContentType>{
 
  private PriorityNode head;
  private PriorityNode tail;
  
  private class PriorityNode{
    private ContentType content;
    private PriorityNode nextNode;
    private int priority;

    public PriorityNode(ContentType pContent, int priority){
      setContent(pContent);
      setPriority(priority);
    }

    public ContentType getContent(){
      return this.content;
    }

    public void setContent(ContentType pContent){
      this.content = pContent;
    }

    public PriorityNode getNextNode(){
      return this.nextNode;
    }

    public void setNextNode(PriorityNode pNode) {
      this.nextNode = pNode;
    }
    
    public void setPriority(int pPriority){
      this.priority = pPriority;
    }
    
    public int getPriority(){
      return priority;
    }
  }
  
  public PriorityQueue(){
    head = null;
    tail = null;
  } 


   public boolean isEmpty(){
    return (head == null);
   }

  
  public void enqueue(ContentType pContent, int pPriority){
    PriorityNode neu = new PriorityNode(pContent, pPriority);
    if (pContent != null) {
      if (isEmpty()) {        //leere PQueue wird erstellt
        head = neu;
        tail = neu;
      } else if (neu.getPriority() <= tail.getPriority()) {  //hinten einsortieren
          tail.setNextNode(neu);
          tail = neu;
        } else if (neu.getPriority() > head.getPriority()) {    //vorne einsortieren
            neu.setNextNode(head);
            head = neu;
          } else {          //zwischen head und tail einsortieren
            PriorityNode temp = head;
            while (temp.getNextNode().getPriority() >= neu.getPriority()) {  //findet Nachfolger von temp mit kleinerer priority als temp --> platz zum einsortieren
              temp = temp.getNextNode(); 
            }
            neu.setNextNode(temp.getNextNode());  //neu verweist auf vorherigen Nachfolger von temp
            temp.setNextNode(neu);                //temp Element zeigt auf neu
          }     
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
  
  public int priority(){
    if (head!=null) {
      return head.getPriority(); 
    } 
    return 0;
   }
} 
