import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class CurrencyGUI implements ActionListener{
	private JFrame frame;
	private JButton getConvert;
	private JLabel inputLabel, outputLabel, setValueLabel, setDisplay;
	private JTextField inputValue, outputValue,setValue;
	private JComboBox getLang;

	CurrencyGUI()
	{
		String languageused[]= {"India","USA","France","Japan","China","UK","Germany"};
		
		frame=new JFrame("Currency Converter");
		
		setDisplay=new JLabel();
		setDisplay.setBounds(300, 100, 400, 50);
		setDisplay.setText("Currency Converter");
		setDisplay.setFont(new Font("Times New Roman", Font.BOLD, 36));
		setDisplay.setBackground(new Color(255,76,12));
		
		inputLabel=new JLabel("Enter Amount:");
		inputLabel.setBounds(200, 250, 200, 20);
		inputLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		inputValue=new JTextField();
		inputValue.setBounds(350, 250, 300, 30);
		
		getLang=new JComboBox(languageused);
		getLang.setBounds(200, 300, 200, 20);
		
		setValueLabel=new JLabel("Selected Currency:");
		setValueLabel.setBounds(450, 300, 150, 20);
		
		setValue=new JTextField();
		setValue.setBounds(600, 300, 100, 20);
		
		getConvert=new JButton("Convert");
		getConvert.setBounds(400, 500, 100, 20);
		
		outputLabel=new JLabel("Converted Currency:");
		outputLabel.setBounds(200, 550, 200, 30);
		outputLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		outputValue=new JTextField();
		outputValue.setBounds(400, 550, 200, 30);
		outputValue.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		
		frame.setSize(1000,1000);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.add(setDisplay);
		frame.add(inputLabel);
		frame.add(getConvert);
		frame.add(getLang);
		
		frame.add(outputLabel);
		frame.add(outputValue);

		frame.add(inputValue);
		frame.add(outputValue);
		frame.add(getConvert);
		frame.add(setValue);
		frame.add(setValueLabel);
		getConvert.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		
		CurrencyFormat cf= new CurrencyFormat();
		
		double num =Double.parseDouble(inputValue.getText());
		int getitem = getLang.getSelectedIndex();
		
		String setv=""+getLang.getItemAt(getLang.getSelectedIndex())+"";
		
		setValue.setText(setv);
		
		String out=CurrencyFormat.CurrencyFormatter(getitem, num);
		
		if(e.getSource()==getConvert)
		{
			outputValue.setText(out);
		}
	}
	public static void main(String [] args)
	{
		new CurrencyGUI();
	}
}
