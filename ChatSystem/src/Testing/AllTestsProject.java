package Testing;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)

@SuiteClasses({
	ServerTest.class, ITtest.class, ConversationTest.class
})
public class AllTestsProject {

}
