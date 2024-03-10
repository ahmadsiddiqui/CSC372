import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class BankApp extends JFrame implements ActionListener{
	
	private JPanel panel = new JPanel(new GridBagLayout());
	private JLabel depositLabel;
	private JLabel withdrawalLabel;
	private JLabel balanceLabel;
	
	private JTextField depositField;
	private JTextField withdrawalField;
	private JTextField balanceField;
	
	private JButton processButton;
	private CheckingAccount ca = new CheckingAccount();
	
	BankApp(){
		
		//gridbag is used to layout the panel
		GridBagConstraints positionConst = null;
		setTitle("Deposit/Withdraw");
		
		//labels for the view
		withdrawalLabel = new JLabel("Withdrawal Amount:" );
		depositLabel = new JLabel("Deposit Amount:" );
		balanceLabel = new JLabel("Deposit Amount:" );
		
		//setting up the ui elements
		withdrawalField = new JTextField(5);
		withdrawalField.setEditable(true);
		withdrawalField.setText("0");
		
		depositField = new JTextField(5);
		depositField.setEditable(true);
		depositField.setText("0");
		
		balanceField = new JTextField(5);
		balanceField.setEditable(false);
		balanceField.setText("0");
		
		processButton = new JButton("Process");
		
		processButton.addActionListener(this);
	    positionConst = new GridBagConstraints();
	    

	    positionConst.gridx = 0;
	    positionConst.gridy = 0;
	    positionConst.insets = new Insets(10, 10, 10, 10);
	    panel.add(depositLabel, positionConst);

	    positionConst.gridx = 1;
	    positionConst.gridy = 0;
	    positionConst.insets = new Insets(10, 10, 10, 10);
	    panel.add(depositField, positionConst);

	    positionConst.gridx = 0;
	    positionConst.gridy = 1;
	    positionConst.insets = new Insets(10, 10, 10, 10);
	    panel.add(withdrawalLabel, positionConst);

	    positionConst.gridx = 1;
	    positionConst.gridy = 1;
	    positionConst.insets = new Insets(10, 10, 10, 10);
	    panel.add(withdrawalField, positionConst);

	    positionConst.gridx = 1;
	    positionConst.gridy = 2;
	    positionConst.insets = new Insets(10, 10, 10, 10);
	    panel.add(processButton, positionConst);

	    positionConst.gridx = 0;
	    positionConst.gridy = 3;
	    positionConst.insets = new Insets(10, 10, 10, 10);
	    panel.add(balanceLabel, positionConst);
	    
	    positionConst.gridx = 1;
	    positionConst.gridy = 3;
	    positionConst.insets = new Insets(10, 10, 10, 10);
	    panel.add(balanceField, positionConst);
	    
	    add(panel);
	
	}	
	
	void setBalanceField() {
		if(ca != null) {
			balanceField.setText(String.valueOf(ca.getBalance()));
		}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		Double withdrawalInput = Double.valueOf(withdrawalField.getText());
		Double depositInput = Double.valueOf(depositField.getText());
		ca.processWithdrawal(withdrawalInput);
		ca.processDeposit(depositInput);
		ca.displayAccount();
		
		setBalanceField();
	}
	
	public static void main(String args[]) {
		BankApp myFrame = new BankApp();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.pack();
		myFrame.setVisible(true);
		myFrame.setBalanceField();
	}
}
