import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

public class StudentXML {
    public static void main(String[] args) {
        try {
            File input = new File("student_record.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(input);

            System.out.println("Root element: " +
                    doc.getDocumentElement().getNodeName());
            NodeList personList = doc.getElementsByTagName("student");
            for (int i = 0; i < personList.getLength(); i++) {
                Node node = personList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    System.out.println("ID: " + element.getAttribute("id"));
                    System.out.println("First Name: " + element
                            .getElementsByTagName("firstname")
                            .item(0)
                            .getTextContent());
                    System.out.println("Last Name: " + element
                            .getElementsByTagName("lastname")
                            .item(0)
                            .getTextContent());
                    System.out.println("GPA: " + element
                            .getElementsByTagName("gpa")
                            .item(0)
                            .getTextContent());
                    System.out.println("Major: " + element
                            .getElementsByTagName("major")
                            .item(0)
                            .getTextContent());
                    System.out.println();
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}