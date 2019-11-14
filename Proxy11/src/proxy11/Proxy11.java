/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy11;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Santeri
 */
public class Proxy11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Image> lista = new ArrayList<>();
        Image image1 = new ProxyImage("Photo1Kissa");
        Image image2 = new ProxyImage("HiRes_10MB_Photo2");
        lista.add(image1);
        lista.add(image2);
        
        for (Image image : lista) {
            image.showData();
        }
        System.out.println("-------------");
        for (Image image : lista) {
            image.displayImage();
            image.displayImage();
            System.out.println("zzzzzz");
        }

        /*
        image1.displayImage(); // loading necessary
        image1.displayImage(); // loading unnecessary
        image2.displayImage(); // loading necessary
        image2.displayImage(); // loading unnecessary
        image1.displayImage(); // loading unnecessary
        */
    }
    
}
