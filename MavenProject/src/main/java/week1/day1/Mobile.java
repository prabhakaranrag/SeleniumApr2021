package week1.day1;

public class Mobile {

	public void makeCall() {
		System.out.println("Make Call");
	}

	private void sendMsg() {
		System.out.println("Send Message");
	}

	public static void main(String[] args) {
		Mobile myMobile = new Mobile();
		myMobile.makeCall();
		myMobile.sendMsg();
	}
}
