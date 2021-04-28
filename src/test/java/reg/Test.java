package reg;

import java.io.IOException;

public class Test {
  public static void main(String[] args) throws IOException, InterruptedException {
		Runtime.getRuntime().exec(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\startEmulator.bat");
		Thread.sleep(6000);
	  System.out.println("success");
}
}
