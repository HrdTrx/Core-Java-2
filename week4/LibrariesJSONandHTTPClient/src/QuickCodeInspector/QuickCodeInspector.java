/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuickCodeInspector;


import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import syntaxhighlight.SyntaxHighlighter;
import syntaxhighlighter.SyntaxHighlighterParser;
import syntaxhighlighter.brush.*;
import syntaxhighlighter.example.Example;
import syntaxhighlighter.theme.*;


/**
 *
 * @author root
 */
public class QuickCodeInspector {
    public static void main(String[] args){
        
        SyntaxHighlighterParser parser = new SyntaxHighlighterParser(new BrushJava());
        SyntaxHighlighter highlighter = new SyntaxHighlighter(parser,new ThemeRDark());
        
        
       highlighter.setFirstLine(1);
       highlighter.setHighlightedLineList(Arrays.asList(13, 27, 28, 38, 42, 43, 53));
        
        try {
          highlighter.setContent(new File(args[0]));
        } catch (IOException ex) {
          Logger.getLogger(Example.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(highlighter);
        frame.setLocationByPlatform(true);
        frame.pack();
        frame.setVisible(true);
    }
}
