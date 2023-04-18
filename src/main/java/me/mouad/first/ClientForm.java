package me.mouad.first;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class ClientForm extends JFrame implements ActionListener {

    private final JPanel cards;
    private final CardLayout cardLayout;
    private final JButton firstButton, previousButton, nextButton, lastButton;

    public ClientForm() {
        super("Formulaire Client");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        firstButton = new JButton("First");
        previousButton = new JButton("Previous");
        nextButton = new JButton("Next");
        lastButton = new JButton("Last");

        firstButton.addActionListener(this);
        previousButton.addActionListener(this);
        nextButton.addActionListener(this);
        lastButton.addActionListener(this);

        final JTextField idField = new JTextField(20),
                lastNameField = new JTextField(20),
                firstNameField = new JTextField(20),
                addressField = new JTextField(20);

        final JLabel idLabel = new JLabel("No client:"),
                lastNameLabel = new JLabel("Nom de client:"),
                firstNameLabel = new JLabel("Prénom de client:"),
                addressLabel = new JLabel("Adresse de client:");

        cardLayout = new CardLayout();
        cards = new JPanel(cardLayout);

        cards.add(createCardComponent(idLabel, BorderLayout.WEST), "--");
        cards.add(createCardComponent(idField, BorderLayout.CENTER), "--");

        cards.add(createCardComponent(lastNameLabel, BorderLayout.WEST), "--");
        cards.add(createCardComponent(lastNameField, BorderLayout.CENTER), "-- ");

        cards.add(createCardComponent(firstNameLabel, BorderLayout.WEST), " --");
        cards.add(createCardComponent(firstNameField, BorderLayout.CENTER), " --");

        cards.add(createCardComponent(addressLabel, BorderLayout.WEST), "--");
        cards.add(createCardComponent(addressField, BorderLayout.CENTER), " --");

        add(cards, BorderLayout.CENTER);

        final JPanel buttonPanel = new JPanel(new FlowLayout());

        buttonPanel.add(firstButton);
        buttonPanel.add(previousButton);
        buttonPanel.add(nextButton);
        buttonPanel.add(lastButton);

        add(buttonPanel, BorderLayout.NORTH);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private JPanel createCardComponent(JComponent component, String layout) {
        final JPanel cardPanel = new JPanel(new BorderLayout());
        cardPanel.add(component, layout);
        cardPanel.setBorder(BorderFactory.createTitledBorder(""));
        return cardPanel;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == firstButton)
            cardLayout.first(cards);
        else if (e.getSource() == previousButton)
            cardLayout.previous(cards);
        else if (e.getSource() == nextButton)
            cardLayout.next(cards);
        else if (e.getSource() == lastButton)
            cardLayout.last(cards);
    }

    public static void main(String[] args) {
        new ClientForm();
    }
}