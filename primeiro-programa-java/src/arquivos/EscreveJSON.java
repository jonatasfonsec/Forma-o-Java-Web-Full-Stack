package arquivos;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class EscreveJSON {

	public static void main(String[] args) throws IOException {

		Usuario usuario1 = new Usuario();
		usuario1.setCpf("651651651");
		usuario1.setLogin("joao");
		usuario1.setSenha("123456");
		
		Usuario usuario2 = new Usuario();
		usuario2.setCpf("989891981");
		usuario2.setLogin("maria");
		usuario2.setSenha("654321");
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
				
		String jsonUser = gson.toJson(usuarios);
		
		System.out.println(jsonUser);
		
		FileWriter fileWriter = new FileWriter("C:\\Users\\Jonatas\\git\\repository\\primeiro-programa-java\\src\\arquivos\\arquivo.json");
		
		fileWriter.write(jsonUser);
		fileWriter.flush();
		fileWriter.close();
		
	}

}
