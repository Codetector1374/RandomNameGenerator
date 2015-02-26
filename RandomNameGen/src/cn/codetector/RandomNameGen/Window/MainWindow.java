package cn.codetector.RandomNameGen.Window;

import javax.swing.JFrame;

import java.awt.GridBagLayout;

import javax.swing.JButton;

import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Insets;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;

import cn.codetector.RandomNameGen.Generator.RandomStringGenerator;

public class MainWindow extends JFrame{
	public MainWindow() {
	}
	public int selected = 0;
	public JTextField NameOutput;
	public JTextField LengthInput;
	public JLabel out;
	public boolean inited = false;
	private JRadioButton AutoCase;
	private JRadioButton UpperCase;
	private JRadioButton LowerCase;
	public void GenMainWindow() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JLabel lblNewLabel_1 = new JLabel("Length(int)");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.gridx = 3;
		gbc_lblNewLabel_1.gridy = 2;
		getContentPane().add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		LengthInput = new JTextField();
		LengthInput.setText(""+7);
		GridBagConstraints gbc_LengthInput = new GridBagConstraints();
		gbc_LengthInput.gridwidth = 6;
		gbc_LengthInput.insets = new Insets(0, 0, 5, 5);
		gbc_LengthInput.fill = GridBagConstraints.HORIZONTAL;
		gbc_LengthInput.gridx = 4;
		gbc_LengthInput.gridy = 2;
		getContentPane().add(LengthInput, gbc_LengthInput);
		LengthInput.setColumns(10);
		
		AutoCase = new JRadioButton("AutoCase");
		AutoCase.setSelected(true);
		AutoCase.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(((JRadioButton)e.getSource()).isSelected()){
					LowerCase.setSelected(false);
					UpperCase.setSelected(false);
					selected = 0;
				}
			}
		});
		GridBagConstraints gbc_AutoCase = new GridBagConstraints();
		gbc_AutoCase.insets = new Insets(0, 0, 5, 5);
		gbc_AutoCase.gridx = 10;
		gbc_AutoCase.gridy = 2;
		getContentPane().add(AutoCase, gbc_AutoCase);
		
		UpperCase = new JRadioButton("UpperCase");
		GridBagConstraints gbc_UpperCase = new GridBagConstraints();
		gbc_UpperCase.insets = new Insets(0, 0, 5, 5);
		gbc_UpperCase.gridx = 10;
		gbc_UpperCase.gridy = 3;
		UpperCase.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(((JRadioButton)e.getSource()).isSelected()){
					LowerCase.setSelected(false);
					AutoCase.setSelected(false);
					selected = 1;
				}
			}
		});
		getContentPane().add(UpperCase, gbc_UpperCase);
		
		JLabel lblNewLabel = new JLabel("Output:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 3;
		gbc_lblNewLabel.gridy = 4;
		getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		NameOutput = new JTextField();
		GridBagConstraints gbc_NameOutput = new GridBagConstraints();
		gbc_NameOutput.gridwidth = 6;
		gbc_NameOutput.insets = new Insets(0, 0, 5, 5);
		gbc_NameOutput.fill = GridBagConstraints.HORIZONTAL;
		gbc_NameOutput.gridx = 4;
		gbc_NameOutput.gridy = 4;
		getContentPane().add(NameOutput, gbc_NameOutput);
		NameOutput.setColumns(10);
		
		JButton btnNewButton = new JButton("Generate My Name!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					SetOut(RandomStringGenerator.GenerateRandomString(selected, Integer.parseInt(getLen())));
				}catch(NumberFormatException ex){
					JOptionPane.showMessageDialog(null, "Dude, Enter a Int not a String/Letter!!!!!");
				}
			}
		});
		
		LowerCase = new JRadioButton("LowerCase");
		LowerCase.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(((JRadioButton)e.getSource()).isSelected()){
					AutoCase.setSelected(false);
					UpperCase.setSelected(false);
					selected = 2;
				}
			}
		});
		GridBagConstraints gbc_LowerCase = new GridBagConstraints();
		gbc_LowerCase.insets = new Insets(0, 0, 5, 5);
		gbc_LowerCase.gridx = 10;
		gbc_LowerCase.gridy = 4;
		getContentPane().add(LowerCase, gbc_LowerCase);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.gridwidth = 8;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 3;
		gbc_btnNewButton.gridy = 6;
		getContentPane().add(btnNewButton, gbc_btnNewButton);
		
		out = new JLabel("NoText");
		out.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_out = new GridBagConstraints();
		gbc_out.gridwidth = 12;
		gbc_out.insets = new Insets(0, 0, 5, 5);
		gbc_out.gridx = 1;
		gbc_out.gridy = 7;
		getContentPane().add(out, gbc_out);
		this.inited = true;
	}
	public void CreateWindow(){
		if(this.inited) return;
		this.setTitle("Codetector's Name Gen");
		this.setVisible(true);
		this.GenMainWindow();
	}
	public void SetOut(String out){
		if(!this.inited) return;
		this.NameOutput.setText(out);
	}
	public String getLen(){
		if(!this.inited) return null;
		return this.LengthInput.getText();
	}
	public void SetConsle(String a){
		if(!this.inited) return;
		this.out.setText(a);
	}
	
}
