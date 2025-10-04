package test.java.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

/**A class to test the basic read and write functions of the 
 * classes ReadFromStorage and WriteToStorage. 
 * 
 * @author Bryan Culver
 * @version 2024-03-01
 */
public class StorageTest {
			
		@BeforeEach
		public void storageObjects() {
		}
		
		@Test
		public void saveToStorage() {
			assertTrue(WriteToStorage.save());
			
		}
		
		@Test
		public void loadFromStorage() {
			assertEqual(ReadFromStorage);
			
		}
		
	}
