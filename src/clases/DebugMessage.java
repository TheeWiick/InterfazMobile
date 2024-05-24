/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class DebugMessage {

    public JFrame frame;
    public JLabel messageLabel;

    public DebugMessage() {
        frame = new JFrame("Debug Messages");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 100);
        frame.setLocationRelativeTo(null);

        messageLabel = new JLabel("", SwingConstants.CENTER);
        messageLabel.setOpaque(true);
        messageLabel.setFont(new Font("Arial", Font.BOLD, 16));
        frame.add(messageLabel);

        frame.setVisible(true);
    }

    public void showMessage(String type, String message) {
        int displayTime = 1000;

        switch (type.toLowerCase()) {
            case "error":
                messageLabel.setBackground(Color.decode("#EB4151"));
                displayTime = 3000;
                break;
            case "warning":
                messageLabel.setBackground(Color.decode("#FF9C00"));
                displayTime = 2000;
                break;
            case "confirmation":
                messageLabel.setBackground(Color.decode("#86D295"));
                displayTime = 2000;
                break;
            case "log":
                messageLabel.setBackground(Color.decode("#F7F7F7"));
                messageLabel.setForeground(Color.BLACK);
                displayTime = 1000;
                break;
            default:
                messageLabel.setBackground(Color.GRAY);
                displayTime = 1000;
        }

        messageLabel.setText(message);
        messageLabel.setVisible(true);

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                messageLabel.setVisible(false);
            }
        }, displayTime);
    }    
}   
