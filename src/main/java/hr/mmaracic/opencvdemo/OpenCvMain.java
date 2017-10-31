/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.mmaracic.opencvdemo;

import org.opencv.core.Core;

/**
 *
 * @author Marijo
 */
public class OpenCvMain{

    public static void main(String[] args) {
        // load the native OpenCV library
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }

}
