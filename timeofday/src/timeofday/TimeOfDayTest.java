package timeofday;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeOfDayTest {

	TimeOfDay t = new TimeOfDay(10,30);
	
	@Test
	void testConstructor() {
		assertEquals(10, t.getHours());
		assertEquals(30, t.getMinutes());
		assertThrows(IllegalArgumentException.class, () -> new TimeOfDay(-1,30));
		assertThrows(IllegalArgumentException.class, () -> new TimeOfDay(24,30));
		assertThrows(IllegalArgumentException.class, () -> new TimeOfDay(0,-1));
		assertThrows(IllegalArgumentException.class, () -> new TimeOfDay(0,60));
	}
	
	@Test
	void testSetHours() {
		t.setHours(12);
		assertEquals(12, t.getHours());
		assertThrows(IllegalArgumentException.class, () -> t.setHours(-1));
		assertThrows(IllegalArgumentException.class, () -> t.setHours(24));
	}
	
	@Test
	void testSetMinutes() {
		t.setMinutes(59);
		assertEquals(59, t.getMinutes());
		assertThrows(IllegalArgumentException.class, () -> t.setMinutes(-1));
		assertThrows(IllegalArgumentException.class, () -> t.setMinutes(60));
	}
	
	

	
	@Test
	void timeofdayTest2() {
		TimeOfDay2 t = new TimeOfDay2(10,30);
		assertEquals(10, t.getHours());
		assertEquals(30, t.getMinutes());
		t.setHours(12);
		assertEquals(12, t.getHours());
		t.setMinutes(59);
		assertEquals(59, t.getMinutes());
		
		assertThrows(IllegalArgumentException.class, () -> t.setHours(-1));
		assertThrows(IllegalArgumentException.class, () -> t.setHours(24));
		assertThrows(IllegalArgumentException.class, () -> t.setMinutes(-1));
		assertThrows(IllegalArgumentException.class, () -> t.setMinutes(60));
		
		assertThrows(IllegalArgumentException.class, () -> new TimeOfDay2(-1,30));
		assertThrows(IllegalArgumentException.class, () -> new TimeOfDay2(24,30));
		assertThrows(IllegalArgumentException.class, () -> new TimeOfDay2(0,-1));
		assertThrows(IllegalArgumentException.class, () -> new TimeOfDay2(0,60));
	}
	

}
