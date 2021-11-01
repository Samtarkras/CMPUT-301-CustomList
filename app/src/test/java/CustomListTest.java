import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    static CustomList list;
    @BeforeEach
    public void setup(){
        list = new CustomList(null, new ArrayList<City>());

    }
    @Test
    public void addCityTest(){
        City c = new City("Edmonton","AB" );
        int size = list .getCount();
        list.addCity(c);
        assertEquals(size+1, list.getCount());
    }
    @Test
    public void hasCityTest(){
        City c = new City("Edmonton","AB" );
        list.addCity(c);
        assertEquals(true, list.hasCity(c));
    }
    @Test
    public void delCityTest(){
        City c = new City("Edmonton","AB" );
        list.addCity(c);
        int size = list .getCount();
        list.delCity(c);
        assertEquals(size-1, list.getCount());
    }
    @Test
    public void countCityTest(){
        City c = new City("Edmonton","AB" );
        list.addCity(c);
        int count = list.countCity();
        assertEquals(1, count);
    }

}

