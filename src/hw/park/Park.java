package hw.park;

/**
 * Created by Viktor on 08.11.2016.
 */
public class Park {

    private Transport transports[];
    private int counter;
    public Park(int size) {
        transports = new Transport[size];
        counter = 0;
    }

    public void addTransport(Transport transport )
    {
        if(counter == transports.length)
        {
            System.out.println("Автопарк переполнен");
        }
        else
        {
            Transport t = transport;
            transports[counter++] = t;
        }
    }

    public void deleteTransport(int number)
    {
        if(transports[number] == null)
        {
            System.out.println("Это место итак пустое");
        }
        else {
            transports[number] = new Car();
        }
    }
    public void startAll()
    {
        for(int i = 0;i < counter;i++)
        {
            transports[i].Go();
        }
    }
}
