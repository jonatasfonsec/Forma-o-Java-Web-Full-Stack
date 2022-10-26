package conexaojdbc;

import java.util.List;

import org.junit.Test;

import dao.UserPosDAO;
import model.UserPosJava;



public class TesteBancoJdbc {
	
	//@Test
	public void initBanco() {
		UserPosDAO userPosDAO = new UserPosDAO();
		UserPosJava userposjava = new UserPosJava();
		
		userposjava.setId(5L);
		userposjava.setNome("paulo");
		userposjava.setEmail("paulo@gmail.com");
		
		userPosDAO.salvar(userposjava);
	}
	
	@Test
	public void initListar() {
		UserPosDAO dao = new UserPosDAO();
		
		try {
			List<UserPosJava> list = dao.listar();
			for (UserPosJava userposjava : list) {
				System.out.println(userposjava);
				System.out.println("------------------");
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
