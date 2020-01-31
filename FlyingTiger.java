public class FlyingTiger extends Animal implements Runnable, Flyable, Swimmable
{
    public FlyingTiger(String name)
    {
        super(name);
    }
    
    public String eat()
    {
        return "I mean this is normal, a flying-tiger is a tiger.";
    }
    
    public String run()
    {
        return "Well, like all tigers it can run, but way faster.";
    }
    
    public String fly()
   {
       return "Of course, a flying-tiger has the ability to fly."; 
   }
   
   public String swim()
   {
       return "The swimming pig loves to swim backstroke when they are relaxing, and can still swim faster than a sailfish.";
   }
   
}