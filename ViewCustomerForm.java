import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
class ViewCustomerForm extends JFrame{
	private JLabel lblTitle;
	
	private JTable tblCustomer;
	private DefaultTableModel dtm;
	
	private JButton btnReload;
	
	ViewCustomerForm(){
		setSize(400,300);
		setTitle("View Customer Form");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		lblTitle=new JLabel("View Customer Form");
		lblTitle.setFont(new Font("",1,30));
		lblTitle.setHorizontalAlignment(JLabel.CENTER);
		add("North",lblTitle);
		
		String[] columnName={"Custmer ID","Name","Address","Salary"};
		dtm=new DefaultTableModel(columnName,0); //0->row count
		tblCustomer=new JTable(dtm);
		JScrollPane tablePane=new JScrollPane(tblCustomer);
		add("Center",tablePane);
		
		Object[] rowData={"C001","Niroth","Panadura",5000};
		dtm.addRow(rowData);
		
		btnReload=new JButton("Reload");
		btnReload.setFont(new Font("",1,20));
		JPanel buttonPanel=new JPanel(); //default layout-->FlowLayout
		btnReload.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				dtm.setRowCount(0);
				for(int i=0; i<CustomerDBConnection.getCustomerCollection().toArray().length; i++){
					Customer []c1=CustomerDBConnection.getCustomerCollection().toArray();
					Object[] rowData={c1[i].id,c1[i].name,c1[i].adress,c1[i].salary};
					dtm.addRow(rowData); 
				}
			}
		});
		buttonPanel.add(btnReload);
		add("South",buttonPanel);
	}
}
