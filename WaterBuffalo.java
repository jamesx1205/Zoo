public class WaterBuffalo extends Animal implements Runnable, Swimmable {


    public WaterBuffalo(String name)
    {
        super(name);
    }


    public String eat()
    {
        return "Water Buffalo eats everything";
    }


    public String run()
    {
        return "Just like any other buffaloes.";
    }


    public String swim()
    {
        return "It can swim as faster than a normal person.";
    }





}