package it.wich.helloformio;

import static org.junit.Assert.*;

import org.junit.Test;

public class GreeterTest {

	@Test
	public void test() {
		new Greeter();
	}
	
	@Test
	public void testGreeting()	{
		assertEquals("Hello, Foo", Greeter.greet("Foo"));
	}
}
