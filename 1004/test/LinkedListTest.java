import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    static LinkedList list;
    static LinkedList emptyList;

    @BeforeEach
    void init(){
        try {
            list = new LinkedList("12345");
            emptyList = new LinkedList();
        }catch (Exception e){

        }
    }

    @Test
    void shouldConstructWithEmpty() {
        LinkedList linkedList = new LinkedList();
        assertEquals(linkedList.getHead(), null);
    }

    @Test
    void shouldConstructWithList() {
        try {
            LinkedList linkedList = new LinkedList("1,2,3,4");
            assertEquals(linkedList.print(), "1 2 3 4 ");
        }catch (Exception e){

        }
    }

    @Test
    void shouldThrowErrorWhenConstructWithInvalidList(){
        Exception exception = assertThrows(Exception.class, () -> {
            LinkedList linkedList = new LinkedList("1ab");
        });
        assertEquals("invalid character", exception.getMessage());
    }

    @Test
    void addNode() {
        list.addNode(4);
        assertEquals(list.print(), "1 2 3 4 5 4");
    }

    @Test
    void print() {
        assertEquals(list.print(), "1 2 3 4 5 ");
        assertEquals(emptyList.print(), "");
    }

    @Test
    void delete() {
        list.delete(0);
        assertEquals(list.print(), "2 3 4 5 ");
    }

    @Test
    void insert(){
        list.insert(1,10);
        assertEquals(list.print(), "1 10 2 3 4 5 ");
    }

    @Test
    void reverse(){
        list.reverse();
        assertEquals(list.print(), "5 4 3 2 1 ");
    }
}