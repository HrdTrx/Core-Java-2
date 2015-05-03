/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebsiteCrawler;

/**
 *
 * @author root
 */
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Crawler
{
    private List<String> links = new LinkedList<>();
    private Document htmlDocument;


    
    public boolean crawl(String url)
    {
        try
        {
            Connection connection = Jsoup.connect(url);
            Document htmlDocument = connection.get();
            this.htmlDocument = htmlDocument;
           
            Elements linksOnPage = htmlDocument.select("a[href]");
            
            for(Element link : linksOnPage)
            {
                
                this.links.add(link.absUrl("href"));
                
                
            }
            return true;
        }
        catch(IOException ioe)
        {
            return false;
        }
    }


    public boolean searchForWord(String searchWord)
    {
        
        if(this.htmlDocument == null)
        {
            return false;
        }
        
        String bodyText = this.htmlDocument.body().text();
        return bodyText.toLowerCase().contains(searchWord.toLowerCase());
    }


    public List<String> getLinks()
    {
        return this.links;
    }

}
