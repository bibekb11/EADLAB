class SingletonEarlyInitialization
{
    public static SingletonEarlyInitialization singletoninstance = new SingletonEarlyInitialization();
    private SingletonEarlyInitialization()
    {

    }

    public static SingletonEarlyInitialization getInstance()
    {
       return singletoninstance;
    }

    public void Display()
    {
        System.out.println("I am Early Initialization!!");
    }
}

class SingletonDemoEarly
{
    public static void main(String args[])
    {
        SingletonEarlyInitialization instance = SingletonEarlyInitialization.getInstance();
        instance.Display();
    }
        

}