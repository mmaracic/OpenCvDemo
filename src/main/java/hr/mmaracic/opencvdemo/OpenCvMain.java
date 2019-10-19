/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.mmaracic.opencvdemo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;

/**
 *
 * @author Marijo
 */
public class OpenCvMain{

    public static void main(String[] args) {
        // load the native OpenCV library
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        
        //substring 1 to remove leading "/"
        String fileName = ClassLoader.getSystemClassLoader().getResource("lena.png").getFile().substring(1);
        Mat img = Imgcodecs.imread(fileName);
        if (img.width() == 0 && img.height() ==0){
            throw new IllegalArgumentException("Incorrect path, dimensions of the image are 0");
        }
        Image i = Util.toBufferedImage(img);
        Graphics g = i.getGraphics();
        g.setColor(Color.red);
        g.drawOval(i.getWidth(null)/2, i.getHeight(null)/2, 10, 10);
        Util.displayImage(i, "Lena image");
    }

}
