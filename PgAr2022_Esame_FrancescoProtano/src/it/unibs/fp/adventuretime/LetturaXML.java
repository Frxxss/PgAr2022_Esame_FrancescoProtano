package it.unibs.fp.adventuretime;
import java.io.FileInputStream;
import java.util.ArrayList;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
/**
 * La classe LetturaXMl legge i file forniti dall'esterno.
 * @author Francesco
 *
 */
public class LetturaXML{
	
	/**
	 * Il metodo leggiMappaXML e' il corpo della classe.
	 * @param filename
	 * @return
	 */
	public static char[][] leggiMappaXML(String filename){
		String tag = "";
		char[][] map = new char [22][31];
		ArrayList<Character> line = new ArrayList<Character>();
 
		XMLInputFactory xmlif  =  null;
		XMLStreamReader xmlr  =  null;
 
		try {
			
			xmlif  =  XMLInputFactory.newInstance();
			xmlr  =  xmlif.createXMLStreamReader(filename, new FileInputStream(filename));
			
		} catch (Exception e) {
			System.out.println("Errore nell'inizializzazione del reader:");
			System.out.println(e.getMessage());
		}
 
		try {
			int row = 0, coll = 0;
			while (xmlr.hasNext()){
 
				switch (xmlr.getEventType()) {
					
					case XMLStreamConstants.START_DOCUMENT: 
						
					break;
				
					case XMLStreamConstants.START_ELEMENT: 
						
						if(xmlr.getLocalName().equals("cell")) {
							line.add(' ');
						}
						tag = xmlr.getLocalName();
					break;
 
					case XMLStreamConstants.END_ELEMENT:
						if(xmlr.getLocalName().equals("row")) {
							if(line.size()==31) {
								for(coll=0;coll<31;coll++) {
									map [row][coll] = line.get(coll).charValue();
								}
								row++;
							}
 
							line.clear();
							
						}
						if(xmlr.getLocalName().equals("row")) {
 
						}
 
						if(xmlr.getLocalName().equals("mappa")) {
							
						}
					break;
					
					case XMLStreamConstants.CHARACTERS:
						if (xmlr.getText().trim().length() > 0) {
							String text=xmlr.getText();						
							switch(tag) {
								case "cell":
									line.set(line.size()-1,text.charAt(0));
								break;
							}
						}					
					break;
				}
 
 
				xmlr.next();
 
				}
		} catch (XMLStreamException e) {
			e.printStackTrace();
		}
		
		return map;
	}
}
