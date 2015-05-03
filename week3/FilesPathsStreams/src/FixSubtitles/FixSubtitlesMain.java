/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FixSubtitles;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author root
 */
public class FixSubtitlesMain {
    public static void main(String[] args) throws IOException{
       Path testingFourthPath = Paths.get("/root/TestingFiles/FirstTry.srt");
       new FixEncodingUtil().fixEncoding(testingFourthPath);
    }
}
