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
        list.addCity(city);
        assertEquals(true,list.hasCity(city));
        list.deleteCity(city);
        assertEquals(false,list.hasCity(city));

    }

    @Test
    public void testCountCities(){
        assertEquals(0,list.countCities());

        City city1 = new City("YellowKnife","Northwest Territories");
        list.addCity(city1);
        assertEquals(1,list.countCities());

        City city2 = new City("Cold Lake","Alberta");
        list.addCity(city2);
        assertEquals(2,list.countCities());

        City city3 = new City("Calgary","Alberta");
        list.addCity(city3);
        assertEquals(3,list.countCities());

        list.deleteCity(city3);

        assertEquals(2,list.countCities());

    }
}
