package cherradi.api;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import cherradi.bo.Compte;

public class AppCompteUnMarshaller {
	
	public static void main(String[] args) throws Exception{
		
		JAXBContext context = JAXBContext.newInstance(Compte.class);
		
		Unmarshaller unmarshaller = context.createUnmarshaller();
		
		Compte compte = (Compte) unmarshaller.unmarshal(new File("C:\\Users\\CHERRADI\\eclipse-workspace\\JAX-B-2\\src\\cherradi\\xml\\compte.xml"));
		
		System.out.println(compte.getCode()+"---"+compte.getSolde()+"---"+compte.getDateCreation());
		
	}

}
