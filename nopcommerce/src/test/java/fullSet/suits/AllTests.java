package fullSet.suits;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.AddToCartTest;
import tests.LoginTest;
import tests.RegisterTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        LoginTest.class,
        RegisterTest.class,
        AddToCartTest.class,
})

public class AllTests {
}
