import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MainCustomerForm extends JFrame{
	private JButton btnAddCustomer;
	private JButton btnViewCustomer;
	private JButton btnUpdateCustomer;
	private JButton btnDeleteCustomer;
	private JButton btnSearchCustomer;
	private JButton btnExit;
	public  CustomerCollection customer=new CustomerCollection();
	private JLabel lblTitle;
	
	MainCustomerForm(){
		
		setSize(400,300);
		setTitle("Main Customer Form");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		lblTitle=new JLabel("Main Customer Form");
		lblTitle.setFont(new Font("",1,30));
		lblTitle.setHorizontalAlignment(JLabel.CENTER);
		add("North",lblTitle);
		
		JPanel buttonPanel=new JPanel(new GridLayout(5,1));
		btnAddCustomer=new JButton("Add Customer");
		btnAddCustomer.setFont(new Font("",1,20));
		btnAddCustomer.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				new AddCustomerForm().setVisible(true);
			}
		});
		buttonPanel.add(btnAddCustomer);
		
		btnViewCustomer=new JButton("View Customer");
		btnViewCustomer.setFont(new Font("",1,20));
		btnViewCustomer.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				new ViewCustomerForm().setVisible(true);
			}
		});
		buttonPanel.add(btnViewCustomer);
		
		btnDeleteCustomer=new JButton("Delete Customer");
		btnDeleteCustomer.setFont(new Font("",1,20));
		btnDeleteCustomer.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				new DeleteCustomerForm().setVisible(true);
			}
		});
		buttonPanel.add(btnDeleteCustomer);
		
		btnSearchCustomer=new JButton("Search Customer");
		btnSearchCustomer.setFont(new Font("",1,20));
		btnSearchCustomer.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				new SearchCustomerForm().setVisible(true);
			}
		});
		buttonPanel.add(btnSearchCustomer);
		
		btnUpdateCustomer=new JButton("Update Customer");
		btnUpdateCustomer.setFont(new Font("",1,20));
		btnUpdateCustomer.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				new UpdateCustomerForm().setVisible(true);
			}
		});
		buttonPanel.add(btnUpdateCustomer);
		
		add("Center",buttonPanel);
	}
	public static void main(String args[]){	
		new MainCustomerForm().setVisible(true);
	}	
}

