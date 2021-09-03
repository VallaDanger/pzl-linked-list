package mx.chux.cs.pzl.list;

import org.junit.Before;
import org.junit.Test;

import mx.chux.cs.ds.list.LinkedList;

import static org.assertj.core.api.Assertions.*;

public class KthToLastElementTest {
    
    LinkedList<Integer> list;

    @Before
    public void initialize() {

        this.list = new LinkedList<>(6);

        this.list.add(1);
        this.list.add(2);
        this.list.add(3);
        this.list.add(4);
        this.list.add(5);
        this.list.add(6);
    }

    @Test
    public void lastElementTest() {
        final Integer value = KthToLastElement.fromList(this.list).get(1);
        assertThat(value).isEqualTo(6);
    }

    @Test
    public void secondToLastElementTest() {
        final Integer value = KthToLastElement.fromList(this.list).get(2);
        assertThat(value).isEqualTo(5);
    }

    @Test
    public void thirdToLastElementTest() {
        final Integer value = KthToLastElement.fromList(this.list).get(3);
        assertThat(value).isEqualTo(4);
    }

    @Test
    public void fourthToLastElementTest() {
        final Integer value = KthToLastElement.fromList(this.list).get(4);
        assertThat(value).isEqualTo(3);
    }

    @Test
    public void fifthToLastElementTest() {
        final Integer value = KthToLastElement.fromList(this.list).get(5);
        assertThat(value).isEqualTo(2);
    }

    @Test
    public void firstElementTest() {
        final Integer value = KthToLastElement.fromList(this.list).get(6);
        assertThat(value).isEqualTo(1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void indexOutOfBoundsTest() {
        KthToLastElement.fromList(this.list).get(7);
    }

}
