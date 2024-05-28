
package clases;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DebugLabel extends JLabel {
    private final Timer timer;
    private final String[] messages;
    private final Color[] colors;
    private final int durations[];
    private int currentIndex;

    public DebugLabel() {
        timer = new Timer(0, null);
        timer.setRepeats(false);
        messages = new String[]{
            "No se encontró el archivo de preguntas",
            "Error en la estructura del archivo de preguntas",
            "Algunas preguntas están vacías",
            "No se pudo crear el archivo de preguntas",
            "Este simulador no tiene preguntas",
            "Las preguntas se guardaron, pero no se pudo comprimir el simulador",
            "Las preguntas han sido cargadas con éxito",
            "Las preguntas han sido guardadas",
            "Las preguntas se guardaron y se exportó el simulador",
            "Pregunta añadida",
            "Pregunta eliminada"
        };

        colors = new Color[]{
            new Color(0xEB4151),
            new Color(0xEB4151),
            new Color(0xEB4151),
            new Color(0xEB4151),
            new Color(0xFF9C00),
            new Color(0xFF9C00), 
            new Color(0x86D295), 
            new Color(0x86D295), 
            new Color(0x86D295), 
            new Color(0xF7F7F7), 
            new Color(0xF7F7F7) 
        };

        durations = new int[] {
            3000,
            3000,
            3000,
            3000,
            2000,
            2000,
            2000,
            2000,
            2000,
            1000,
            1000
        };
    }

    public void showMessages(int numeroMensaje) {
            setText(messages[numeroMensaje]);
            setForeground(colors[numeroMensaje]);

            timer.setInitialDelay(durations[numeroMensaje]);
            timer.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    setText("");
                }
            });

            timer.restart();
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

