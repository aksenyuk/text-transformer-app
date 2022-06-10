package pl.put.poznan.transformer.app;

import pl.put.poznan.transformer.logic.TextTransformer;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ArrayList;
import java.util.Locale;

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


    public ControlPanel(String title) {

        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.pack();

        setBounds(300, 0, 1000, 800);

        ImageIcon frameIcon = new ImageIcon("PP_znak.png");
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

        for (int i = 0; i < 9; i++) {
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


        textArea1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (textArea1.getText().equals("Enter text")) {
                    textArea1.setText("");
                    repaint();
                    revalidate();
                }
            }
        });

        textArea1.setCaretColor(Color.white);

        this.setContentPane(panel1);

    }


    public static void main(String[] args) {
        JFrame control = new ControlPanel("Text Transformer");
        control.setVisible(true);
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     */
    private void $$$setupUI$$$() {
        panel1 = new JPanel();
        panel1.setLayout(new GridBagLayout());
        panel1.setBackground(new Color(-12894399));
        panel1.setForeground(new Color(-12894399));
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new GridBagLayout());
        panel2.setBackground(new Color(-12894399));
        panel2.setForeground(new Color(-12894399));
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panel1.add(panel2, gbc);
        final JPanel panel3 = new JPanel();
        panel3.setLayout(new GridBagLayout());
        panel3.setBackground(new Color(-12894399));
        panel3.setForeground(new Color(-12894399));
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panel2.add(panel3, gbc);
        final JPanel panel4 = new JPanel();
        panel4.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 4, new Insets(0, 0, 0, 0), -1, -1));
        panel4.setBackground(new Color(-12894399));
        panel4.setForeground(new Color(-12894399));
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panel3.add(panel4, gbc);
        upperToMakeTheTextPane = new JTextPane();
        upperToMakeTheTextPane.setBackground(new Color(-12894399));
        Font upperToMakeTheTextPaneFont = this.$$$getFont$$$("Microsoft YaHei UI", Font.BOLD, 16, upperToMakeTheTextPane.getFont());
        if (upperToMakeTheTextPaneFont != null) upperToMakeTheTextPane.setFont(upperToMakeTheTextPaneFont);
        upperToMakeTheTextPane.setForeground(new Color(-1));
        upperToMakeTheTextPane.setText("• Upper: to make the text UPPER-CASE\n• Capitalize: to make all word Capital\n• Acronym: to change full form to acronyms\n• Latex: to make the text LaTeX suitable\n• Remove Duplicates: to remove consecutive repetitive words");
        panel4.add(upperToMakeTheTextPane, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        lowerToMakeTheTextPane = new JTextPane();
        lowerToMakeTheTextPane.setBackground(new Color(-12894399));
        Font lowerToMakeTheTextPaneFont = this.$$$getFont$$$("Microsoft YaHei UI", Font.BOLD, 16, lowerToMakeTheTextPane.getFont());
        if (lowerToMakeTheTextPaneFont != null) lowerToMakeTheTextPane.setFont(lowerToMakeTheTextPaneFont);
        lowerToMakeTheTextPane.setForeground(new Color(-1));
        lowerToMakeTheTextPane.setText("• Lower: to make the text lower-case \n• Inverse: to inverse the order (preserves case) \n• Full Form: to change acronyms to full form \n• Numbers To Text: to convert numbers into text");
        panel4.add(lowerToMakeTheTextPane, new com.intellij.uiDesigner.core.GridConstraints(0, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        final JToolBar.Separator toolBar$Separator1 = new JToolBar.Separator();
        panel4.add(toolBar$Separator1, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JToolBar.Separator toolBar$Separator2 = new JToolBar.Separator();
        panel4.add(toolBar$Separator2, new com.intellij.uiDesigner.core.GridConstraints(0, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JToolBar.Separator toolBar$Separator3 = new JToolBar.Separator();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(toolBar$Separator3, gbc);
        final JPanel panel5 = new JPanel();
        panel5.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 5, new Insets(0, 0, 0, 0), -1, -1));
        panel5.setBackground(new Color(-12894399));
        panel5.setForeground(new Color(-12894399));
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panel3.add(panel5, gbc);
        final JPanel panel6 = new JPanel();
        panel6.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(3, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel6.setBackground(new Color(-12894399));
        panel6.setForeground(new Color(-12894399));
        panel5.add(panel6, new com.intellij.uiDesigner.core.GridConstraints(0, 4, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, true));
        panel6.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        final JPanel panel7 = new JPanel();
        panel7.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel7.setForeground(new Color(-12894399));
        panel6.add(panel7, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        panel7.setBorder(BorderFactory.createTitledBorder(BorderFactory.createRaisedBevelBorder(), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, new Color(-12894399)));
        button7 = new JButton();
        button7.setBackground(new Color(-13281152));
        button7.setBorderPainted(false);
        Font button7Font = this.$$$getFont$$$("Microsoft YaHei UI", Font.BOLD, 16, button7.getFont());
        if (button7Font != null) button7.setFont(button7Font);
        button7.setForeground(new Color(-1));
        button7.setText("Latex");
        panel7.add(button7, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel8 = new JPanel();
        panel8.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel8.setForeground(new Color(-12894399));
        panel6.add(panel8, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        panel8.setBorder(BorderFactory.createTitledBorder(BorderFactory.createRaisedBevelBorder(), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, new Color(-12894399)));
        button9 = new JButton();
        button9.setBackground(new Color(-13281152));
        button9.setBorderPainted(false);
        Font button9Font = this.$$$getFont$$$("Microsoft YaHei UI", Font.BOLD, 16, button9.getFont());
        if (button9Font != null) button9.setFont(button9Font);
        button9.setForeground(new Color(-1));
        button9.setText("Numbers To Text");
        panel8.add(button9, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel9 = new JPanel();
        panel9.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel9.setForeground(new Color(-12894399));
        panel6.add(panel9, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        panel9.setBorder(BorderFactory.createTitledBorder(BorderFactory.createRaisedBevelBorder(), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, new Color(-12894399)));
        button8 = new JButton();
        button8.setBackground(new Color(-13281152));
        button8.setBorderPainted(false);
        Font button8Font = this.$$$getFont$$$("Microsoft YaHei UI", Font.BOLD, 16, button8.getFont());
        if (button8Font != null) button8.setFont(button8Font);
        button8.setForeground(new Color(-1));
        button8.setText("Remove Duplicates");
        panel9.add(button8, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel10 = new JPanel();
        panel10.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(3, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel10.setBackground(new Color(-12894399));
        panel10.setForeground(new Color(-12894399));
        panel5.add(panel10, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, true));
        panel10.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        final JPanel panel11 = new JPanel();
        panel11.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel11.setForeground(new Color(-12894399));
        panel10.add(panel11, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        panel11.setBorder(BorderFactory.createTitledBorder(BorderFactory.createRaisedBevelBorder(), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, new Color(-12894399)));
        button1 = new JButton();
        button1.setBackground(new Color(-13281152));
        Font button1Font = this.$$$getFont$$$("Microsoft YaHei UI", Font.BOLD, 16, button1.getFont());
        if (button1Font != null) button1.setFont(button1Font);
        button1.setForeground(new Color(-1));
        button1.setIconTextGap(0);
        button1.setText("Upper");
        panel11.add(button1, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel12 = new JPanel();
        panel12.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel12.setForeground(new Color(-12894399));
        panel10.add(panel12, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        panel12.setBorder(BorderFactory.createTitledBorder(BorderFactory.createRaisedBevelBorder(), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, new Color(-12894399)));
        button3 = new JButton();
        button3.setBackground(new Color(-13281152));
        button3.setBorderPainted(false);
        Font button3Font = this.$$$getFont$$$("Microsoft YaHei UI", Font.BOLD, 16, button3.getFont());
        if (button3Font != null) button3.setFont(button3Font);
        button3.setForeground(new Color(-1));
        button3.setHorizontalAlignment(0);
        button3.setIconTextGap(0);
        button3.setText("Capitalize");
        panel12.add(button3, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel13 = new JPanel();
        panel13.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel13.setForeground(new Color(-12894399));
        panel10.add(panel13, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        panel13.setBorder(BorderFactory.createTitledBorder(BorderFactory.createRaisedBevelBorder(), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, new Color(-12894399)));
        button2 = new JButton();
        button2.setBackground(new Color(-13281152));
        Font button2Font = this.$$$getFont$$$("Microsoft YaHei UI", Font.BOLD, 16, button2.getFont());
        if (button2Font != null) button2.setFont(button2Font);
        button2.setForeground(new Color(-1));
        button2.setIconTextGap(0);
        button2.setText("Lower");
        panel13.add(button2, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel14 = new JPanel();
        panel14.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(3, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel14.setBackground(new Color(-12894399));
        panel14.setForeground(new Color(-12894399));
        panel5.add(panel14, new com.intellij.uiDesigner.core.GridConstraints(0, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, true));
        panel14.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        final JPanel panel15 = new JPanel();
        panel15.setLayout(new GridBagLayout());
        panel15.setForeground(new Color(-12894399));
        panel14.add(panel15, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        panel15.setBorder(BorderFactory.createTitledBorder(BorderFactory.createRaisedBevelBorder(), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, new Color(-12894399)));
        button6 = new JButton();
        button6.setBackground(new Color(-13281152));
        button6.setBorderPainted(false);
        Font button6Font = this.$$$getFont$$$("Microsoft YaHei UI", Font.BOLD, 16, button6.getFont());
        if (button6Font != null) button6.setFont(button6Font);
        button6.setForeground(new Color(-1));
        button6.setText("Full Form");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panel15.add(button6, gbc);
        final JPanel panel16 = new JPanel();
        panel16.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel16.setForeground(new Color(-12894399));
        panel14.add(panel16, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        panel16.setBorder(BorderFactory.createTitledBorder(BorderFactory.createRaisedBevelBorder(), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, new Color(-12894399)));
        button4 = new JButton();
        button4.setBackground(new Color(-13281152));
        button4.setBorderPainted(false);
        Font button4Font = this.$$$getFont$$$("Microsoft YaHei UI", Font.BOLD, 16, button4.getFont());
        if (button4Font != null) button4.setFont(button4Font);
        button4.setForeground(new Color(-1));
        button4.setText("Inverse");
        panel16.add(button4, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel17 = new JPanel();
        panel17.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel17.setForeground(new Color(-12894399));
        panel14.add(panel17, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        panel17.setBorder(BorderFactory.createTitledBorder(BorderFactory.createRaisedBevelBorder(), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, new Color(-12894399)));
        button5 = new JButton();
        button5.setBackground(new Color(-13281152));
        button5.setBorderPainted(false);
        Font button5Font = this.$$$getFont$$$("Microsoft YaHei UI", Font.BOLD, 16, button5.getFont());
        if (button5Font != null) button5.setFont(button5Font);
        button5.setForeground(new Color(-1));
        button5.setText("Acronym");
        panel17.add(button5, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JToolBar.Separator toolBar$Separator4 = new JToolBar.Separator();
        panel5.add(toolBar$Separator4, new com.intellij.uiDesigner.core.GridConstraints(0, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JToolBar.Separator toolBar$Separator5 = new JToolBar.Separator();
        panel5.add(toolBar$Separator5, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JToolBar.Separator toolBar$Separator6 = new JToolBar.Separator();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel2.add(toolBar$Separator6, gbc);
        final JToolBar.Separator toolBar$Separator7 = new JToolBar.Separator();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel2.add(toolBar$Separator7, gbc);
        final JPanel panel18 = new JPanel();
        panel18.setLayout(new GridBagLayout());
        panel18.setBackground(new Color(-12894399));
        panel18.setForeground(new Color(-12894399));
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panel2.add(panel18, gbc);
        final JPanel panel19 = new JPanel();
        panel19.setLayout(new GridBagLayout());
        panel19.setBackground(new Color(-11775918));
        panel19.setForeground(new Color(-1));
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel18.add(panel19, gbc);
        panel19.setBorder(BorderFactory.createTitledBorder(BorderFactory.createRaisedBevelBorder(), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, this.$$$getFont$$$(null, -1, -1, panel19.getFont()), new Color(-12894399)));
        final JPanel panel20 = new JPanel();
        panel20.setLayout(new GridBagLayout());
        panel20.setBackground(new Color(-13281152));
        panel20.setForeground(new Color(-1));
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panel19.add(panel20, gbc);
        panel20.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        final JLabel label1 = new JLabel();
        Font label1Font = this.$$$getFont$$$("Microsoft YaHei UI", Font.BOLD, 20, label1.getFont());
        if (label1Font != null) label1.setFont(label1Font);
        label1.setForeground(new Color(-1));
        label1.setText("Input");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        panel20.add(label1, gbc);
        button10 = new JButton();
        button10.setBackground(new Color(-12894399));
        Font button10Font = this.$$$getFont$$$("Microsoft YaHei UI", -1, 16, button10.getFont());
        if (button10Font != null) button10.setFont(button10Font);
        button10.setForeground(new Color(-1));
        button10.setText("Clear");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel19.add(button10, gbc);
        textArea1 = new JTextArea();
        textArea1.setBackground(new Color(-11775918));
        Font textArea1Font = this.$$$getFont$$$("Microsoft YaHei UI", -1, 18, textArea1.getFont());
        if (textArea1Font != null) textArea1.setFont(textArea1Font);
        textArea1.setForeground(new Color(-1));
        textArea1.setLineWrap(false);
        textArea1.setText("Enter text");
        textArea1.setToolTipText("");
        textArea1.setWrapStyleWord(false);
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipady = 100;
        panel19.add(textArea1, gbc);
        final JPanel panel21 = new JPanel();
        panel21.setLayout(new GridBagLayout());
        panel21.setBackground(new Color(-11775918));
        panel21.setForeground(new Color(-1));
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panel18.add(panel21, gbc);
        panel21.setBorder(BorderFactory.createTitledBorder(BorderFactory.createRaisedBevelBorder(), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        button11 = new JButton();
        button11.setBackground(new Color(-12894399));
        Font button11Font = this.$$$getFont$$$("Microsoft YaHei UI", -1, 16, button11.getFont());
        if (button11Font != null) button11.setFont(button11Font);
        button11.setForeground(new Color(-1));
        button11.setText("Output As Input");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel21.add(button11, gbc);
        textArea2 = new JTextArea();
        textArea2.setBackground(new Color(-11775918));
        Font textArea2Font = this.$$$getFont$$$("Microsoft YaHei UI", -1, 18, textArea2.getFont());
        if (textArea2Font != null) textArea2.setFont(textArea2Font);
        textArea2.setForeground(new Color(-1));
        textArea2.setLineWrap(false);
        textArea2.setText("");
        textArea2.setWrapStyleWord(false);
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panel21.add(textArea2, gbc);
        final JPanel panel22 = new JPanel();
        panel22.setLayout(new GridBagLayout());
        panel22.setBackground(new Color(-13281152));
        panel22.setForeground(new Color(-1));
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panel21.add(panel22, gbc);
        panel22.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        final JLabel label2 = new JLabel();
        Font label2Font = this.$$$getFont$$$("Microsoft YaHei UI", Font.BOLD, 20, label2.getFont());
        if (label2Font != null) label2.setFont(label2Font);
        label2.setForeground(new Color(-1));
        label2.setText("Output");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        panel22.add(label2, gbc);
        final JToolBar.Separator toolBar$Separator8 = new JToolBar.Separator();
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel18.add(toolBar$Separator8, gbc);
        final JToolBar.Separator toolBar$Separator9 = new JToolBar.Separator();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel18.add(toolBar$Separator9, gbc);
        final JToolBar.Separator toolBar$Separator10 = new JToolBar.Separator();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel2.add(toolBar$Separator10, gbc);
        final JToolBar.Separator toolBar$Separator11 = new JToolBar.Separator();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel2.add(toolBar$Separator11, gbc);
        final JToolBar.Separator toolBar$Separator12 = new JToolBar.Separator();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel2.add(toolBar$Separator12, gbc);
        final JToolBar.Separator toolBar$Separator13 = new JToolBar.Separator();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel2.add(toolBar$Separator13, gbc);
        final JToolBar.Separator toolBar$Separator14 = new JToolBar.Separator();
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(toolBar$Separator14, gbc);
        final JToolBar.Separator toolBar$Separator15 = new JToolBar.Separator();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(toolBar$Separator15, gbc);
    }

    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        Font font = new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
        boolean isMac = System.getProperty("os.name", "").toLowerCase(Locale.ENGLISH).startsWith("mac");
        Font fontWithFallback = isMac ? new Font(font.getFamily(), font.getStyle(), font.getSize()) : new StyleContext().getFont(font.getFamily(), font.getStyle(), font.getSize());
        return fontWithFallback instanceof FontUIResource ? fontWithFallback : new FontUIResource(fontWithFallback);
    }
    
    public JComponent $$$getRootComponent$$$() {
        return panel1;
    }
}
