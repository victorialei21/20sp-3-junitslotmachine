import static org.junit.Assert.*;
import org.junit.Test;

public class TestSlipperySlot {

	@Test
	public void sameFiveNumbers() {
		SlipperySlot slot = new SlipperySlot();
		int[] slotValues = new int[] {5, 5, 5, 5, 5};
		int reward = slot.payOff(slotValues);
		assertEquals(99998, reward);
	}
	
	@Test
	public void sameFourNumbers() {
		SlipperySlot slot = new SlipperySlot();
		int[] slotValues = new int[] {5, 5, 5, 5, 3};
		int reward = slot.payOff(slotValues);
		assertEquals(9998, reward);
	}
	
	@Test
	public void fullHouse() {
		SlipperySlot slot = new SlipperySlot();
		int[] slotValues = new int[] {5, 5, 5, 3, 3};
		int reward = slot.payOff(slotValues);
		assertEquals(4998, reward);
	}
	
	@Test
	public void sameThreeNumbers() {
		SlipperySlot slot = new SlipperySlot();
		int[] slotValues = new int[] {5, 5, 5, 3, 1};
		int reward = slot.payOff(slotValues);
		assertEquals(98, reward);
	}
	
	@Test
	public void sameTwoNumbers() {
		SlipperySlot slot = new SlipperySlot();
		int[] slotValues = new int[] {5, 5, 3, 7, 1};
		int reward = slot.payOff(slotValues);
		assertEquals(8, reward);
	}
	
	public void perfSquare() {
		SlipperySlot slot = new SlipperySlot();
		int[] slotValues = new int[] {25, 5, 6, 7, 31};
		int reward = slot.payOff(slotValues);
		assertEquals(5, reward);
	}
	
	@Test
	public void fortyTwo() {
		SlipperySlot slot = new SlipperySlot();
		int[] slotValues = new int[] {1, 3, 5, 42, 31};
		int reward = slot.payOff(slotValues);
		assertEquals(0, reward);
	}
	
	@Test
	public void powerTwo() {
		SlipperySlot slot = new SlipperySlot();
		int[] slotValues = new int[] {8, 5, 3, 7, 1};
		int reward = slot.payOff(slotValues);
		assertEquals(1, reward);
	}
}
