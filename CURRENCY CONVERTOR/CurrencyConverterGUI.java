import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrencyConverterGUI extends JFrame implements ActionListener {
    private JTextField amountTextField;
    private JComboBox<String> sourceCurrencyComboBox;
    private JComboBox<String> targetCurrencyComboBox;
    private JLabel resultLabel;

    private static final String[] CURRENCIES = {"INR", "USD", "EUR", "JPY", "GBP", "AUD"};
    private static final double[] CONVERSION_RATES = {1.0,0.012, 0.011, 1.77, 0.0096, 0.019};

    public CurrencyConverterGUI() {
        setTitle("Currency Converter");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(4, 2, 10, 10));

        JLabel amountLabel = new JLabel("Amount:");
        amountTextField = new JTextField();

        JLabel sourceCurrencyLabel = new JLabel("From:");
        sourceCurrencyComboBox = new JComboBox<>(CURRENCIES);
        sourceCurrencyComboBox.setFont(new Font("Arial", Font.PLAIN, 12));
        sourceCurrencyComboBox.setPreferredSize(new Dimension(150, 20));

        JLabel targetCurrencyLabel = new JLabel("To:");
        targetCurrencyComboBox = new JComboBox<>(CURRENCIES);
        targetCurrencyComboBox.setFont(new Font("Arial", Font.PLAIN, 12));
        targetCurrencyComboBox.setPreferredSize(new Dimension(150, 20));

        JButton convertButton = new JButton("Convert");
        convertButton.setSize(10, 10);
        convertButton.addActionListener(this);

        resultLabel = new JLabel("");

        mainPanel.add(amountLabel);
        mainPanel.add(amountTextField);
        mainPanel.add(sourceCurrencyLabel);
        mainPanel.add(sourceCurrencyComboBox);
        mainPanel.add(targetCurrencyLabel);
        mainPanel.add(targetCurrencyComboBox);
        mainPanel.add(convertButton);
        mainPanel.add(resultLabel);

        add(mainPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double amount = Double.parseDouble(amountTextField.getText());
            int sourceIndex = sourceCurrencyComboBox.getSelectedIndex();
            int targetIndex = targetCurrencyComboBox.getSelectedIndex();
            
            double sourceRate = CONVERSION_RATES[sourceIndex];
            double targetRate = CONVERSION_RATES[targetIndex];

            double convertedAmount = amount * (targetRate / sourceRate);
            resultLabel.setText(String.format("%.2f %s = %.2f %s",
                    amount, CURRENCIES[sourceIndex], convertedAmount, CURRENCIES[targetIndex]));
        } catch (NumberFormatException ex) {
            resultLabel.setText("Invalid input!");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CurrencyConverterGUI converter = new CurrencyConverterGUI();
            converter.setVisible(true);
        });
    }
}