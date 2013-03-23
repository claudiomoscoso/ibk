package cl.buildersoft.ibk.business.service;

public class AbstractMockService {
	protected void waitService() {
		try {
			Thread.sleep(500);			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
