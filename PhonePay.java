class PhonePay{
	public static void payment(long phoneno){
		System.out.println("Mobile recharge done successfully");
	}
	public static void payment(String DTH){
		System.out.println("Your "+DTH+" recharge is successful");
	}
	public static void payment(int meterId,String name,int amount){
		System.out.println("Paid electricity bill of "+meterId+" rupees "+amount+" of "+name);
	}
	public static void payment(int creditcardno,int amt){
		System.out.println("Credit card bill paid successfully");                                     
	}
	public static void main(String args[]){
		PhonePay.payment(9967540982l);
		PhonePay.payment("Airtel3002174178");
		PhonePay.payment(998102,"Suresh",3000);
		PhonePay.payment(905,3000);
	}
}
		
