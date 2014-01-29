/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package id3tageditor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniel
 */
public class ID3TagEditor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            file("01_Politik.mp3");
        } catch (IOException ex) {
            Logger.getLogger(ID3TagEditor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void file(String name) throws IOException {
        Path path = Paths.get(name);
        byte[] data = Files.readAllBytes(path);
        
        System.out.println(data[0] + " " + data[1] + " " + data[2]);
    }
    
    public static void flags() {
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = true;
        
        byte b = 0;
        
        if (b1)
            b += 0b1000;
        if (b2)
            b += 0b0100;
        if (b3)
            b += 0b0010;
        if (b4)
            b += 0b0001;
        
        System.out.println(b);
    }
    
}
