package com.souche;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.junit.Test;

import java.util.List;

import static junit.framework.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     * Rigourous Test :-)
     */
    @Test
    public void testApp()
    {
        System.out.println(111);
        assertTrue( true );
    }

    public static void main(String[] args) throws DocumentException {
//        Document document = DocumentHelper.createDocument();
//        Element root = document.addElement("root");
//        Element sub = root.addElement("sub");
//        sub.addAttribute("a","123");
//        sub.addAttribute("b","1");
//        sub.addCDATA("i am ketingli");
//        System.out.println(document.asXML());

        String input = "<xml><ToUserName><![CDATA[gh_95753847d0ac]]></ToUserName>\n" +
                "<FromUserName><![CDATA[odfQKtzWnnsy3f7haoRam5NuXxCE]]></FromUserName>\n" +
                "<CreateTime>1491553282</CreateTime>\n" +
                "<MsgType><![CDATA[event]]></MsgType>\n" +
                "<Event><![CDATA[CLICK]]></Event>\n" +
                "<EventKey><![CDATA[经济人]]></EventKey>\n" +
                "</xml>";
        Document document = DocumentHelper.parseText(input);
        Element xmlElement = document.getRootElement();

        Element toUserElement = xmlElement.element("FromUserName");
        System.out.printf("FromUserName=" + toUserElement.getText());


        List<Element> list = xmlElement.elements();
        for (Element e : list) {
            System.out.println(e.getText());
        }

    }
}
