package test.java.model;

import org.junit.jupiter.api.Test;
import org.junit.Before;

/**A class to test the basic read and write functions of the 
 * classes ReadFromStorage and WriteToStorage. 
 * 
 * @author Bryan Culver
 * @version 2024-03-01
 */
public class StorageTest {
	
	public void constructStorageTest{
		
		@Before
		public void storageObjects() {
		}
		
		@Test
		public void saveToStorage() {
			assertTrue(WriteToStorage.save());
			
		}
		
		@Test
		public void loadFromStorage() {
			assertEqual(ReadFromStorage)
			
		}
		
	}

}
