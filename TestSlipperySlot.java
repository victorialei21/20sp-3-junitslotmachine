import static org.junit.Assert.*;

public class TestSlipperySlot {

	public void sameFiveNumbers() {
		SlipperySlot slot = new SlipperySlot();
		int[] slotValues = new int[] {5, 5, 5, 5, 5};
		int reward = slot.payOff(slotValues);
		assertEquals(99998, reward);
	}
	
	public void sameFourNumbers() {
		SlipperySlot slot = new SlipperySlot();
		int[] slotValues = new int[] {5, 5, 5, 5, 3};
		int reward = slot.payOff(slotValues);
		assertEquals(9998, reward);
	}
	
	public void fullHouse() {
		SlipperySlot slot = new SlipperySlot();
		int[] slotValues = new int[] {5, 5, 5, 3, 3};
		int reward = slot.payOff(slotValues);
		assertEquals(4998, reward);
	}
	
	public void sameThreeNumbers() {
		SlipperySlot slot = new SlipperySlot();
		int[] slotValues = new int[] {5, 5, 5, 3, 1};
		int reward = slot.payOff(slotValues);
		assertEquals(98, reward);
	}
	
	public void sameTwoNumbers() {
		SlipperySlot slot = new SlipperySlot();
		int[] slotValues = new int[] {5, 5, 3, 7, 1};
		int reward = slot.payOff(slotValues);
		assertEquals(8, reward);
	}
	
}
