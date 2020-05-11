import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CategoryTest {

	@Test
	void testCategory() {
		Category testCategory = new Category();
		assertEquals(testCategory.getCategory(), "");
		testCategory.setCategory("test");
		assertEquals("test", testCategory.getCategory());
	}

	@Test
	void testCategoryString() {
		Category testCategory = new Category("test");
		Category tCategory = new Category("");
		assertNotEquals(testCategory.getCategory(), tCategory.getCategory());
		assertEquals("test", testCategory.getCategory());
		tCategory.setCategory("test");
		assertEquals(testCategory.getCategory(), tCategory.getCategory());
	}

}
