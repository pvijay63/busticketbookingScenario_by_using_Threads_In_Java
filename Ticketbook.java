package bus;

public class Ticketbook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Bus b1=new Bus();
       User u1=new User(4, b1);
       User u2=new User(8,b1);
       User u3=new User(4, b1);
       u1.start();
       u2.start();
       u3.start();
       System.out.println("Thread count is "+Thread.activeCount());
	}

}
