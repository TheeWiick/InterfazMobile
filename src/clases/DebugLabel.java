
package clases;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DebugLabel extends JLabel {
    private Timer timer;
    private String[] messages;
    private Color[] colors;
    private int durations[];
    private int currentIndex;

    public DebugLabel() {
        timer = new Timer(0, null);
        timer.setRepeats(false);
    }

    public void showMessages(String[] messages, Color[] colors, int[] durations) {
        this.messages = messages;
        this.colors = colors;
        this.durations = durations;
        currentIndex = 0;
        showNextMessage();
    }

    private void showNextMessage() {
        if (currentIndex < messages.length) {
            setText(messages[currentIndex]);
            setForeground(colors[currentIndex]);

            timer.setInitialDelay(durations[currentIndex]);
            timer.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    setText("");
                    currentIndex++;
                    showNextMessage();
                }
            });

            timer.restart();
        }
    }
}

