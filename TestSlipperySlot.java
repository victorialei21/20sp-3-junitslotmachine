import static org.junit.Assert.*;
import org.junit.Test;

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
		SlipperySlot slot = new SlipperySlot();
		int[] slotValues = new int[] {5, 5, 5, 5, 3};
		int reward = slot.payOff(slotValues);
		assertEquals(10000, reward);
	}
	
	@Test
	public void fullHouse() {
		SlipperySlot slot = new SlipperySlot();
		int[] slotValues = new int[] {5, 5, 5, 3, 3};
		int reward = slot.payOff(slotValues);
		assertEquals(5000, reward);
	}
	
	@Test
	public void sameThreeNumbers() {
		SlipperySlot slot = new SlipperySlot();
		int[] slotValues = new int[] {5, 5, 5, 3, 7};
		int reward = slot.payOff(slotValues);
		assertEquals(100, reward);
	}
	
	@Test
	public void sameTwoNumbers() {
		SlipperySlot slot = new SlipperySlot();
		int[] slotValues = new int[] {5, 5, 3, 7, 11};
		int reward = slot.payOff(slotValues);
		assertEquals(10, reward);
	}
	
	@Test
	public void perfSquare() {
		SlipperySlot slot = new SlipperySlot();
		int[] slotValues = new int[] {49, 5, 6, 7, 31};
		int reward = slot.payOff(slotValues);
		assertEquals(7, reward);
	}
	
	@Test
	public void fortyTwo() {
		SlipperySlot slot = new SlipperySlot();
		int[] slotValues = new int[] {11, 3, 5, 42, 31};
		int reward = slot.payOff(slotValues);
		assertEquals(2, reward);
	}
	
	@Test
	public void powerTwo() {
		SlipperySlot slot = new SlipperySlot();
		int[] slotValues = new int[] {32, 5, 3, 7, 11};
		int reward = slot.payOff(slotValues);
		assertEquals(3, reward);
	}
	
	@Test
	public void sixWithOne() {
		SlipperySlot slot = new SlipperySlot();
		int[] slotValues = new int[] {25, 25, 25, 25, 25};
		int reward = slot.payOff(slotValues);
		assertEquals(1000007, reward);
	}
	
	@Test
	public void sevenWithOne() {
		SlipperySlot slot = new SlipperySlot();
		int[] slotValues = new int[] {42, 42, 42, 42, 42};
		int reward = slot.payOff(slotValues);
		assertEquals(1000002, reward);
	}
	
	@Test
	public void eightWithOne() {
		SlipperySlot slot = new SlipperySlot();
		int[] slotValues = new int[] {8, 8, 8, 8, 8};
		int reward = slot.payOff(slotValues);
		assertEquals(1000003, reward);
	}
	
	@Test
	public void sixWithTwo() {
		SlipperySlot slot = new SlipperySlot();
		int[] slotValues = new int[] {25, 25, 25, 25, 11};
		int reward = slot.payOff(slotValues);
		assertEquals(10007, reward);
	}
	
	@Test
	public void sevenWithTwo() {
		SlipperySlot slot = new SlipperySlot();
		int[] slotValues = new int[] {42, 42, 42, 42, 11};
		int reward = slot.payOff(slotValues);
		assertEquals(10002, reward);
	}
	
	@Test
	public void eightWithTwo() {
		SlipperySlot slot = new SlipperySlot();
		int[] slotValues = new int[] {8, 8, 8, 8, 11};
		int reward = slot.payOff(slotValues);
		assertEquals(10003, reward);
	}
	
	@Test
	public void sixWithThree() {
		SlipperySlot slot = new SlipperySlot();
		int[] slotValues = new int[] {25, 25, 25, 3, 3};
		int reward = slot.payOff(slotValues);
		assertEquals(5007, reward);
	}
	
	@Test
	public void sevenWithThree() {
		SlipperySlot slot = new SlipperySlot();
		int[] slotValues = new int[] {42, 42, 42, 11, 11};
		int reward = slot.payOff(slotValues);
		assertEquals(5002, reward);
	}
	
	
	@Test
	public void eightWithThree() {
		SlipperySlot slot = new SlipperySlot();
		int[] slotValues = new int[] {8, 8, 8, 11, 11};
		int reward = slot.payOff(slotValues);
		assertEquals(5003, reward);
	}
	
	
	@Test
	public void sixWithFour() {
		SlipperySlot slot = new SlipperySlot();
		int[] slotValues = new int[] {25, 25, 25, 11, 3};
		int reward = slot.payOff(slotValues);
		assertEquals(107, reward);
	}
	
	@Test
	public void sevenWithFour() {
		SlipperySlot slot = new SlipperySlot();
		int[] slotValues = new int[] {42, 42, 42, 11, 3};
		int reward = slot.payOff(slotValues);
		assertEquals(102, reward);
	}
	
	@Test
	public void eightWithFour() {
		SlipperySlot slot = new SlipperySlot();
		int[] slotValues = new int[] {8, 8, 8, 11, 3};
		int reward = slot.payOff(slotValues);
		assertEquals(103, reward);
	}
	
	@Test
	public void sixWithFive() {
		SlipperySlot slot = new SlipperySlot();
		int[] slotValues = new int[] {25, 25, 7, 11, 3};
		int reward = slot.payOff(slotValues);
		assertEquals(17, reward);
	}
	
	@Test
	public void sevenWithFive() {
		SlipperySlot slot = new SlipperySlot();
		int[] slotValues = new int[] {42, 42, 7, 11, 3};
		int reward = slot.payOff(slotValues);
		assertEquals(12, reward);
	}
	
	@Test
	public void eightWithFive() {
		SlipperySlot slot = new SlipperySlot();
		int[] slotValues = new int[] {8, 8, 7, 11, 3};
		int reward = slot.payOff(slotValues);
		assertEquals(13, reward);
	}
	
	@Test
	public void allWithThree() {
		SlipperySlot slot = new SlipperySlot();
		int[] slotValues = new int[] {42, 42, 42, 16, 16};
		int reward = slot.payOff(slotValues);
		assertEquals(5012, reward);
	}
	
	@Test
	public void allWithTwo() {
		SlipperySlot slot = new SlipperySlot();
		int[] slotValues = new int[] {42, 42, 42, 42, 16};
		int reward = slot.payOff(slotValues);
		assertEquals(10012, reward);
	}
	
	@Test
	public void allWithFour() {
		SlipperySlot slot = new SlipperySlot();
		int[] slotValues = new int[] {42, 42, 42, 11, 16};
		int reward = slot.payOff(slotValues);
		assertEquals(112, reward);
	}
	
	@Test
	public void allWithFive() {
		SlipperySlot slot = new SlipperySlot();
		int[] slotValues = new int[] {42, 42, 3, 11, 16};
		int reward = slot.payOff(slotValues);
		assertEquals(22, reward);
	}
}
