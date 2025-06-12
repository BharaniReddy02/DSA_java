import java.util.Scanner;
import java.util.ArrayList;
public class QueueProject<T>{
    private ArrayList<T> queueList;
    public QueueProject(){
        queueList=new ArrayList<>();
    }
    public void offer(T element){
        queueList.add(element);
    }
    public T poll(){
        if(isEmpty()){
            return null;
        }
        return queueList.remove(0);
    }
    public boolean isEmpty(){
        return queueList.isEmpty();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        QueueProject<String> queue=new QueueProject<>();
        while(true){
            System.out.println("Enter choice:1 for offer, 2 for poll,3 for exit");
        int ch=sc.nextInt();
        sc.nextLine();
        switch(ch){
            case 1:
            System.out.println("enter item to add the schedule");
            String item=sc.nextLine();
            queue.offer(item);
            System.out.println(item+"added to the queue.");
            break;
            case 2:
            String removed = queue.poll();
            if (removed!=null){
                System.out.println(removed+"deleted from the schedule.");
            }else{
                System.out.println("Queue is empty,nothing to remove.");
            }
            break;
            case 3:
            System.out.println("exit..");
            sc.close();
            return;
            default:
            System.out.println("Invalid choice");
        }
        }
    }
}