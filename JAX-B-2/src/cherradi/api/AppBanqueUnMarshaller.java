package cherradi.api;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import cherradi.bo.Banque;
import cherradi.bo.Compte;

public class AppBanqueUnMarshaller {
	
	public static void main(String[] args) throws Exception {
		
		JAXBContext context = JAXBContext.newInstance(Banque.class);
		
		Unmarshaller unmarshaller = context.createUnmarshaller();
		
		Banque banque = (Banque) unmarshaller.unmarshal(new File("C:\\Users\\CHERRADI\\eclipse-workspace\\JAX-B-2\\src\\cherradi\\xml\\Banque.xml"));
		
		List<Compte> comptes = banque.getComptes();
		
		for (Compte compte : comptes) {
			System.out.println(compte.getCode()+"---"+compte.getSolde()+"---"+compte.getDateCreation()+"\n");
		}
		
	}

}
