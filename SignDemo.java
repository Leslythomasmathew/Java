package Module;
import java.awt.FlowLayout;
import java.awt.GridLayout;


import javax.swing.*;



public class SignDemo {
	public static void main(String [] args){
		
		JFrame mainFrame = new JFrame();
		mainFrame.setTitle("SignUp form");
	
		
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(6,2,10,10));
		
		
		JLabel nameLabel = new JLabel("Name");
		JTextField nameField = new JTextField();
		
		
		JLabel emailLabel= new JLabel("Email");
		JTextField emailField = new JTextField();
		
	
		
		
		
		JLabel GenderLabel=new JLabel("Gender");
		JRadioButton male=new JRadioButton("Male");
		JRadioButton female=new JRadioButton("Female");
		ButtonGroup genButtonGroup = new ButtonGroup();
		
		
		genButtonGroup.add(male);
		genButtonGroup.add(female);
		
		
		JPanel genderPanel=new JPanel();
		genderPanel.setLayout(new FlowLayout());
		
		JLabel countryLabel=new JLabel("Country");
		String [] countries= {"India","USA","Australia"};
		JComboBox<String> countryBox= new JComboBox<>(countries);
		
		
		JLabel addressJLabel= new JLabel ("Address");
		JTextArea addressArea = new JTextArea(3,4);
		
		
		JButton submitBtn= new JButton("Submit");
		mainPanel.add(nameLabel);
		mainPanel.add(emailLabel);
		mainPanel.add(genderPanel);
		mainPanel.add(genderPanel);
		mainPanel.add(countryLabel);
		mainPanel.add(countryBox);
		mainPanel.add(addressJLabel);
		mainPanel.add(addressArea);
		mainPanel.add(new JLabel(""));
		mainPanel.add(submitBtn);
		
		
		mainFrame.add(mainPanel);
		mainFrame.add(submitBtn);
		
		
		
		
		
		
	}

}
