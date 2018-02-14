package Level_2_Intermediate;

import static org.junit.Assert.*;

import org.junit.Test;

public class BlackjackTest
{
	@Test
	public void testBlackjackReturn1()
	{
		assertEquals(0, Blackjack.blackjackReturn(22, 23));
	}
	@Test
	public void testBlackjackReturn2()
	{
		assertEquals(20, Blackjack.blackjackReturn(20, 23));
	}
	@Test
	public void testBlackjackReturn3()
	{
		assertEquals(20, Blackjack.blackjackReturn(19, 20));
	}
	@Test
	public void testBlackjackReturn4()
	{
		assertEquals(0, Blackjack.blackjackReturn(-1, -2));
	}
	@Test
	public void testBlackjackReturn5()
	{
		assertEquals(15, Blackjack.blackjackReturn(25, 15));
	}
	@Test
	public void testBlackjackReturn6()
	{
		assertEquals(20, Blackjack.blackjackReturn(20, 15));
	}
}
