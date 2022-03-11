import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    @Before
    public void createList(){
        list = new CustomList(null,new ArrayList<City>());
    }

    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Halifax","NS"));
        assertEquals(list.getCount(),listSize+1);
    }

    @Test
    public void hasCityTest(){
        City city = new City("Halifax","NS");
        assertEquals(false,list.hasCity(city));
        list.addCity(city);
        assertEquals(true,list.hasCity(city));
    }

    @Test
    public void deleteCityTest(){
        City city = new City("Halifax","NS");
        list.add(city);
        assertEquals(true,list.hasCity(city));
        list.deleteCity(city);
        assertEquals(false,list.hasCity(city));

    }

}
