package pl.put.poznan.transformer.app;

import pl.put.poznan.transformer.logic.TextTransformer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ArrayList;

public class ControlPanel extends JFrame {

    private JPanel panel1;
    private JTextArea textArea1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JTextArea textArea2;
    private JButton button10;
    private JButton button11;
    private JTextPane upperToMakeTheTextPane;
    private JTextPane lowerToMakeTheTextPane;
    private String text;


    public ControlPanel(String title){

        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.pack();

        setBounds(300, 0, 1000, 800);

        ImageIcon frameIcon = new ImageIcon("PP_monogram.png");
        this.setIconImage(frameIcon.getImage());

        textArea1.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent event) {

                String content = textArea1.getText();
                if (!content.equals("")) {
                    button1.setEnabled(true);
                    button2.setEnabled(true);
                    button3.setEnabled(true);
                    button4.setEnabled(true);
                    button5.setEnabled(true);
                    button6.setEnabled(true);
                    button7.setEnabled(true);
                    button8.setEnabled(true);
                    button9.setEnabled(true);
                    button10.setEnabled(true);
                    button11.setEnabled(true);
                } else {
                    button1.setEnabled(false);
                    button2.setEnabled(false);
                    button3.setEnabled(false);
                    button4.setEnabled(false);
                    button5.setEnabled(false);
                    button6.setEnabled(false);
                    button7.setEnabled(false);
                    button8.setEnabled(false);
                    button9.setEnabled(false);
                    button10.setEnabled(false);
                    button11.setEnabled(false);

                }
            }
        });


        textArea2.setEditable(false);
        upperToMakeTheTextPane.setEditable(false);
        lowerToMakeTheTextPane.setEditable(false);

        textArea1.setLineWrap(true);
        textArea2.setLineWrap(true);

        textArea1.setWrapStyleWord(true);
        textArea2.setWrapStyleWord(true);


        Font f = new Font("Microsoft YaHei UI", Font.BOLD, 18);
        Color blue = new Color(53, 88, 128);

        upperToMakeTheTextPane.setFont(f);
        lowerToMakeTheTextPane.setFont(f);

        ArrayList<JButton> buttons = new ArrayList<>();
        buttons.add(button1);
        buttons.add(button2);
        buttons.add(button3);
        buttons.add(button4);
        buttons.add(button5);
        buttons.add(button6);
        buttons.add(button7);
        buttons.add(button8);
        buttons.add(button9);
        buttons.add(button10);
        buttons.add(button11);

        for(int i = 0; i < 9; i++){
//            buttons.get(i).setBorderPainted(false);
//            buttons.get(i).setContentAreaFilled(false);
            buttons.get(i).setBackground(blue);
//            buttons.get(i).setContentAreaFilled(false);
//            buttons.get(i).setFocusPainted(false);
//            buttons.get(i).setFocusable(false);
//            buttons.get(i).setBorder(BorderFactory.createEmptyBorder(10, 14, 10, 14));
        }




        button1.addActionListener(e -> {
            this.text = textArea1.getText();

            this.setVisible(true);

            String option = "upper";
            String[] todo = option.split(";");

            TextTransformer transformer = new TextTransformer(todo);
            this.text = transformer.transform(text);

            textArea2.setText(text);
        });

        button2.addActionListener(e -> {
            this.text = textArea1.getText();

            this.setVisible(true);

            String option = "lower";
            String[] todo = option.split(";");

            TextTransformer transformer = new TextTransformer(todo);
            this.text = transformer.transform(text);

            textArea2.setText(text);
        });

        button3.addActionListener(e -> {
            this.text = textArea1.getText();

            this.setVisible(true);

            String option = "capitalize";
            String[] todo = option.split(";");

            TextTransformer transformer = new TextTransformer(todo);
            this.text = transformer.transform(text);

            textArea2.setText(text);
        });

        button4.addActionListener(e -> {
            this.text = textArea1.getText();

            this.setVisible(true);

            String option = "inverse";
            String[] todo = option.split(";");

            TextTransformer transformer = new TextTransformer(todo);
            this.text = transformer.transform(text);

            textArea2.setText(text);
        });

        button5.addActionListener(e -> {
            this.text = textArea1.getText();

            this.setVisible(true);

            String option = "to-acronyms";
            String[] todo = option.split(";");

            TextTransformer transformer = new TextTransformer(todo);
            this.text = transformer.transform(text);

            textArea2.setText(text);
        });

        button6.addActionListener(e -> {
            this.text = textArea1.getText();

            this.setVisible(true);

            String option = "to-full-form";
            String[] todo = option.split(";");

            TextTransformer transformer = new TextTransformer(todo);
            this.text = transformer.transform(text);

            textArea2.setText(text);
        });

        button7.addActionListener(e -> {
            this.text = textArea1.getText();

            this.setVisible(true);

            String option = "latex";
            String[] todo = option.split(";");

            TextTransformer transformer = new TextTransformer(todo);
            this.text = transformer.transform(text);

            textArea2.setText(text);
        });

        button8.addActionListener(e -> {
            this.text = textArea1.getText();

            this.setVisible(true);

            String option = "remove-repetitions";
            String[] todo = option.split(";");

            TextTransformer transformer = new TextTransformer(todo);
            this.text = transformer.transform(text);

            textArea2.setText(text);
        });

        button9.addActionListener(e -> {
            this.text = textArea1.getText();

            this.setVisible(true);

            String option = "numbers-to-text";
            String[] todo = option.split(";");

            TextTransformer transformer = new TextTransformer(todo);
            this.text = transformer.transform(text);

            textArea2.setText(text);
        });

        button10.addActionListener(e -> {
            textArea1.setText("");
            textArea2.setText("");
        });

        button11.addActionListener(e -> {
            this.text = textArea2.getText();

            textArea2.setText("");
            textArea1.setText(text);
        });


        textArea1.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                if(textArea1.getText().equals("Enter text"))
                {
                    textArea1.setText("");
                    repaint();
                    revalidate();
                }
            }
        });

        textArea1.setCaretColor(Color.white);

    }


    public static void main(String[] args) {
        JFrame control = new ControlPanel("Text Transformer");
        control.setVisible(true);
    }
}
