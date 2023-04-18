package me.mouad.second;

import javax.swing.*;
import java.awt.*;

public class ClientForm extends JFrame {

    public ClientForm() {
        super("Formulaire client");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final JPanel mainPanel = new JPanel(new BorderLayout());

        final JPanel leftPanel = new JPanel(),
                rightPanel = new JPanel();

        final JLabel idLabel = new JLabel("No client:"),
                lastNameLabel = new JLabel("Nom client:"),
                firstNameLabel = new JLabel("Prénom client:"),
                addressLabel = new JLabel("Adresse client:"),
                address2Label = new JLabel("Adresse 2 client:"),
                ageLabel = new JLabel("Age client:"),
                phoneLabel = new JLabel("No tel client:");

        final JTextField idTextField = new JTextField(20),
                firstNameTextField = new JTextField(20),
                lastNameTextField = new JTextField(20),
                addressTextField = new JTextField(20),
                address2TextField = new JTextField(20),
                ageTextField = new JTextField(20),
                phoneTextField = new JTextField(20);
        final JButton submitButton = new JButton("Envoyer");

        final GroupLayout leftLayout = new GroupLayout(leftPanel);
        leftPanel.setLayout(leftLayout);
        leftLayout.setAutoCreateGaps(true);
        leftLayout.setAutoCreateContainerGaps(true);
        leftLayout.setHorizontalGroup(leftLayout.createSequentialGroup()
                .addGroup(leftLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(idLabel)
                        .addComponent(firstNameLabel)
                        .addComponent(lastNameLabel)
                        .addComponent(addressLabel)
                        .addComponent(submitButton))
                .addGroup(leftLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(idTextField)
                        .addComponent(firstNameTextField)
                        .addComponent(lastNameTextField)
                        .addComponent(addressTextField)
                        .addComponent(submitButton)));

        leftLayout.setVerticalGroup(leftLayout.createSequentialGroup()
                .addGroup(leftLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(idLabel)
                        .addComponent(idTextField))
                .addGroup(leftLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(lastNameLabel)
                        .addComponent(lastNameTextField))
                .addGroup(leftLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(firstNameLabel)
                        .addComponent(firstNameTextField))
                .addGroup(leftLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(addressLabel)
                        .addComponent(addressTextField))
                .addComponent(submitButton));

        final GroupLayout rightLayout = new GroupLayout(rightPanel);
        rightPanel.setLayout(rightLayout);
        rightLayout.setAutoCreateGaps(true);
        rightLayout.setAutoCreateContainerGaps(true);
        rightLayout.setHorizontalGroup(rightLayout.createSequentialGroup()
                .addGroup(rightLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(address2Label)
                        .addComponent(ageLabel)
                        .addComponent(phoneLabel))
                .addGroup(rightLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(address2TextField)
                        .addComponent(ageTextField)
                        .addComponent(phoneTextField)
                ));

        rightLayout.setVerticalGroup(rightLayout.createSequentialGroup()
                .addGroup(rightLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(address2Label)
                        .addComponent(address2TextField))
                .addGroup(rightLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(ageLabel)
                        .addComponent(ageTextField))
                .addGroup(rightLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(phoneLabel)
                        .addComponent(phoneTextField)));

        mainPanel.add(leftPanel, BorderLayout.WEST);
        mainPanel.add(rightPanel, BorderLayout.EAST);

        getContentPane().add(mainPanel);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ClientForm();
    }
}

