

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Q1Test {

    @Test(expected = StackException.class)
    public void testQ1() {
        Stack st = new Stack(5);
        st.push("A");
        st.push("B");
        ReverseStack.reverseStack(st);
        assertEquals("A",(String) st.top());
    }
}