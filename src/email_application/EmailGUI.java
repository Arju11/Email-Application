package email_application;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class EmailGUI extends JFrame{
	private int dep;
	private String fname, lname;
	public void gui() {
		
		setTitle("Email Application");
		setSize(700,500);
		setLocationRelativeTo(null);
		GridBagLayout layout = new GridBagLayout();
		setLayout (layout);
		GridBagConstraints gbc = new GridBagConstraints();
		
		JPanel namePanel = new JPanel(new GridLayout(3,2));;
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		namePanel.add(new JLabel("First Name"));
		namePanel.add(t1);
		namePanel.add(new JLabel("Last Name"));
		namePanel.add(t2);
		gbc.fill = GridBagConstraints.VERTICAL;
	    gbc.gridx = 0;
	    gbc.gridy = 0;
		add(namePanel, gbc);
		
		JPanel radioPanel = new JPanel(new GridLayout());
		JRadioButton sales = new JRadioButton("Sales");
		JRadioButton dev = new JRadioButton("Development");
		JRadioButton acc = new JRadioButton("Accounting");
		JRadioButton none = new JRadioButton("None");
		radioPanel.add(new JLabel("Department"));
		radioPanel.add(sales);
		radioPanel.add(dev);
		radioPanel.add(acc);
		radioPanel.add(none);
		gbc.fill = GridBagConstraints.VERTICAL;
	    gbc.gridx = 0;
	    gbc.gridy = 1;
		add(radioPanel, gbc);
		ButtonGroup grp = new ButtonGroup();
		grp.add(sales);
		grp.add(dev);
		grp.add(acc);
		grp.add(none);
		sales.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dep =1;
			}
		});
		dev.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dep=2;
				
			}
		});
		acc.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dep=3;
				
			}
		});
		none.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dep=4;
				
			}
		});
		
		JButton ok = new JButton("Ok");
		gbc.fill = GridBagConstraints.VERTICAL;
	    gbc.gridx = 0;
	    gbc.gridy = 2;
		add(ok, gbc);
		setVisible(true);
		ok.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				fname = t1.getText(); 
				lname = t2.getText();
				Email usr = new Email(fname, lname, dep);
				String email,password,department;
				email = usr.getmail();
				password = usr.getpassword();
				department = usr.getdepartment();
				gbc.fill = GridBagConstraints.VERTICAL;
			    gbc.gridx = 0;
			    gbc.gridy = 3;
				add(new JLabel("Name : "+fname+" "+lname),gbc);
				gbc.fill = GridBagConstraints.VERTICAL;
			    gbc.gridx = 0;
			    gbc.gridy = 4;
				add(new JLabel("Department : "+department),gbc);
				gbc.fill = GridBagConstraints.VERTICAL;
			    gbc.gridx = 0;
			    gbc.gridy = 5;
				add(new JLabel("Email : "+email),gbc);
				gbc.fill = GridBagConstraints.VERTICAL;
			    gbc.gridx = 0;
			    gbc.gridy = 6;
				add(new JLabel("Password : "+password),gbc);
				setVisible(true);
			}
		});	
	}
}
