import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

class QuestionTest {

	@Test
	void testQuestion() {
		Question testQuestion = new Question();
		assertFalse(testQuestion.isDailyDouble());
		assertEquals("", testQuestion.getQuestion());
		testQuestion.setQuestion("test");
		testQuestion.setDailyDouble(true);
		assertTrue(testQuestion.isDailyDouble());
		assertEquals("test", testQuestion.getQuestion());
	}

	@Test
	void testQuestionString() {
		Question testQuestion = new Question("test");
		assertFalse(testQuestion.isDailyDouble());
		assertEquals(testQuestion.getQuestion(), "test");
		testQuestion.setDailyDouble(true);
		testQuestion.setQuestion("newTest");
		assertEquals(testQuestion.getQuestion(), "newTest");
		assertTrue(testQuestion.isDailyDouble());
	}

	@Test
	void testQuestionStringBoolean() {
		Question testQuestion = new Question("", true);
		Question testQuestion2 = new Question("test2", true);
		assertTrue(testQuestion.isDailyDouble());
		assertTrue(testQuestion2.isDailyDouble());
		assertNotEquals(testQuestion.getQuestion(), testQuestion2.getQuestion());
		testQuestion.setQuestion("test2");
		assertEquals(testQuestion.getQuestion(), testQuestion2.getQuestion());
		testQuestion.setDailyDouble(false);
		assertFalse(testQuestion.isDailyDouble());
	}
}
