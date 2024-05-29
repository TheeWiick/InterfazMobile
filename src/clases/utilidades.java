package clases;

import java.awt.Dimension;
import java.awt.Image;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import com.opencsv.CSVWriter;
import java.io.BufferedReader;
import java.io.FileReader;



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
    public static void readFile(String[] args) {
	try {
            FileReader fileReader = new FileReader("src/archivoscsv/archivo.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            String line;
            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
		bufferedReader.close();
            } catch (IOException e) {
        }
    }   
}
    