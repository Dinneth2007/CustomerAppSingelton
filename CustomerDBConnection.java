//Singelton Design Pattern
class CustomerDBConnection{
	private  static CustomerCollection customerCollection;//Instance Variable
	private  static CustomerDBConnection customerDBConnection;
	private CustomerDBConnection(){
		getCustomerCollection();
		}
	public  static CustomerCollection getCustomerCollection(){
		if(customerCollection==null){
			customerCollection=new CustomerCollection();
			}
	
		return customerCollection;
		
	}
	public static CustomerDBConnection getInstance(){
		if(customerDBConnection==null){
			customerDBConnection=new CustomerDBConnection();
			}
			return customerDBConnection;
		}
}
