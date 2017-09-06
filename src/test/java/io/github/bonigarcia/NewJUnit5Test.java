package io.github.bonigarcia;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

public class NewJUnit5Test {

  @BeforeEach
	public void initMethod() {
		// set the instance
		System.out.println("In Before Each");
	}

    @Test
    @DisplayName("Display name witj JUnit")
    public void myFirstTest() {
        String message = "1+1 should be equal to 2";
        System.out.println(message);

      //  assertEquals(message, 2, 1 + 1);
        assertEquals(2, 1 + 1, message);
    }



}
