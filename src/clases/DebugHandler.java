
package clases;

import javax.swing.*;
import java.awt.*;

public class DebugHandler {
    private final JLabel debug;
    private final Timer timer;

    public DebugHandler(JLabel debug) {
        this.debug = debug;
        timer = new Timer(0, e -> debug.setText(""));
        timer.setRepeats(false);
    }

    public void showError(String message) {
        debug.setForeground(Color.decode("#EB4151"));
        showMessage(message, 3000);
    }

    public void showWarning(String message) {
        debug.setForeground(Color.decode("#FF9C00"));
        showMessage(message, 2000);
    }

    public void showConfirmation(String message) {
        debug.setForeground(Color.decode("#86D295"));
        showMessage(message, 2000);
    }

    public void showLog(String message) {
        debug.setForeground(Color.decode("#F7F7F7"));
        showMessage(message, 1000);
    }

    private void showMessage(String message, int delay) {
        debug.setText(message);
        timer.setInitialDelay(delay);
        timer.restart();
    }
}

