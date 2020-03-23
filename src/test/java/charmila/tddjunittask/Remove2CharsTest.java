package charmila.tddjunittask;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Remove2CharsTest {
     /* LIST FOR THE FEATURE
	  * 1. "ABCD"=>"BCD"-success
	  * 2. "AACD"=>"CD"-success
	  * 3."BACD"=>"BCD"-success
	  * 4."BBAA"=>"BBAA"-success
	  * 5."AABAA"=>"BAA"-success
	  */
	Remove2Chars remove2chars;
	
@BeforeEach
	void setup()
	{
		remove2chars = new Remove2Chars();
	}
	
@Test
	void test2Chars()
	{
		assertEquals("BCD",remove2chars.removec("ABCD"));
	}
	
@Test
	void test3Chars()
	{
		assertEquals("CD",remove2chars.removec("AACD"));
	}
@Test
    void test4Chars()
    {
	   assertEquals("BCD",remove2chars.removec("BACD"));
    }
@Test
   void test5Chars()
   {
	    assertEquals("BBAA",remove2chars.removec("BBAA"));
   }
@Test
   void test6Chars()
   {
	    assertEquals("BAA",remove2chars.removec("AABAA"));
   }
	}