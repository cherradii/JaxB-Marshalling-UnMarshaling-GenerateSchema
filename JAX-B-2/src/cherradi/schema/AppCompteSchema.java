package cherradi.schema;

import java.io.File;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.SchemaOutputResolver;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;

import cherradi.bo.Compte;

public class AppCompteSchema {
	
	public static void main(String[] args) throws Exception {
		
		JAXBContext context = JAXBContext.newInstance(Compte.class);
		
		context.generateSchema(new SchemaOutputResolver() {
			
			@Override
			public Result createOutput(String namespaceUri, String suggestedFileName) throws IOException {
				File file = new File("Compte.xsd");
				StreamResult result = new StreamResult(file);
				result.setSystemId(file.getName());
				return result;
			}
		});
		

        File file = new File("C:\\Users\\CHERRADI\\eclipse-workspace\\JAX-B-2\\Compte.xsd"); 
          
        if(file.renameTo 
           (new File("C:\\Users\\CHERRADI\\eclipse-workspace\\JAX-B-2\\src\\cherradi\\xml\\Compte.xsd"))) 
        { 
            file.delete(); 
            System.out.println("Schema generated successefully !!!"); 
        } 
        else
        { 
            System.out.println("Oops, Failed to generate schema"); 
        } 
		
	}

}
