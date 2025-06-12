import java.util.ArrayList;
public class QueueUsingArrayList<T>{
    private ArrayList<T> queueList;
    public QueueUsingArrayList(){
        queueList=new ArrayList<>();
    }
    public void offer(T element){
        queueList.add(element);
    }
    public T poll(){
        if (isEmpty()){
            return null;
        }
        return queueList.remove(0);
    }
    public T peek(){
        if(isEmpty()){
            return null;
        }
        return queueList.get(0);
    }
    public boolean isEmpty(){
        return queueList.isEmpty();
    }
    public int size(){
        return queueList.size();
    }
    public static void main(String[] args){
        QueueUsingArrayList<Integer> queue=new QueueUsingArrayList<>();
        System.out.println(queue.poll());
        queue.offer(10);
        queue.offer(20);
        System.out.println("Front element:"+queue.peek());
        System.out.println("polled element:"+queue.poll());
        System.out.println("polled element:"+queue.poll());
    }
}