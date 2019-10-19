package tratamentoExeption.com;

import java.io.IOException;


public class PrincipalExepiton {
	
	
	public void fazeralgo() throws Exception{
		throw new IOException();
	}
	
	public void m2() {
		try {
			fazeralgo();
		}catch (IOException e) {
			
			
		}catch (Exception e) {
			
		}
	}
}
