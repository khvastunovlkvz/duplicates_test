
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DuplicatesTest {

    @Test
    public void testFindDuplicatesMultiplePairsOfStrings() {
        String[] strings = {"qwe", "wqe", "qwee", "a", "a"};
        assertEquals(2, Duplicates.findDuplicates(strings).size());
    }

    @Test
    public void testFindDuplicatesEmptyArray() {
        String[] strings = {};
        assertEquals(0, Duplicates.findDuplicates(strings).size());
    }

    @Test
    public void testFindDuplicatesAllStringsSame() {
        String[] strings = {"abw", "wba", "bwa"};
        assertEquals("[abw = 0, 1, 2]", Duplicates.findDuplicates(strings).toString());
    }

    @Test
    public void testFindDuplicatesAllStringsUnique() {
        String[] strings = {"Qwa", "qwa", "asw"};
        assertEquals("[]", Duplicates.findDuplicates(strings).toString());
    }
}
