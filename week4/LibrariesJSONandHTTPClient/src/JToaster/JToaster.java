/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JToaster;

import com.nitido.utils.toaster.Toaster;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author root
 */
public class JToaster {
    public static void main(String[] args) throws InterruptedException{
        Toaster toasterManager = new Toaster();
        toasterManager.setToasterWidth(900);
        toasterManager.setToasterHeight(600);
        Image image = new ImageIcon("/root/TestingFiles/dog.jpeg").getImage();
        ImageIcon icon = new ImageIcon("/root/TestingFiles/images.png");
        toasterManager.setBackgroundImage(image);
        System.out.println("Waiting...");
        Thread.sleep(10000);
        toasterManager.showToaster(icon, "Get a little rest will you?");
        
        
        
    }
}
