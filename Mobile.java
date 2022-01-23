package week1.day1;

public class Mobile 
{
	int Number =1232456;
	short screenCount=2;
	long imeiNumber=97815662654L;
	float screenLenght= 7.2F;
	char chargerType='C';
	String mobileName= "Apple";
	
	public void sendMsg ()
	{
		System.out.println("Special Message :" + "Good morning");
	}
	private int makeCall()
	{
		int numberOfCalls =2;
		return (numberOfCalls);
	}
	void saveContact(String mobileName)
	{
		System.out.println(mobileName);
	}

	public static void main(String[] args) {
				
		Mobile o = new Mobile();
		o.sendMsg();
		int V = o.makeCall();
		System.out.println("Number of missed calls :" + V);
		System.out.println("Mobile Model Name :"  + o.mobileName);
			}
}