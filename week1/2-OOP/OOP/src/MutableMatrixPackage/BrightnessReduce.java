/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MutableMatrixPackage;
import MutableMatrixPackage.Matrix.Pixel;

/**
 *
 * @author root
 */
public class BrightnessReduce implements MatrixOperation {

    @Override
    public void withPixel(int x, int y,Pixel[][] matrix) {
        
        Pixel pixel = matrix[x][y];
        pixel.setR(pixel.getR()*0.8);
        pixel.setG(pixel.getG()*0.8);
        pixel.setB(pixel.getB()*0.8);  
        
    }



    
}
