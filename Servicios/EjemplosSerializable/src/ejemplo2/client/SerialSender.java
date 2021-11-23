package ejemplo2.client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import ejemplo2.serializable.Bean;

public class SerialSender {
	
	public static void main(String[] args) {
		
		HttpURLConnection conHTTP = null;
		ObjectOutputStream out;
		
		//CREACI�N DEL BEAN
		String[] objetos = new String[3];
		objetos[0] = "Espada";
		objetos[1] = "Escudo";
		objetos[2] = "Casco";
		
		Bean bean = new Bean("Iker", 23, objetos);
		URL url;
		
		try {
			
			//GENERAR CONEXI�N
			url = new URL("http://172.16.1.10:8080/SerializedCommunication/DemoServlet");
			conHTTP = (HttpURLConnection) url.openConnection();
			conHTTP.setRequestMethod("POST");
			conHTTP.setDoOutput(true);
			conHTTP.setDoInput(true);
			
			//OUTPUT
			out = new ObjectOutputStream(conHTTP.getOutputStream());
			out.writeObject(bean);
			out.close();
			
			//INPUT DE REGRESO DESDE EL SERVER
			ObjectInputStream ois = new ObjectInputStream(conHTTP.getInputStream());
			Bean beanReconstruido;
			beanReconstruido = (Bean) ois.readObject(); //DESERIALIZACI�N
			
			System.out.println(beanReconstruido.getName());
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}