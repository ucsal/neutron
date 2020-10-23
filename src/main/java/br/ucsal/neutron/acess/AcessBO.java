package br.ucsal.neutron.acess;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

import br.ucsal.neutron.user.User;
import br.ucsal.neutron.user.UserDAO;

public class AcessBO {
	
	private UserDAO dao = new UserDAO();

	public User login(String username, String password) {
		MessageDigest digest;
		String senha = "";
		try {
			digest = MessageDigest.getInstance("MD5");
			byte[] cripto = digest.digest(password.getBytes(StandardCharsets.UTF_8));
			senha = new BigInteger(1,digest.digest("root".getBytes(StandardCharsets.UTF_8))).toString(16);
			System.out.println(senha);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dao.buscarLogin(username,senha);

	}
//63a9f0ea7bb98050796b649e85481845
//63a9f0ea7bb98050796b649e85481845
	public static void main(String[] args) throws Exception {
		MessageDigest digest = MessageDigest.getInstance("MD5");
		byte[] cripto = digest.digest("root".getBytes(StandardCharsets.UTF_8));
		String md5 = new BigInteger(1,digest.digest("root".getBytes(StandardCharsets.UTF_8))).toString(16);
		System.out.println(md5);
		System.out.println(Arrays.toString(cripto));
	}
	
	
}
