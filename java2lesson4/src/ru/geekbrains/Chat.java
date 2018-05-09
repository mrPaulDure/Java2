package ru.geekbrains;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Chat extends JFrame {
    private JPanel top = new JPanel();
    private JPanel bot = new JPanel();
    private JTextArea chat = new JTextArea();
    private JButton sendButton = new JButton("Send");
    private JTextField msg = new JTextField(35);



    public Chat() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(Color.darkGray);
        setTitle("Chat");
        setBounds(500, 300, 500, 500);
        setResizable(false);

        this.top.setBackground(Color.white);
        add(this.top, BorderLayout.CENTER);
        add(this.bot, BorderLayout.SOUTH);
        this.top.add(chat);
        this.bot.add(this.msg);
        this.bot.add(this.sendButton);

        this.sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMsg();

            }
        });
        this.msg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMsg();
            }
        });

        setVisible(true);
    }

    public void sendMsg() {
        if (!this.msg.getText().isEmpty()) {
            this.chat.append(this.msg.getText() + "\n");
            this.msg.setText("");
            this.msg.grabFocus();
        }
    }

}
