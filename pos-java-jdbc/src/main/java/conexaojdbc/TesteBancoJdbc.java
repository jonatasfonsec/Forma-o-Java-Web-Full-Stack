package conexaojdbc;

import org.junit.Test;

import dao.UserPosDAO;

import model.UserPosJava;



public class TesteBancoJdbc {
	
	@Test
	public void initBanco() {
		UserPosDAO userPosDAO = new UserPosDAO();
		UserPosJava userposjava = new UserPosJava();
		
		userposjava.setId(5L);
		userposjava.setNome("paulo");
		userposjava.setEmail("paulo@gmail.com");
		
		userPosDAO.salvar(userposjava);
	}
	
}
