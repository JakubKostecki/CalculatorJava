import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Kalkulator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        
        class G
        {
        	static char operator = 'a';
        	static int numberA = 0;
        	static int numberB = 0;
        	static boolean wasOperator = Boolean.FALSE;
        	static boolean wasDigit = Boolean.TRUE;
        	static boolean wasEqual = Boolean.FALSE;
        	static boolean wasClear = Boolean.FALSE;
        }
        
        

        JPanel panel = new JPanel();

        JTextField textField = new JTextField(10);
        textField.setBackground(Color.WHITE);
        textField.setForeground(Color.BLACK);
        textField.setFont(new Font("Arial", Font.BOLD, 20));
        textField.setEditable(false);
        textField.setHorizontalAlignment(JTextField.RIGHT);
        panel.add(textField);
        textField.setText("0");
        
    	ActionListener myActionListener = new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			String t = e.getActionCommand();
    			char x = t.charAt(0);
    			if(Character.isDigit(x))
    			{    	
    				if(G.wasEqual) 
    				{
    					G.operator = 'a';
    				}
    				if(G.wasDigit)
    				{	
    					G.wasOperator = Boolean.FALSE;
    					G.wasEqual = Boolean.FALSE;
    					int pom = Integer.parseInt(textField.getText());
    					String a = textField.getText();
    					if(pom != 0) 
    					{
	    					textField.setText((a + e.getActionCommand()));
    					}
    					else 
    					{
    						textField.setText((e.getActionCommand()));
    					}
    				}
    				
    				if(G.wasOperator)
    				{
    					textField.setText((e.getActionCommand()));
    				}
    				
    				if(G.wasEqual) 
    				{
    					textField.setText((e.getActionCommand()));
        				G.numberA = 0;
        				textField.setText((e.getActionCommand()));
    				}
    				
    				G.wasDigit = Boolean.TRUE;
    			}
    			if(x == 'C')
    			{
                    textField.setForeground(Color.BLACK);
    				textField.setText("0");
    				G.operator = 'a';
    				G.numberA = 0;
    				G.numberB = 0;
    				G.wasClear= Boolean.FALSE;
    				G.wasDigit = Boolean.TRUE;
    				G.wasOperator = Boolean.FALSE;
    				G.wasEqual = Boolean.FALSE;
    			}
    			if(x == '+') 
    			{    				
    				if(G.wasDigit) 
    				{
    					int b = Integer.parseInt(textField.getText());
    					int a = G.numberA;

    					int result;
    					if(G.operator != x) {
    						if(G.operator == '+') 
    						{
    							result = a+b;
    						}
    						else if(G.operator == '-') 
    						{
    							result = a-b;
    						}
    						else if(G.operator == '*') 
    						{
    							result = a*b;
    						}
    						else if(G.operator == '/') 
    						{
    							result = a/b;
    						}
    						else 
    						{
    							result = b;
    						}
    					}
    					else {
    						result = a+b;
    					}
    					
	    				textField.setText(Integer.toString(result));
	    				G.numberA = result;
    					G.operator = '+';
    				}
    				if(G.wasOperator) 
    				{
    					G.operator = '+';
    				}
    				if(G.wasEqual)
    				{
    					G.numberA = Integer.parseInt(textField.getText());
    					G.operator = '+';
    				}	
    				G.wasClear= Boolean.FALSE;
    				G.wasDigit = Boolean.FALSE;
    				G.wasOperator = Boolean.TRUE;
    				G.wasEqual = Boolean.FALSE;
    			}
    			if(x == '-') 
    			{
    				if(G.wasDigit) 
    				{
    					G.numberB = Integer.parseInt(textField.getText());
    					int a = G.numberA;
    					int b = G.numberB;
    					int result;
    					
						if(G.operator == '+') 
						{
							result = a+b;
						}
						else if(G.operator == '-') 
						{
							result = a-b;
						}
						else if(G.operator == '*') 
						{
							result = a*b;
						}
						else if(G.operator == '/') 
						{
							result = a/b;
						}
						else 
						{
							result = b;
						}
					
	    				textField.setText(Integer.toString(result));
	    				G.numberA = result;
    					
    					G.operator = '-';
    				}
    				if(G.wasOperator) 
    				{
    					G.operator = '-';
    				}
    				if(G.wasEqual)
    				{
    					G.numberA = Integer.parseInt(textField.getText());
    					G.operator = '-';
    				}
    				G.wasClear= Boolean.FALSE;
    				G.wasDigit = Boolean.FALSE;
    				G.wasOperator = Boolean.TRUE;
    				G.wasEqual = Boolean.FALSE;
    			}
    			if(x == '*') 
    			{
    				if(G.wasDigit) 
    				{
    					G.numberB = Integer.parseInt(textField.getText());
    					int a = G.numberA;
    					int b = G.numberB;
    					int result;
    					
						if(G.operator == '+') 
						{
							result = a+b;
						}
						else if(G.operator == '-') 
						{
							result = a-b;
						}
						else if(G.operator == '*') 
						{
							result = a*b;
						}
						else if(G.operator == '/') 
						{
							result = a/b;
						}
						else 
						{
							result = b;
						}
					
	    				textField.setText(Integer.toString(result));
	    				G.numberA = result;
    					G.operator = '*';
    				}
    				if(G.wasOperator) 
    				{
    					G.operator = '*';
    				}
    				if(G.wasEqual)
    				{
    					G.numberA = Integer.parseInt(textField.getText());
    					G.operator = '*';
    				}
    				G.wasClear= Boolean.FALSE;
    				G.wasDigit = Boolean.FALSE;
    				G.wasOperator = Boolean.TRUE;
    				G.wasEqual = Boolean.FALSE;
    			}
    			if(x == '/') 
    			{
    				if(G.wasDigit) 
    				{
    					G.numberB = Integer.parseInt(textField.getText());
    					int a = G.numberA;
    					int b = G.numberB;
    					int result;
    					
						if(G.operator == '+') 
						{
							result = a+b;
						}
						else if(G.operator == '-') 
						{
							result = a-b;
						}
						else if(G.operator == '*') 
						{
							result = a*b;
						}
						else if(G.operator == '/') 
						{
							result = a/b;
						}
						else 
						{
							result = b;
						}
					
	    				textField.setText(Integer.toString(result));
	    				G.numberA = result;
    					G.operator = '/';
    				}
    				if(G.wasOperator) 
    				{
    					G.operator = '/';
    				}
    				if(G.wasEqual)
    				{
    					G.numberA = Integer.parseInt(textField.getText());
    					G.operator = '/';
    				}
    				G.wasClear= Boolean.FALSE;
    				G.wasDigit = Boolean.FALSE;
    				G.wasOperator = Boolean.TRUE;
    				G.wasEqual = Boolean.FALSE;
    			}
    			if(x == '=') 
    			{
    			     if (G.operator != 'a') {
    			    	 	int result;
    		                if(G.wasDigit) 
    		                {
    		                	G.numberB = Integer.parseInt(textField.getText());
    		                }
    		                
    		                if(G.wasOperator) 
    		                {
    		                	G.numberB = Integer.parseInt(textField.getText());
    		                	switch (G.operator) {
	 		                        case '+':
	 		                            result = G.numberB + G.numberB;
	 		                            break;
	 		                        case '-':
	 		                            result = G.numberB - G.numberB;
	 		                            break;
	 		                        case '*':
	 		                            result = G.numberB * G.numberB;
	 		                            break;
	 		                        case '/':
	   		                        	try {
    		                        		result = G.numberA / G.numberB;
    		                        	}catch (ArithmeticException e1){
    		                                textField.setForeground(Color.RED);
    		                        		textField.setText("Error: " + e1.getMessage());
    		                        		G.operator = 'a';
    		                				G.numberA = 0;
    		                				G.numberB = 0;
    		                				G.wasClear= Boolean.FALSE;
    		                				G.wasDigit = Boolean.TRUE;
    		                				G.wasOperator = Boolean.FALSE;
    		                				G.wasEqual = Boolean.FALSE;	
    		                				result = 0;
    		                        	}
    		                        		
	 		                            break;
	 		                        default:
	 		                            throw new IllegalArgumentException("Invalid operator");
	 		                    }
    		                }
    		                if (G.wasEqual) {
    		                    // Perform additional calculation using the last result
    		                    switch (G.operator) {
    		                        case '+':
    		                            result = G.numberB + G.numberA;
    		                            break;
    		                        case '-':
    		                            result = G.numberA - G.numberB;
    		                            break;
    		                        case '*':
    		                            result = G.numberB * G.numberA;
    		                            break;
    		                        case '/':
    		                        	try {
    		                        		result = G.numberA / G.numberB;
    		                        	}catch (ArithmeticException e1){
    		                                textField.setForeground(Color.RED);
    		                        		textField.setText("Error: " + e1.getMessage());
    		                        		G.operator = 'a';
    		                				G.numberA = 0;
    		                				G.numberB = 0;
    		                				G.wasClear= Boolean.FALSE;
    		                				G.wasDigit = Boolean.TRUE;
    		                				G.wasOperator = Boolean.FALSE;
    		                				G.wasEqual = Boolean.FALSE;	
    		                				result = 0;
    		                        	}
    		                        			
    		                            break;
    		                        default:
    		                            throw new IllegalArgumentException("Invalid operator");
    		                    }
    		                }
    		                else 
    		                {
    		                switch (G.operator) {
    		                    case '+':
    		                        result = G.numberA + G.numberB;
    		                        break;
    		                    case '-':
    		                        result = G.numberA - G.numberB;
    		                        break;
    		                    case '*':
    		                        result = G.numberA * G.numberB;
    		                        break;
    		                    case '/':
   		                        	try {
		                        		result = G.numberA / G.numberB;
		                        	}catch (ArithmeticException e1){
		                                textField.setForeground(Color.RED);
		                        		textField.setText("Error: " + e1.getMessage());
		                        		G.operator = 'a';
		                				G.numberA = 0;
		                				G.numberB = 0;
		                				G.wasClear= Boolean.FALSE;
		                				G.wasDigit = Boolean.TRUE;
		                				G.wasOperator = Boolean.FALSE;
		                				G.wasEqual = Boolean.FALSE;	
		                				result = 0;
		                        	}
		                        		
    		                        break;
    		                    default:
    		                        throw new IllegalArgumentException("Invalid operator");
    		                }
    		                }
    		                String text = textField.getText();
    		                if(text.matches("-?\\d+")) { 
    		                textField.setText(Integer.toString(result));
    		                G.wasDigit = Boolean.FALSE;
    		                G.wasOperator = Boolean.FALSE;
    		                
    		                G.numberA = result;
    		                }
    		            }
    			     G.wasEqual = Boolean.TRUE;
    			     G.wasDigit = Boolean.FALSE;
    			}
    		}    		
    	}; 

        JPanel buttonPanel = new JPanel(new GridLayout(4, 4, 20, 10));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        JButton button1 = new JButton("1");
        button1.setBackground(Color.WHITE);
        button1.setForeground(Color.BLACK);
        button1.setFont(new Font("Arial", Font.BOLD, 20));
        buttonPanel.add(button1);
        button1.addActionListener(myActionListener);
        
        
        JButton button2 = new JButton("2");
        button2.setBackground(Color.WHITE);
        button2.setForeground(Color.BLACK);
        button2.setFont(new Font("Arial", Font.BOLD, 20));
        buttonPanel.add(button2);
        button2.addActionListener(myActionListener);
        
        JButton button3 = new JButton("3");
        button3.setBackground(Color.WHITE);
        button3.setForeground(Color.BLACK);
        button3.setFont(new Font("Arial", Font.BOLD, 20));
        buttonPanel.add(button3);
        button3.addActionListener(myActionListener);
        
        JButton buttonPlus = new JButton("+");
        buttonPlus.setBackground(Color.WHITE);
        buttonPlus.setForeground(Color.BLACK);
        buttonPlus.setFont(new Font("Arial", Font.BOLD, 20));
        buttonPanel.add(buttonPlus);
        buttonPlus.addActionListener(myActionListener);
        
        JButton button4 = new JButton("4");
        button4.setBackground(Color.WHITE);
        button4.setForeground(Color.BLACK);
        button4.setFont(new Font("Arial", Font.BOLD, 20));
        buttonPanel.add(button4);
        button4.addActionListener(myActionListener);
        
        JButton button5 = new JButton("5");
        button5.setBackground(Color.WHITE);
        button5.setForeground(Color.BLACK);
        button5.setFont(new Font("Arial", Font.BOLD, 20));
        buttonPanel.add(button5);
        button5.addActionListener(myActionListener);
        
        JButton button6 = new JButton("6");
        button6.setBackground(Color.WHITE);
        button6.setForeground(Color.BLACK);
        button6.setFont(new Font("Arial", Font.BOLD, 20));
        buttonPanel.add(button6);
        button6.addActionListener(myActionListener);
        
        JButton buttonMinus = new JButton("-");
        buttonMinus.setBackground(Color.WHITE);
        buttonMinus.setForeground(Color.BLACK);
        buttonMinus.setFont(new Font("Arial", Font.BOLD, 20));
        buttonPanel.add(buttonMinus);
        buttonMinus.addActionListener(myActionListener);
        
        JButton button7 = new JButton("7");
        button7.setBackground(Color.WHITE);
        button7.setForeground(Color.BLACK);
        button7.setFont(new Font("Arial", Font.BOLD, 20));
        buttonPanel.add(button7);
        button7.addActionListener(myActionListener);
        
        JButton button8 = new JButton("8");
        button8.setBackground(Color.WHITE);
        button8.setForeground(Color.BLACK);
        button8.setFont(new Font("Arial", Font.BOLD, 20));
        buttonPanel.add(button8);
        button8.addActionListener(myActionListener);
        
        JButton button9 = new JButton("9");
        button9.setBackground(Color.WHITE);
        button9.setForeground(Color.BLACK);
        button9.setFont(new Font("Arial", Font.BOLD, 20));
        buttonPanel.add(button9);
        button9.addActionListener(myActionListener);
        
        JButton buttonMultiply = new JButton("*");
        buttonMultiply.setBackground(Color.WHITE);
        buttonMultiply.setForeground(Color.BLACK);
        buttonMultiply.setFont(new Font("Arial", Font.BOLD, 20));
        buttonPanel.add(buttonMultiply);
        buttonMultiply.addActionListener(myActionListener);
        
        JButton button0 = new JButton("0");
        button0.setBackground(Color.WHITE);
        button0.setForeground(Color.BLACK);
        button0.setFont(new Font("Arial", Font.BOLD, 20));
        buttonPanel.add(button0);
        button0.addActionListener(myActionListener);
        
        JButton buttonEqual = new JButton("=");
        buttonEqual.setBackground(Color.WHITE);
        buttonEqual.setForeground(Color.BLACK);
        buttonEqual.setFont(new Font("Arial", Font.BOLD, 20));
        buttonPanel.add(buttonEqual);
        buttonEqual.addActionListener(myActionListener);
        
        JButton buttonC = new JButton("C");
        buttonC.setBackground(Color.WHITE);
        buttonC.setForeground(Color.BLACK);
        buttonC.setFont(new Font("Arial", Font.BOLD, 20));
        buttonPanel.add(buttonC);
        buttonC.addActionListener(myActionListener);
        
        JButton buttonDivide = new JButton("/");
        buttonDivide.setBackground(Color.WHITE);
        buttonDivide.setForeground(Color.BLACK);
        buttonDivide.setFont(new Font("Arial", Font.BOLD, 20));
        buttonPanel.add(buttonDivide);
        buttonDivide.addActionListener(myActionListener);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(textField, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.CENTER);
        
        frame.add(mainPanel);
        
        frame.pack();
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}