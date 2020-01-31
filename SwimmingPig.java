public class SwimmingPig extends Animal implements Runnable, Flyable, Swimmable
{
    public SwimmingPig(String name)
    {
        super(name);
    }
    
    public String eat()
    {
        return "Oh yes, SwimmingPigs loves to eat all sushi";
    }
    
    public String run()
    {
        return "SwmmingPigs can run as fast as Usain Bolt ";
    }
    
    public String fly()
   {
       return "Hold on, why is that pig flying? Wait it flys faster than the Peregrine falcon"; 
   }
   
   public String swim()
   {
       return "The swimming pig loves to swim backstroke when they are relaxing, and can still swim faster than a sailfish.";
   }
}