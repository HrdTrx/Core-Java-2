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
public class Grayscale implements MatrixOperation {

    @Override
    public void withPixel(int x, int y, Pixel[][] matrix) {
        
        Pixel pixel = matrix[x][y];
        double grayscale = ((pixel.getR()+ pixel.getG() + pixel.getB())/3);
        pixel.setR(grayscale);
        pixel.setG(grayscale);
        pixel.setB(grayscale);
        
    }
    
}
