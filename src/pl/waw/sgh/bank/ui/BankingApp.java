package pl.waw.sgh.bank.ui;

import javax.swing.*;
import java.awt.*;

public class BankingApp {
    private JTabbedPane tabbedPane1;
    private JPanel mainPanel;

    public JTabbedPane getTabbedPane1() {
        return tabbedPane1;
    }

    public void setTabbedPane1(JTabbedPane tabbedPane1) {
        this.tabbedPane1 = tabbedPane1;
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public void setMainPanel(JPanel mainPanel) {
        this.mainPanel = mainPanel;
    }

    public JTextField getFromAccField() {
        return fromAccField;
    }

    public void setFromAccField(JTextField fromAccField) {
        this.fromAccField = fromAccField;
    }

    public JTextField getToAccField() {
        return toAccField;
    }

    public void setToAccField(JTextField toAccField) {
        this.toAccField = toAccField;
    }

    public JTextField getAmountField() {
        return amountField;
    }

    public void setAmountField(JTextField amountField) {
        this.amountField = amountField;
    }

    public JButton getGoButton() {
        return goButton;
    }

    public void setGoButton(JButton goButton) {
        this.goButton = goButton;
    }

    public JLabel getFromAccLabel() {
        return fromAccLabel;
    }

    public void setFromAccLabel(JLabel fromAccLabel) {
        this.fromAccLabel = fromAccLabel;
    }

    public JLabel getToAccLabel() {
        return toAccLabel;
    }

    public void setToAccLabel(JLabel toAccLabel) {
        this.toAccLabel = toAccLabel;
    }

    public JLabel getAmountLbl() {
        return amountLbl;
    }

    public void setAmountLbl(JLabel amountLbl) {
        this.amountLbl = amountLbl;
    }

    private JTextField fromAccField;
    private JTextField toAccField;
    private JTextField amountField;
    private JButton goButton;
    private JLabel fromAccLabel;
    private JLabel toAccLabel;
    private JLabel amountLbl;
    private JPanel transferPanel;

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

}
