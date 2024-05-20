package clases;

import java.awt.Dimension;
import java.awt.Image;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import com.opencsv.CSVWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
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

    public static void writeFile(String texto, String[] datos) {
        try {
            FileWriter writer = new FileWriter("src/archivoscsv/archivo.csv", true); 
            try (CSVWriter csvWriter = new CSVWriter(writer)) {
                csvWriter.writeNext(datos);
            }
            System.out.println("Datos guardados exitosamente en el archivo CSV.");
        } catch (IOException e) {
        }
    }
//public String writeAllLines() throws Exception {
//    Path path = Paths.get(
//      ClassLoader.getSystemResource("src/archivoscsv/archivo.csv").toURI()
//    ); 
//    return utilidades.writeAllLines(Helpers.fourColumnCsvString(), path);
//}    


//////    private void crearArchivoCSV() {
//////        try (FileWriter writer = new FileWriter("preguntas.csv")) {
//////            writer.append("Pregunta,Opción 1,Opción 2,Opción 3,Opción 4,Respuesta correcta\n");
//////            for (preguntas panel : preguntas) {
//////                String pregunta = panel.getPregunta();
//////                String[] opciones = panel.getOpciones();
//////                int respuestaCorrecta = panel.getRespuestaCorrecta();
//////                writer.append(String.format("%s,%s,%s,%s,%s,%d\n",
//////                        pregunta,
//////                        opciones[0],
//////                        opciones[1],
//////                        opciones[2],
//////                        opciones[3],
//////                        respuestaCorrecta + 1 // Ajustar índice para que sea 1-based en lugar de 0-based
//////                ));
//////            }
//////            JOptionPane.showMessageDialog(this, "Archivo CSV creado con éxito.");
//////        } catch (IOException e) {
//////            JOptionPane.showMessageDialog(this, "Error al crear el archivo CSV: " + e.getMessage());
//////        }
//////    }
//////    
    }
    