package teste_sistema;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteAutomatizado {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\workspace\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	}

}
