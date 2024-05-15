import java.awt.Dimension;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Wick
 */
    public class utilidades {
            public static void SetImageLabel(JLabel labelName, String root){
            ImageIcon image = new ImageIcon(root);
            Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_SMOOTH));
            labelName.setIcon(icon);
            labelName.repaint();
        }
        
    public static void SetImageLabel(JLabel labelName, String root, Dimension dimension){
                ImageIcon image = new ImageIcon(root);
                Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth()+ dimension.width, labelName.getHeight()+ dimension.height, Image.SCALE_SMOOTH));
                labelName.setIcon(icon);
                labelName.repaint();
            }

    public static void ReadFile() {
            try {
                File file = new File("file.csv");
                FileReader fileReader = new FileReader(file); // A stream that connects to the text file
                try (BufferedReader bufferedReader = new BufferedReader(fileReader) // Connect the FileReader to the BufferedReader
                ) {
                    String line;
                    while ((line = bufferedReader.readLine()) != null) {
                        System.out.println(line); // Display the file's contents on the screen, one line at a time
                    }
                    // Close the stream
                }
          } catch (IOException e) {
        }
    }

    public static void writeFile(String texto) {
        try {
            File file = new File("src/file.csv");
            FileWriter fileWriter = new FileWriter(file, true); // Append mode
            try (BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
                bufferedWriter.write(texto); // Escribir el texto en el archivo
                bufferedWriter.newLine(); // Nueva línea para el próximo texto
            } // Escribir el texto en el archivo
            
            System.out.println("Texto guardado en file.csv.");
        } catch (IOException e) {
        }
    }
}

