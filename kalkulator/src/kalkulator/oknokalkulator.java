package kalkulator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class oknokalkulator extends JFrame implements KeyListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	
	JButton btnComa;
	JButton btnC;
	JButton btnDivide;
	JButton btnMultiply;
	JButton btn0;
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JButton btn4;
	JButton btn5;
	JButton btn6;
	JButton btn7;
	JButton btn8;
	JButton btn9;
	JButton btnEquals;
	JButton btnPlus;
	JButton btnMinus;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					oknokalkulator frame = new oknokalkulator();
					frame.setVisible(true);
					frame.setFocusable(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public oknokalkulator()  {
		setResizable(false);
		addKeyListener(this);
		
		Kalkulator k = new Kalkulator();
		setTitle("Kalkulator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 237, 282);
		contentPane = new JPanel();
		contentPane.setBorder(new CompoundBorder());
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btn1 = new JButton("1");
		btn1.setBounds(10, 152, 47, 44);
		btn1.addActionListener(e->{
			textField.setText(textField.getText()+"1");
		});
	
		contentPane.add(btn1);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"2");
			}
		});
		btn2.setBounds(62, 152, 47, 44);
		contentPane.add(btn2);
		
		btn3 = new JButton("3");
		btn3.setBounds(113, 152, 47, 44);
		btn3.addActionListener(e->{
			textField.setText(textField.getText()+"3");
		});
		contentPane.add(btn3);
		
		btn4 = new JButton("4");
		btn4.setBounds(10, 105, 47, 44);
		btn4.addActionListener(e->{
			textField.setText(textField.getText()+"4");
		});
		contentPane.add(btn4);
		
		btn5 = new JButton("5");
		btn5.setBounds(62, 105, 47, 44);
		btn5.addActionListener(e->{
			textField.setText(textField.getText()+"5");
		});
		contentPane.add(btn5);
		
		btn6 = new JButton("6");
		btn6.setBounds(113, 105, 47, 44);
		btn6.addActionListener(e->{
			textField.setText(textField.getText()+"6");
		});
		contentPane.add(btn6);
		
		btn7 = new JButton("7");
		btn7.setBounds(10, 58, 47, 44);
		btn7.addActionListener(e->{
			textField.setText(textField.getText()+"7");
		});
		contentPane.add(btn7);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"8");
			}
		});
		btn8.setBounds(62, 58, 47, 44);
		contentPane.add(btn8);
		
		btn9 = new JButton("9");
		btn9.setBounds(113, 58, 47, 44);
		btn9.addActionListener(e->{
			textField.setText(textField.getText()+"9");
		});
		contentPane.add(btn9);
		
		btnEquals = new JButton("=");
		btnEquals.setBounds(113, 197, 47, 44);
		btnEquals.addActionListener(e->{
			textField.setText(k.equals(Double.parseDouble(textField.getText())));
		});
		contentPane.add(btnEquals);
		
		btnPlus = new JButton("+");
		btnPlus.setBounds(166, 105, 47, 44);
		btnPlus.addActionListener(e->{
			k.dodaj(Double.parseDouble(textField.getText()));
			textField.setText("");
		});
		contentPane.add(btnPlus);
		
		btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				k.odejmij(Double.parseDouble(textField.getText()));
					
				textField.setText("");
			}
		});
		btnMinus.setBounds(166, 58, 47, 44);
		contentPane.add(btnMinus);
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"0");
			}
		});
		btn0.setBounds(62, 197, 47, 44);
		contentPane.add(btn0);
		
		btnMultiply = new JButton("*");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				k.pomnoz(Double.parseDouble(textField.getText()));
				textField.setText("");
			}
		});
		btnMultiply.setBounds(166, 152, 47, 44);
		contentPane.add(btnMultiply);
		
		btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				k.podziel(Double.parseDouble(textField.getText()));
				textField.setText("");
			}
		});
		btnDivide.setBounds(166, 197, 47, 44);
		contentPane.add(btnDivide);
		
		btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				k.zeruj();
			}
		});
		btnC.setBounds(166, 11, 47, 44);
		contentPane.add(btnC);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(11, 11, 149, 44);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnComa = new JButton(".");
		btnComa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+".");
			}
		});
		btnComa.setFocusable(true);
		
		


    

		btnComa.setBounds(10, 197, 47, 44);
		contentPane.add(btnComa);
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.isShiftDown()==true) {
			if(e.getKeyCode()==KeyEvent.VK_8) btnMultiply.doClick(); // NIE DZIALA
			else if(e.getKeyCode()==KeyEvent.VK_EQUALS) btnPlus.doClick(); // nie dziala
		}
		
		if(e.isShiftDown()==false) {
			if(e.getKeyCode()==KeyEvent.VK_PERIOD) btnComa.doClick();
			else if(e.getKeyCode()==KeyEvent.VK_DELETE || e.getKeyCode()==KeyEvent.VK_BACK_SPACE) btnC.doClick();
			else if(e.getKeyCode()==KeyEvent.VK_SLASH) btnDivide.doClick(); 
			
			else if(e.getKeyCode()==KeyEvent.VK_0) btn0.doClick();
			else if(e.getKeyCode()==KeyEvent.VK_1) btn1.doClick();
			else if(e.getKeyCode()==KeyEvent.VK_2) btn2.doClick();
			else if(e.getKeyCode()==KeyEvent.VK_3) btn3.doClick();
			else if(e.getKeyCode()==KeyEvent.VK_4) btn4.doClick();
			else if(e.getKeyCode()==KeyEvent.VK_5) btn5.doClick();
			else if(e.getKeyCode()==KeyEvent.VK_6) btn6.doClick();
			else if(e.getKeyCode()==KeyEvent.VK_7) btn7.doClick();
			else if(e.getKeyCode()==KeyEvent.VK_8) btn8.doClick();
			else if(e.getKeyCode()==KeyEvent.VK_9) btn9.doClick();
			else if(e.getKeyCode()==KeyEvent.VK_EQUALS||e.getKeyCode()==KeyEvent.VK_ENTER ) btnEquals.doClick();
			
			else if(e.getKeyCode()==KeyEvent.VK_MINUS) btnMinus.doClick();
			
		}
	
		
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
