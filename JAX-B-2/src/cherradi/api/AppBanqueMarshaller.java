package cherradi.api;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import cherradi.bo.Banque;
import cherradi.bo.Compte;

public class AppBanqueMarshaller {
	
	public static void main(String[] args) throws Exception {
		
		Banque banque = new Banque();
		List<Compte> comptes = new ArrayList<>();

		Compte compte1 = new Compte(1L, 3000, new Date());
		comptes.add(compte1);
		Compte compte2 = new Compte(2L, 7000, new Date());
		comptes.add(compte2);
		Compte compte3 = new Compte(3L, 3500, new Date());
		comptes.add(compte3);
		Compte compte4 = new Compte(4L, 4200, new Date());
		comptes.add(compte4);
		Compte compte5 = new Compte(5L, 21000, new Date());
		comptes.add(compte5);
		
		banque.setComptes(comptes);
		
		JAXBContext context = JAXBContext.newInstance(Banque.class);
		
		Marshaller marshaller = context.createMarshaller();
		
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		marshaller.marshal(banque, new File("C:\\Users\\CHERRADI\\eclipse-workspace\\JAX-B-2\\src\\cherradi\\xml\\Banque.xml"));
		
		
		
	}

}
