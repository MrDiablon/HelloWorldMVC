package helloworldmvc.model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Model implements IModel {

	@Override
	public String getMessage() {
		
		String filePath = "D:\\cours\\CNAM\\1erAnnee\\System Exploitation\\projetGradle\\HelloWorldMVC\\HelloWorldMVC\\Model\\src\\main\\resources\\helloworldmvc\\model\\message.txt";
		try(FileInputStream fis=new FileInputStream(filePath); InputStreamReader isr=new InputStreamReader(fis);  BufferedReader br=new BufferedReader(isr))
		{
			return br.readLine();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return null;
		/*List<String> lines = null;
		try {
			lines = Files.readAllLines(Paths.get(filePath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		StringBuilder builder = new StringBuilder();
		
		for (String line : lines) {
			builder.append(line);
		}
		
		return builder.toString();*/
	}

}
