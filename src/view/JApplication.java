package view;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entites.Proceed;
import entites.RoundedButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JLabel;

public class JApplication extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static boolean value = true;
	Proceed proceed = new Proceed();
	private static boolean isOne = true;
	
	private static boolean hasPoint = false;
	private static boolean hasPlus = false;
	private static boolean hasMinus = false;
	private static boolean hasMultiply = false;
	private static boolean hasDivision = false;
	
	private static boolean hasNumber = false;
	private static boolean hasExpression = false;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JApplication frame = new JApplication();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JApplication() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 311, 416);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel ResultCalculator = new JLabel("0");
		ResultCalculator.setFont(new Font("Digital-7", Font.PLAIN, 36));
		ResultCalculator.setHorizontalAlignment(SwingConstants.RIGHT);
		ResultCalculator.setForeground(new Color(255, 255, 255));
		ResultCalculator.setBounds(34, 47, 247, 86);
		contentPane.add(ResultCalculator);
		
		RoundedButton NumberZero = new RoundedButton("0");
		NumberZero.setForeground(new Color(255, 255, 255));
		NumberZero.setBackground(new Color(102, 102, 102));
		NumberZero.setFont(new Font("Arial", Font.BOLD, 12));
		NumberZero.setHorizontalAlignment(SwingConstants.LEFT);
		NumberZero.setBounds(34, 329, 100, 23);
		NumberZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!isOne) {
					proceed.addPart("0");
					ResultCalculator.setText(ResultCalculator.getText() + "0");
					hasPlus = false;
					hasPoint = false;
					hasMinus = false;
					hasMultiply = false;
					hasDivision = false;
				}
			}
		});
		contentPane.setLayout(null);
		contentPane.add(NumberZero);
		
		RoundedButton Point = new RoundedButton("Point");
		Point.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				isOne = false;
				
				if (!hasPoint) {
					if (!hasNumber) {
						proceed.addPart(".");
						ResultCalculator.setText("0.");
						hasPoint = true;
						hasPlus = false;
						hasMinus = false;
						hasMultiply = false;
						hasDivision = false;
					} else {
						proceed.addPart(".");
						ResultCalculator.setText(ResultCalculator.getText() + ".");
						hasPoint = true;
						hasPlus = false;
						hasMinus = false;
						hasMultiply = false;
						hasDivision = false;
					}
				}
				
			}
		});
		Point.setText(".");
		Point.setHorizontalAlignment(SwingConstants.LEFT);
		Point.setForeground(Color.WHITE);
		Point.setFont(new Font("Arial", Font.BOLD, 12));
		Point.setBackground(new Color(102, 102, 102));
		Point.setBounds(168, 329, 43, 23);
		contentPane.add(Point);
		
		RoundedButton NumberTwo = new RoundedButton("2");
		NumberTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				proceed.addPart("2");
				hasNumber = true;
				
				if (isOne) {
					ResultCalculator.setText("2");
					isOne = false;
					hasPlus = false;
					hasPoint = false;
					hasMinus = false;
					hasMultiply = false;
					hasDivision = false;
				} else {
					ResultCalculator.setText(ResultCalculator.getText() + "2");
					hasPlus = false;
					hasMinus = false;
					hasPoint = false;
				}
				
			}
		});
		NumberTwo.setText("2");
		NumberTwo.setHorizontalAlignment(SwingConstants.LEFT);
		NumberTwo.setForeground(Color.WHITE);
		NumberTwo.setFont(new Font("Arial", Font.BOLD, 12));
		NumberTwo.setBackground(new Color(102, 102, 102));
		NumberTwo.setBounds(96, 289, 47, 23);
		contentPane.add(NumberTwo);
		
		RoundedButton NumberThree = new RoundedButton("3");
		NumberThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				proceed.addPart("3");
				hasNumber = true;
				
				if (isOne) {
					ResultCalculator.setText("3");
					isOne = false;
					hasPlus = false;
					hasMinus = false;
					hasPoint = false;
				} else {
					ResultCalculator.setText(ResultCalculator.getText() + "3");
					hasPlus = false;
					hasMinus = false;
					hasPoint = false;
					hasMultiply = false;
					hasDivision = false;
				}
				
			}
		});
		NumberThree.setText("3");
		NumberThree.setHorizontalAlignment(SwingConstants.LEFT);
		NumberThree.setForeground(Color.WHITE);
		NumberThree.setFont(new Font("Arial", Font.BOLD, 12));
		NumberThree.setBackground(new Color(102, 102, 102));
		NumberThree.setBounds(164, 289, 47, 23);
		contentPane.add(NumberThree);
		
		RoundedButton NumberOne = new RoundedButton("1");
		NumberOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				proceed.addPart("1");
				hasNumber = true;
				
				if (isOne) {
					ResultCalculator.setText("1");
					isOne = false;
					hasPlus = false;
					hasMinus = false;
					hasPoint = false;
					hasMultiply = false;
					hasDivision = false;
				} else {
					ResultCalculator.setText(ResultCalculator.getText() + "1");
					hasPlus = false;
					hasMinus = false;
					hasPoint = false;
					hasMultiply = false;
					hasDivision = false;
				}
	
			}
		});
		NumberOne.setText("1");
		NumberOne.setHorizontalAlignment(SwingConstants.LEFT);
		NumberOne.setForeground(Color.WHITE);
		NumberOne.setFont(new Font("Arial", Font.BOLD, 12));
		NumberOne.setBackground(new Color(102, 102, 102));
		NumberOne.setBounds(34, 289, 47, 23);
		contentPane.add(NumberOne);
		
		RoundedButton NumberFour = new RoundedButton("4");
		NumberFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				proceed.addPart("4");
				hasNumber = true;
				
				if (isOne) {
					ResultCalculator.setText("4");
					isOne = false;
					hasPlus = false;
					hasPoint = false;
					hasMultiply = false;
					hasDivision = false;
				} else {
					ResultCalculator.setText(ResultCalculator.getText() + "4");
					hasPlus = false;
					hasPoint = false;
					hasMultiply = false;
					hasDivision = false;
				}
				
			}
		});
		NumberFour.setText("4");
		NumberFour.setHorizontalAlignment(SwingConstants.LEFT);
		NumberFour.setForeground(Color.WHITE);
		NumberFour.setFont(new Font("Arial", Font.BOLD, 12));
		NumberFour.setBackground(new Color(102, 102, 102));
		NumberFour.setBounds(34, 255, 47, 23);
		contentPane.add(NumberFour);
		
		RoundedButton NumberFive = new RoundedButton("5");
		NumberFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				proceed.addPart("5");
				hasNumber = true;
				
				if (isOne) {
					ResultCalculator.setText("5");
					isOne = false;
					hasPlus = false;
					hasMinus = false;
					hasPoint = false;
				} else {
					ResultCalculator.setText(ResultCalculator.getText() + "5");
					hasPlus = false;
					hasMinus = false;
					hasPoint = false;
				}
				
			}
		});
		NumberFive.setText("5");
		NumberFive.setHorizontalAlignment(SwingConstants.LEFT);
		NumberFive.setForeground(Color.WHITE);
		NumberFive.setFont(new Font("Arial", Font.BOLD, 12));
		NumberFive.setBackground(new Color(102, 102, 102));
		NumberFive.setBounds(96, 255, 47, 23);
		contentPane.add(NumberFive);
		
		RoundedButton NumberSix = new RoundedButton("6");
		NumberSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				proceed.addPart("6");
				hasNumber = true;
				
				if (isOne) {
					ResultCalculator.setText("6");
					isOne = false;
					hasPlus = false;
					hasMinus = false;
					hasPoint = false;
					hasMultiply = false;
					hasDivision = false;
				} else {
					ResultCalculator.setText(ResultCalculator.getText() + "6");
					hasPlus = false;
					hasMinus = false;
					hasPoint = false;
					hasMultiply = false;
					hasDivision = false;
				}
				
			}
		});
		NumberSix.setText("6");
		NumberSix.setHorizontalAlignment(SwingConstants.LEFT);
		NumberSix.setForeground(Color.WHITE);
		NumberSix.setFont(new Font("Arial", Font.BOLD, 12));
		NumberSix.setBackground(new Color(102, 102, 102));
		NumberSix.setBounds(164, 255, 47, 23);
		contentPane.add(NumberSix);
		
		RoundedButton NumberSeven = new RoundedButton("7");
		NumberSeven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				proceed.addPart("7");
				hasNumber = true;
				
				if (isOne) {
					ResultCalculator.setText("7");
					isOne = false;
					hasPlus = false;
					hasMinus = false;
					hasPoint = false;
					hasMultiply = false;
					hasDivision = false;
				} else {
					ResultCalculator.setText(ResultCalculator.getText() + "7");
					hasPlus = false;
					hasMinus = false;
					hasPoint = false;
					hasMultiply = false;
					hasDivision = false;
				}
				
			}
		});
		NumberSeven.setText("7");
		NumberSeven.setHorizontalAlignment(SwingConstants.LEFT);
		NumberSeven.setForeground(Color.WHITE);
		NumberSeven.setFont(new Font("Arial", Font.BOLD, 12));
		NumberSeven.setBackground(new Color(102, 102, 102));
		NumberSeven.setBounds(34, 220, 47, 23);
		contentPane.add(NumberSeven);
		
		RoundedButton NumberEight = new RoundedButton("8");
		NumberEight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				proceed.addPart("8");
				hasNumber = true;
				
				if (isOne) {
					ResultCalculator.setText("8");
					isOne = false;
					hasPlus = false;
					hasMinus = false;
					hasPoint = false;
					hasMultiply = false;
					hasDivision = false;
				} else {
					ResultCalculator.setText(ResultCalculator.getText() + "8");
					hasPlus = false;
					hasMinus = false;
					hasPoint = false;
				}
				
			}
		});
		NumberEight.setText("8");
		NumberEight.setHorizontalAlignment(SwingConstants.LEFT);
		NumberEight.setForeground(Color.WHITE);
		NumberEight.setFont(new Font("Arial", Font.BOLD, 12));
		NumberEight.setBackground(new Color(102, 102, 102));
		NumberEight.setBounds(96, 220, 47, 23);
		contentPane.add(NumberEight);
		
		RoundedButton NumberNine = new RoundedButton("9");
		NumberNine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				proceed.addPart("9");
				hasNumber = true;
				
				if (isOne) {
					ResultCalculator.setText("9");
					isOne = false;
					hasPlus = false;
					hasMinus = false;
					hasPoint = false;
				} else {
					ResultCalculator.setText(ResultCalculator.getText() + "9");
					hasPlus = false;
					hasMinus = false;
					hasPoint = false;
					hasMultiply = false;
					hasDivision = false;
				}
				
			}
		});
		NumberNine.setText("9");
		NumberNine.setHorizontalAlignment(SwingConstants.LEFT);
		NumberNine.setForeground(Color.WHITE);
		NumberNine.setFont(new Font("Arial", Font.BOLD, 12));
		NumberNine.setBackground(new Color(102, 102, 102));
		NumberNine.setBounds(164, 220, 47, 23);
		contentPane.add(NumberNine);
		
		RoundedButton Equals = new RoundedButton("Equals");
		Equals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (hasExpression) {
					double resultss = proceed.calculateResult();
		        	String results = String.valueOf(resultss);
					ResultCalculator.setText(results);
				}
		       
			}
		});
		Equals.setText("=");
		Equals.setHorizontalAlignment(SwingConstants.LEFT);
		Equals.setForeground(Color.WHITE);
		Equals.setFont(new Font("Arial", Font.BOLD, 12));
		Equals.setBackground(new Color(179, 89, 0));
		Equals.setBounds(233, 329, 48, 23);
		contentPane.add(Equals);
		
		RoundedButton Plus = new RoundedButton("Plus");
		Plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (!isOne) {
					if (!hasPlus) {
						ResultCalculator.setText(ResultCalculator.getText() + "+");
						hasPlus = true;
						proceed.addPart("+");
						hasExpression = true;
					}
				}
				
			}
		});
		Plus.setText("+");
		Plus.setHorizontalAlignment(SwingConstants.LEFT);
		Plus.setForeground(Color.WHITE);
		Plus.setFont(new Font("Arial", Font.BOLD, 12));
		Plus.setBackground(new Color(179, 89, 0));
		Plus.setBounds(233, 289, 48, 23);
		contentPane.add(Plus);
		
		RoundedButton Minus = new RoundedButton("Minus");
		Minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (!isOne) {
					if (!hasMinus) {
						ResultCalculator.setText(ResultCalculator.getText() + "-");
						hasMinus = true;
						proceed.addPart("-");
						hasExpression = true;
					}
				}
				
			}
		});
		Minus.setText("-");
		Minus.setHorizontalAlignment(SwingConstants.LEFT);
		Minus.setForeground(Color.WHITE);
		Minus.setFont(new Font("Arial", Font.BOLD, 12));
		Minus.setBackground(new Color(179, 89, 0));
		Minus.setBounds(233, 255, 48, 23);
		contentPane.add(Minus);
		
		RoundedButton Multiply = new RoundedButton("Multiply");
		Multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (!isOne) {
					if (!hasMultiply) {
						ResultCalculator.setText(ResultCalculator.getText() + "x");
						hasMultiply = true;
						proceed.addPart("*");
						hasExpression = true;
					}
				}
				
			}
		});
		Multiply.setText("x");
		Multiply.setHorizontalAlignment(SwingConstants.LEFT);
		Multiply.setForeground(Color.WHITE);
		Multiply.setFont(new Font("Arial", Font.BOLD, 12));
		Multiply.setBackground(new Color(179, 89, 0));
		Multiply.setBounds(233, 220, 48, 23);
		contentPane.add(Multiply);
		
		RoundedButton DividedBy = new RoundedButton("DividedBy");
		DividedBy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (!isOne) {
					if (!hasDivision) {
						ResultCalculator.setText(ResultCalculator.getText() + "/");
						hasDivision = true;
						proceed.addPart("/");
						hasExpression = true;
					}
				}
				
			}
		});
		DividedBy.setText(" /");
		DividedBy.setHorizontalAlignment(SwingConstants.LEFT);
		DividedBy.setForeground(Color.WHITE);
		DividedBy.setFont(new Font("Arial", Font.BOLD, 12));
		DividedBy.setBackground(new Color(179, 89, 0));
		DividedBy.setBounds(233, 185, 48, 23);
		contentPane.add(DividedBy);
		
		RoundedButton AllClear = new RoundedButton("AllClear");
		AllClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				proceed.clean();
				ResultCalculator.setText("0");
				isOne = true;
			}
		});
		AllClear.setText("AC");
		AllClear.setHorizontalAlignment(SwingConstants.LEFT);
		AllClear.setForeground(Color.WHITE);
		AllClear.setFont(new Font("Arial", Font.BOLD, 12));
		AllClear.setBackground(new Color(102, 102, 102));
		AllClear.setBounds(31, 185, 56, 23);
		contentPane.add(AllClear);
		
		RoundedButton BackspaceButton = new RoundedButton("BackspaceButton");
		BackspaceButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String current = ResultCalculator.getText();
				String operators = "+-*/%";
				int lastOperatorIndex = -1;
				
				for (char operator : operators.toCharArray()) {
					int index = current.lastIndexOf(operator);
					if (index > lastOperatorIndex) {
						lastOperatorIndex = index;
					}
				}
				
				if (lastOperatorIndex != -1) {
					String newText = current.substring(0, lastOperatorIndex + 1).trim();
					ResultCalculator.setText(newText);
				}
				
				proceed.removeLastPart();
				
			}
		});
		BackspaceButton.setText("←");
		BackspaceButton.setHorizontalAlignment(SwingConstants.LEFT);
		BackspaceButton.setForeground(Color.WHITE);
		BackspaceButton.setFont(new Font("Arial", Font.BOLD, 12));
		BackspaceButton.setBackground(new Color(102, 102, 102));
		BackspaceButton.setBounds(98, 185, 56, 23);
		contentPane.add(BackspaceButton);
		
		RoundedButton PlusOrMinus = new RoundedButton("Plus/Minus");
		PlusOrMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText = ResultCalculator.getText();

		        if (!currentText.equals("0")) {
		            if (currentText.startsWith("-")) {
		            	
		                ResultCalculator.setText(currentText.substring(1));
		                
		            } else {
		            	
		                ResultCalculator.setText("-" + currentText);
		                
		            }
		        }
			}
		});
		PlusOrMinus.setText("+/-");
		PlusOrMinus.setHorizontalAlignment(SwingConstants.LEFT);
		PlusOrMinus.setForeground(Color.WHITE);
		PlusOrMinus.setFont(new Font("Arial", Font.BOLD, 12));
		PlusOrMinus.setBackground(new Color(102, 102, 102));
		PlusOrMinus.setBounds(164, 185, 59, 23);
		contentPane.add(PlusOrMinus);
	}
}
