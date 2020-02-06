class SingletonLazyInitialization
{
    public static SingletonLazyInitialization singletoninstance = null;
    private SingletonLazyInitialization()
    {

    }

    public static SingletonLazyInitialization getInstance()
    {
        if(singletoninstance == null)
        {
            singletoninstance = new SingletonLazyInitialization();
        }
        return singletoninstance;
    }

    public void Display()
    {
        System.out.println("I am lazy initialization");
    }
}

class SingletonDemoLazy
{
    public static void main(String args[])
    {
        SingletonLazyInitialization singleton = SingletonLazyInitialization.getInstance();
        singleton.Display();
    }
}