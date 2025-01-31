abstract class Actor
{
    abstract void Spawn();
    abstract void Kill();
}


public class Player extends Actor
{
    @Override
    void Spawn()    {   System.out.println("Player Spawned");   }

    @Override
    void Kill()     {   System.out.println("Player Killed");    }
}