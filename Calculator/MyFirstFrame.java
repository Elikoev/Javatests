package Javatests.Calculator;

import javax.script.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Reader;

/**
 * Possible components
 * JTextArea
 * JTextField
 * JButton
 * JPanel
 */
public class MyFirstFrame {

    private final JFrame mainFrame;
    private JTextField textField;

    public MyFirstFrame(String title) {
        this.mainFrame = new JFrame(title);
        initMainFrame();

        mainFrame.setLayout(new BorderLayout());

        mainFrame.add(createTop(), BorderLayout.NORTH);
        mainFrame.add(createBottom(), BorderLayout.CENTER);
        mainFrame.add((eastPanel()),BorderLayout.EAST);
        mainFrame.add((southPanel()),BorderLayout.AFTER_LAST_LINE);

        mainFrame.setVisible(true);
    }

    private JPanel createTop() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5,1));

        textField = new JTextField();
        textField.setEditable(false);
        panel.add(textField);

        return panel;
    }

    private JPanel southPanel(){
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1,0));


        //вычисление он же =

        JButton resultButton = new JButton("=");
        resultButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
                ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("Nashorn");
                Object result = null;
                try {
                    result = scriptEngine.eval(textField.getText());
                } catch (ScriptException ex) {
                    ex.printStackTrace();
                }

                textField.setText(result.toString());
            }
        });
        panel.add(resultButton);

        return panel;

    }

    private JPanel eastPanel (){
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,1));
        DigitButtonActionListener digitButtonActionListener = new DigitButtonActionListener(textField);
// сложение
        JButton additionButton = new JButton("+");
        additionButton.addActionListener(digitButtonActionListener);
        panel.add((additionButton));
// вычитание
        JButton subtractionButton = new JButton("-");
            subtractionButton.addActionListener(digitButtonActionListener);
           panel.add((subtractionButton));
// умножение
        JButton multiplicationButton = new JButton("*");
        multiplicationButton.addActionListener(digitButtonActionListener);
        panel.add((multiplicationButton));
//деление
        JButton divisionButton = new JButton("/");
        divisionButton.addActionListener(digitButtonActionListener);
        panel.add((divisionButton));

        return panel;
    }

    private JPanel createBottom() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        DigitButtonActionListener digitButtonActionListener = new DigitButtonActionListener(textField);

        for (int i = 1; i < 10; i++) {
            JButton btn = new JButton(String.valueOf(i));
            btn.addActionListener(digitButtonActionListener);
            panel.add(btn);
        }

        JButton clearButton = new JButton("C");
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nullField();
            }
        });
        panel.add(clearButton);
        //ноль по серединке

        JButton nullButton = new JButton("0");
        nullButton.addActionListener(digitButtonActionListener);
        panel.add(nullButton);

        JButton sqwButton = new JButton("\u221A");
        sqwButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isNullField()) {
                    textField.setText(String.valueOf(Math.sqrt(Double.parseDouble(textField.getText()))));
                } else {
                    nullField();
                }
            }
        });

        panel.add((sqwButton));

        return panel;
    }

    private void initMainFrame() {
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        /**
         mainFrame.setBounds(50, 50, 300, 500);
         */
        /**
         Rectangle rectangle = new Rectangle(50, 50, 300, 500);
         mainFrame.setBounds(rectangle);
         */
        Rectangle rectangle = new Rectangle(300, 500);
        mainFrame.setBounds(rectangle);
    }

    public MyFirstFrame() {
        this("My Calc v1.0");
    }

    private boolean isNullField (){
       String str = textField.getText();

        return str != null && !str.trim().isEmpty();


    }
    private void nullField (){
        textField.setText(null);
    }
}