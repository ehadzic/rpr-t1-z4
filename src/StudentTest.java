package etf.unsa.ba;
class StudentTest {

    @Test
    void getIme(){
    etf.unsa.ba.Student s = new etf.unsa.ba.Student("abc", "def", 1234);
    assertEquals("abc", s.getIme());

    }

    @Test
    void getPrezime(){
        etf.unsa.ba.Student s= new etf.unsa.ba.Student("ABC", "DEF", 1234);
        assertEquals("DEF", s.getPrezime());
    }

    @Test
    void getIndeks(){
        etf.unsa.ba.Student s=new etf.unsa.ba.Student("ABC","DEF",1234);
        assertEquals(1234,s.getIndeks());
    }
}
