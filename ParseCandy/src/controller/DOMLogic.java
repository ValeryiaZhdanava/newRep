package controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import entity.Candy;

public class DOMLogic {
    public static void main(String[] args) {
	try {

	    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
	    DocumentBuilder db = dbf.newDocumentBuilder();

	    Document document = db.parse(new File("Candynew.xml"));

	    Element root = document.getDocumentElement();

	    ArrayList<Candy> candys = Analizer.listBuilder(root);
	    for (int i = 0; i < candys.size(); i++) {
		System.out.println(candys.get(i));
	    }
	} catch (SAXException e) {
	    e.printStackTrace();
	    System.out.print("ошибка SAX парсера");
	} catch (ParserConfigurationException e) {
	    e.printStackTrace();
	    System.out.print("ошибка конфигурации");
	} catch (IOException e) {
	    e.printStackTrace();
	    System.out.print("ошибка I/О потока");
	}
    }
}
