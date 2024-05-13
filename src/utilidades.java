
import java.awt.Dimension;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
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
                BufferedReader bufferedReader = new BufferedReader(fileReader); // Connect the FileReader to the BufferedReader

                String line;
                while((line = bufferedReader.readLine()) != null) {
                    System.out.println(line); // Display the file's contents on the screen, one line at a time
                    }

                bufferedReader.close(); // Close the stream
          } catch (Exception e) {
                e.printStackTrace();
        }
    }

//public static void WriteFile(){
//try {
//            File file = new File("file.txt");
//            FileWriter fileReader = new FileWriter(file); // A stream that connects to the text file
//            BufferedWriter bufferedWriter = new BufferedWriter(fileReader); // Connect the FileWriter to the BufferedWriter
//
//            for (String s : list) {
//                bufferedWriter.write(s + "\n");
//            }
//
//            bufferedWriter.close (); // Close the stream
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}

