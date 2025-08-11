package bus;

import java.util.ArrayList;

public class Bus

{
	
	private ArrayList<Integer> a=new ArrayList<Integer>();
	public  void ticketBook(int seatno) 
	{
		 try {
			Thread.sleep(2000);
			 if(a.contains(seatno))
			 {
					System.out.println(" Sorry! this   "+seatno +" seat is already booked ");
			        System.out.println("------------------------------------------------------");
			 }
		           else
		            {
					a.add(seatno);
					System.out.println(" Your seat  is booked  ");
					System.out.println("-----------------------------------");
		            }
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Handled");
		}
         
		} 
			
		
	}


