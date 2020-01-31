public class RunningSnake extends Animal implements Runnable, Flyable, Swimmable
{
    public RunningSnake(String name)
    {
        super(name);
    }
    
    public String eat()
    {
        return "RunningSnakes do not eat. They swallow.";
    }
    
    public String run()
    {
        return "Do snakes run. Yes, they have 4 legs and can run as faster than Mr.Kim. ";
    }
    
    public String fly()
   {
       return "Wait, They can also Fly??? Yes, they have wings and now they became dragons."; 
   }
   
   public String swim()
   {
       return "Like human , snakes can use they legs to swim free-style.";
   }
}