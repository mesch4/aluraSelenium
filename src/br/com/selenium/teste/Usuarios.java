package br.com.selenium.teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Usuarios {
	
	private ChromeDriver driver;

	@Before
	public void start() {
		System.setProperty("webdriver.chrome.driver", "C:\\workspace\\drivers\\chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.get("http://localhost:8080/usuarios/new");
	}

	@Test
	public void deveAdicionarUmUsuario() {

		UsuariosPage usuarios = new UsuariosPage(driver);
		usuarios.novo().cadastra("Messias", "messias@teste.com");
		
		assertTrue(usuarios.existeNaListagem("Messias", "messias@teste.com"));
		
		}

	@After
	public void close() {
		driver.close();

	}

}
