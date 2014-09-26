package controller;

import java.io.IOException;
import java.util.ArrayList;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import entity.Candy;
import entity.Ingredients;

public class Analizer {
	public static ArrayList<Candy> listBuilder(Element root)
			throws SAXException, IOException {
		ArrayList<Candy> candys = new ArrayList<Candy>();
		NodeList candysNodes = root.getElementsByTagName("tns:candy");
		Candy candy = null;
		for (int i = 0; i < candysNodes.getLength(); i++) {
			candy = new Candy();
			Element candyElement = (Element) candysNodes.item(i);
			// candy.setType(candyElement.getAttribute("tns:type"));
			candy.setName(getElementTextContent(candyElement, "tns:name"));
			candy.setProduction(getElementTextContent(candyElement,
					("tns:production")));
			candy.setEnergy(getElementTextContent(candyElement, "tns:energy"));
			candy.setType(candyElement.getAttribute("Type"));

			Ingredients ingr = new Ingredients();
			ingr = candy.getIngredients();
			Element ingrElement = (Element) candyElement.getElementsByTagName(
					"tns:ingredients").item(0);

			ingr.setFructose(getElementTextContent(ingrElement, "tns:fructose"));
			ingr.setSugar(getElementTextContent(ingrElement, "tns:sugar"));
			ingr.setVanilin(getElementTextContent(ingrElement, "tns:vanilin"));

			// Integer ingrSugar = Integer.parseInt(getElementTextContent(
			// candyElement, "tns:sugar"));

			candys.add(candy);
		}
		return candys;
	}

	private static Element getElementText(Element parent, String childName) {
		NodeList nlist = parent.getElementsByTagName(childName);
		Element child = (Element) nlist.item(0);
		return child;
	}

	private static String getElementTextContent(Element parent, String childName) {
		Element child = getElementText(parent, childName);
		Node node = child.getFirstChild();
		String value = node.getNodeValue();
		return value;
	}
}
