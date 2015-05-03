/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MutableMatrixPackage;

import java.util.Random;

/**
 *
 * @author root
 */
public class Matrix  {
    
    private int height;
    private int width;
    private Pixel[][] matrix;
    
    public class Pixel{
        public double r;
        public double g;
        public double b;
        
        public Pixel(double r,double g,double b){
          this.r = r;
          this.g = g;
          this.b = b;
        }

        public double getR() {
            return r;
        }

        public double getG() {
            return g;
        }

        public double getB() {
            return b;
        }

        public void setR(double r) {
            this.r = r;
        }

        public void setG(double g) {
            this.g = g;
        }

        public void setB(double b) {
            this.b = b;
        }
        

        @Override
        public String toString() {
            return "Pixel{" + "r=" + r + ", g=" + g + ", b=" + b + '}';
        }
        
        
    }
    
    public Matrix(int height,int width){
        this.height = height;
        this.width = width;
        this.matrix = new Pixel[height][width];
        for(int i = 0; i < height ; i++){
            for(int j = 0; j < width; j++){
               Random random = new Random();
               int r = random.nextInt(256);
               int g = random.nextInt(256);
               int b = random.nextInt(256);
               Pixel randomElement = new Pixel(r,g,b);
               this.matrix[i][j] = randomElement;
            }
        }
        
    }
    
    public void operate(MatrixOperation op){
        for(int i = 0; i < height ; i++){
            for(int j = 0; j < width; j++){
             op.withPixel(i,j,matrix);
            }
        }
    }
    
    @Override
    public  String toString(){
        String separator = " ";
        StringBuilder result = new StringBuilder();
        for(int i = 0 ; i < height; i++){
            for(int j = 0 ; j < width;j++){
                result.append(matrix[i][j]);
                result.append(separator);
            }
            result.setLength(result.length()- separator.length());
            result.append("\n");
        }
        return result.toString();
    }
    

    
    
    public static void main(String[] args){
        Pixel[][] array = new Pixel[5][6];
        Matrix D = new Matrix(5,6);
        System.out.println(D.toString());
        
        
       //D.operate(new BrightnessReduce());
       //System.out.println(D.toString());
       
       D.operate(new Grayscale());
       System.out.println(D.toString());

  
      
       
        
        
    }
}


