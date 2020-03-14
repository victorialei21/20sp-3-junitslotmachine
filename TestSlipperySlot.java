import static org.junit.Assert.*;

public class TestSlipperySlot {

	public void sameFiveNumbers() {
		SlipperySlot slot = new SlipperySlot();
		int[] slotValues = new int[] {5, 5, 5, 5, 5};
		int reward = slot.payOff(slotValues);
		assertEquals(1000000-2, reward);
	}
	
	public void sameFourNumbers() {
		SlipperySlot slot = new SlipperySlot();
		int[] slotValues = new int[] {5, 5, 5, 5, 4};
		int reward = slot.payOff(slotValues);
		assertEquals(10000-2, reward);
	}
	
}
