package bus;

public class User extends Thread
{

	private int seatno;
	Bus b;
	
	public User(int seatno ,Bus b) {
		// TODO Auto-generated constructor stub
		this.seatno=seatno;
		this.b=b;
	}
	
	@Override
	public void run()
	{
		b.ticketBook(seatno);
	}
}
