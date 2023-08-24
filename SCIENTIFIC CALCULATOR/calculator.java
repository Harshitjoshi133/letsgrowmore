import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculator {

	private JFrame frame;
	private JTextField textField;
	double first;
	double second;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 376, 596);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Scientific Calculator");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 30));
		lblNewLabel.setBounds(0, 11, 352, 30);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(10, 50, 330, 62);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnroot = new JButton("\u221A");
		btnroot.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
		btnroot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				double a=Math.sqrt(first);
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnroot.setBounds(10, 130,  55, 55);
		frame.getContentPane().add(btnroot);
		
		JButton btninverse = new JButton("1/x");
		btninverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				double a=1/first;
				textField.setText("");
				textField.setText(textField.getText()+a);

			}
		});
		btninverse.setFont(new Font("SansSerif", Font.BOLD, 12));
		btninverse.setBounds(10, 190,  55, 55);
		frame.getContentPane().add(btninverse);
		
		JButton btnfact = new JButton("n!");
		btnfact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				double a=first;
				double fact=1;
				while(a!=0) {
					fact=fact*a;
					a--;
				}

				textField.setText("");
				textField.setText(textField.getText()+fact);
				
			}
		});
		btnfact.setHorizontalAlignment(SwingConstants.RIGHT);
		btnfact.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
		btnfact.setBounds(10, 250,  55, 55);
		frame.getContentPane().add(btnfact);
		
		JButton btnpow = new JButton("X^Y");
		btnpow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				operation="^Y";
				textField.setText("");
			}
		});
		btnpow.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 10));
		btnpow.setBounds(10, 310,  55, 55);
		frame.getContentPane().add(btnpow);
		
		JButton btncube = new JButton("X^3");
		btncube.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				double a=Math.pow(first,3);
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btncube.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 10));
		btncube.setBounds(10, 370,  55, 55);
		frame.getContentPane().add(btncube);
		
		JButton btnsign = new JButton("+/-");
		btnsign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(String.valueOf(textField.getText()));
				double a=first*(-1);
				textField.setText("");
				textField.setText((String.valueOf(a)));
			}
			
		}); 
		btnsign.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 15));
		btnsign.setBounds(10, 490,  55, 55);
		frame.getContentPane().add(btnsign);
		
		JButton btnsquare = new JButton("X^2");
		btnsquare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				double a=Math.pow(first,2);
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnsquare.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 10));
		btnsquare.setBounds(10, 430,  55, 55);
		frame.getContentPane().add(btnsquare);
		
		JButton btnexponential = new JButton("e^x");
		btnexponential.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				double a=Math.exp(first);
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnexponential.setFont(new Font("SansSerif", Font.BOLD, 10));
		btnexponential.setBounds(75, 133,  55, 55);
		frame.getContentPane().add(btnexponential);
		
		JButton btnlog = new JButton("log");
		btnlog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				double a=Math.log(first);
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnlog.setFont(new Font("Century Schoolbook", Font.BOLD, 10));
		btnlog.setBounds(75, 191,  55, 55);
		frame.getContentPane().add(btnlog);
		
		JButton btnpercent = new JButton("%");
		btnpercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnpercent.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
		btnpercent.setBounds(70, 250,  55, 55);
		frame.getContentPane().add(btnpercent);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
		btn7.setBounds(75, 310,  55, 55);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
		btn4.setBounds(75, 370,  55, 55);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
		btn1.setBounds(75, 430,  55, 55);
		frame.getContentPane().add(btn1);
		
		JButton btnsin = new JButton("sin");
		btnsin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				double a=Math.sin(first);
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnsin.setFont(new Font("Dialog", Font.BOLD, 10));
		btnsin.setBounds(140, 133,  55, 55);
		frame.getContentPane().add(btnsin);
		
		JButton btnsinh = new JButton("sinh");
		btnsinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				double a=Math.sinh(first);
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnsinh.setFont(new Font("Dialog", Font.BOLD, 10));
		btnsinh.setBounds(140, 192,  55, 55);
		frame.getContentPane().add(btnsinh);
		
		JButton btnCancel = new JButton("C");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnCancel.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
		btnCancel.setBounds(140, 250,  55, 55);
		frame.getContentPane().add(btnCancel);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
		btn8.setBounds(140, 310,  55, 55);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
		btn5.setBounds(140, 367,  55, 55);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
		btn2.setBounds(140, 430,  55, 55);
		frame.getContentPane().add(btn2);
		
		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setBounds(75, 490, 120, 55);
		frame.getContentPane().add(btn0);
		
		JButton btncos = new JButton("cos");
		btncos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				double a=Math.cos(first);
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btncos.setFont(new Font("Dialog", Font.BOLD, 10));
		btncos.setBounds(205, 133,  55, 55);
		frame.getContentPane().add(btncos);
		
		JButton btncosh = new JButton("cosh");
		btncosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				double a=Math.cosh(first);
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btncosh.setFont(new Font("Dialog", Font.BOLD, 10));
		btncosh.setBounds(205, 192,  55, 55);
		frame.getContentPane().add(btncosh);
		
		JButton btnbaclspace = new JButton("del");
		btnbaclspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String BackSpace=null;
				int len=textField.getText().length();
				 	if(len>0) {
				 		StringBuilder strb=new StringBuilder(textField.getText());
				 		strb.deleteCharAt(len-1);
				 		BackSpace=strb.toString();
				 		textField.setText(BackSpace);	 	
				 	}
			}
		});
		btnbaclspace.setFont(new Font("Century Schoolbook", Font.BOLD, 11));
		btnbaclspace.setBounds(205, 250,  55, 55);
		frame.getContentPane().add(btnbaclspace);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
		btn9.setBounds(205, 310,  55, 55);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
		btn6.setBounds(205, 367,  55, 55);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn3.getText();
                textField.setText(number);
			}
		});
		btn3.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
		btn3.setBounds(205, 427,  55, 55);
		frame.getContentPane().add(btn3);
		
		JButton btndot = new JButton(".");
		btndot.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
		btndot.setBounds(205, 490,  55, 55);
		frame.getContentPane().add(btndot);
		
		JButton btntan = new JButton("tan");
		btntan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				double a=Math.tan(first);
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btntan.setFont(new Font("Dialog", Font.BOLD, 10));
		btntan.setBounds(270, 133,  55, 55);
		frame.getContentPane().add(btntan);
		
		JButton btntanh = new JButton("tanh");
		btntanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				double a=Math.cos(first);
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btntanh.setFont(new Font("Dialog", Font.BOLD, 10));
		btntanh.setBounds(270, 192,  55, 55);
		frame.getContentPane().add(btntanh);
		
		JButton btnadd = new JButton("+");
		btnadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
				
			}
		});
		btnadd.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
		btnadd.setBounds(270, 250,  55, 55);
		frame.getContentPane().add(btnadd);
		
		JButton btnminus = new JButton("-");
		btnminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnminus.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
		btnminus.setBounds(270, 307,  55, 55);
		frame.getContentPane().add(btnminus);
		
		JButton btnproduct = new JButton("*");
		btnproduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnproduct.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
		btnproduct.setBounds(270, 367,  55, 55);
		frame.getContentPane().add(btnproduct);
		
		JButton btndivide = new JButton("/");
		btndivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btndivide.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
		btndivide.setBounds(270, 427,  55, 55);
		frame.getContentPane().add(btndivide);
		
		JButton btneequal = new JButton("=");
		btneequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second=Double.parseDouble(textField.getText());
				if(operation=="+") {
					result=first+second;
					answer=String.format("% .2f", result);
					textField.setText(answer);
				}
				else if(operation=="-") {
					result=first-second;
					answer=String.format("% .2f", result);
					textField.setText(answer);
				}
				else if(operation=="*") {
					if(second==0) {
						textField.setText("Infinity");
					}
					else {
					result=first*second;
					answer=String.format("% .2f", result);
					textField.setText(answer);
					}
				}
				else if(operation=="/") {
					result=first/second;
					answer=String.format("% .2f", result);
					textField.setText(answer);
				}
				else if(operation=="%") {
					result=first%second;
					answer=String.format("% .2f", result);
					textField.setText(answer);
				}
				else if(operation=="^Y") {
					result=Math.pow(first, second);
					answer=String.format("% .2f", result);
					textField.setText(answer);
				}
				
				
			}
		});
		btneequal.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
		btneequal.setBounds(270, 490,  55, 55);
		frame.getContentPane().add(btneequal);
	}
}
