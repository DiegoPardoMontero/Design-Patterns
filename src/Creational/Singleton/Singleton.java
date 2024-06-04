package Creational.Singleton;

//Para más información: https://refactoring.guru/es/design-patterns/singleton
public class Singleton {
    //Lazy construction
    //The class variable is null if no instance is instantiated
    private static Singleton uniqueInstance = null;

    private Singleton(){

    }

    //lazy construction of the instance
    public static Singleton getInstance(){
        //if you're working with multi-thread, here you would have
        //to get a thread-lock
        if (uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }


}
