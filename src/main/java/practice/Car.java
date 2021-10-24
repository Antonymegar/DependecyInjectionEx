package practice;

public class Car {
    private Engine engine;
    public Car (){

    }
    //with Dependency Injection
    public Car(Engine engine) {
        this.engine= engine;

    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
     public String showEngineHp(){
        return "hp" + engine.getHp();
     }
}
