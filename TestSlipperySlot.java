import org.junit.jupiter.api.*;

public class TestSlipperySlot {

	@Test
	public void sameFiveNumbers() {
		SlipperySlot slot = new SlipperySlot();
		int[] slotValues = new int[] {5, 5, 5, 5, 5};
		int reward = slot.payOff(slotValues);
		assertEquals(1000000, reward);
	}
	
	@Test
	public void sameFourNumbers() {
		
	}
	
	@Test
	public void fullHouse() {
		
	}
	
	@Test
	public void threeSameTwoDiff() {
		
	}
	
	@Test
	public void sameTwoNumbers() {
		
	}

	@Test 
	public void powerofTwo() {
		
	}
}
