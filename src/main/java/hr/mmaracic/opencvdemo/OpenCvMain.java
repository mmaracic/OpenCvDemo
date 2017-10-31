/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.mmaracic.opencvdemo;

import java.awt.Image;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import static org.opencv.imgcodecs.Imgcodecs.CV_LOAD_IMAGE_COLOR;

/**
 *
 * @author Marijo
 */
public class OpenCvMain{

    public static void main(String[] args) {
        // load the native OpenCV library
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        
        String fileName = ClassLoader.getSystemClassLoader().getResource("lena.png").getFile();
        Mat img = Imgcodecs.imread(fileName, CV_LOAD_IMAGE_COLOR);
        Image javaImg = Util.toBufferedImage(img);
        Util.displayImage(javaImg);
    }

}
