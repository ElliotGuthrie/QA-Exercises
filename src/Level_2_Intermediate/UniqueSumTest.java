package Level_2_Intermediate;

import static org.junit.Assert.*;

import org.junit.Test;

public class UniqueSumTest {

	@Test
	public void testSumReturn1()
	{
		assertEquals(6, UniqueSum.sumReturn(1, 2, 3));
	}
	@Test
	public void testSumReturn2()
	{
		assertEquals(0, UniqueSum.sumReturn(1, 1, 1));
	}
	@Test
	public void testSumReturn3()
	{
		assertEquals(2, UniqueSum.sumReturn(1, 1, 2));
	}
	@Test
	public void testSumReturn4()
	{
		assertEquals(1, UniqueSum.sumReturn(1, 2, 2));
	}
	@Test
	public void testSumReturn5()
	{
		assertEquals(2, UniqueSum.sumReturn(1, 2, 1));
	}
}
