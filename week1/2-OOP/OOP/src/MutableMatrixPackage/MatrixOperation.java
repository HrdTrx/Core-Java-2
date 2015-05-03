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
public interface MatrixOperation  {
    
    public void withPixel(int x,int y,Pixel[][] matrix);
}
