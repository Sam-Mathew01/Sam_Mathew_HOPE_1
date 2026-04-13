package parser;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.*;
import model.Student;
import org.w3c.dom.*;

public class XMLParser {

    public static List<Student> parseXML(String filePath) {
        List<Student> students = new ArrayList<>();

        try {
            File file = new File(filePath);
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document doc = builder.parse(file);
            doc.getDocumentElement().normalize();

            NodeList nodeList = doc.getElementsByTagName("student");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;

                    int id = Integer.parseInt(element.getElementsByTagName("id").item(0).getTextContent());
                    String name = element.getElementsByTagName("name").item(0).getTextContent();
                    int age = Integer.parseInt(element.getElementsByTagName("age").item(0).getTextContent());

                    students.add(new Student(id, name, age));
                }
            }

        } catch (Exception e) {
           System.out.println("Error: " + e.getMessage());
           e.printStackTrace();
        }

        return students;
    }
}