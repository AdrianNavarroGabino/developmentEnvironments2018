// Adrián Navarro Gabino

package access;

import org.junit.Test;
import static org.junit.Assert.*;

public class AccessTest {
    
    @Test
    public void testValidUser() 
    {
        Access access = new Access();
        
        assertTrue(access.validUser("pepito123", "sanvicente2019"));
        assertFalse(access.validUser("123pepito", "sanvicente2019"));        
        assertFalse(access.validUser("pepe12", "sanvicente2019"));        
        assertFalse(access.validUser("pepito12345", "sanvicente2019"));        
        assertFalse(access.validUser("pepito123", "sanvi19"));
        assertFalse(access.validUser("pepito123", "123123123123"));
        assertFalse(access.validUser("pepito123", "aabbccddeeff"));
        assertFalse(access.validUser(null, "sanvicente2019"));
        assertFalse(access.validUser("pepito123", null));
    }
    
    @Test
    public void testRegister()
    {
        Access access = new Access();
        
        assertTrue(access.register("pepito123", "sanvicente2019"));
        // Check that we can't register an already existing user
        assertFalse(access.register("pepito123", "sanvicente2019"));
        
        // If we are working with NetBeans 8.2, we can't rely on @BeforeEach
        // annotation, so we can just fill the map with 10 users in order to 
        // try the second invalid condition (map is full)
        access.register("user2", "pass2");
        access.register("user3", "pass3");
        access.register("user4", "pass4");
        access.register("user5", "pass5");
        access.register("user6", "pass6");
        access.register("user7", "pass7");
        access.register("user8", "pass8");
        access.register("user9", "pass9");
        access.register("user10", "pass10");
        assertFalse(access.register("user11", "pass11"));
    }
}
