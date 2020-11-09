package cherradi.api;

import java.io.File;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import cherradi.bo.Compte;

public class AppCompteMarshaller {
	
	public static void main(String[] args) throws Exception {
		
		Compte compte = new Compte(1L, 5000, new Date());
		
		JAXBContext contex = JAXBContext.newInstance(Compte.class);
		
		Marshaller marshaller = contex.createMarshaller();
		
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		marshaller.marshal(compte, new File("C:\\Users\\CHERRADI\\eclipse-workspace\\JAX-B-2\\src\\cherradi\\xml\\compte.xml"));
		
	}

}
