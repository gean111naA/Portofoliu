package ro.siit.session11.innerNestedAnnonimous;

public class Car {
    private Engine engine;
    static public class Engine{
        private String serialNo;
        public Engine(String serialNo){
            this.serialNo = serialNo;
        }
    }

    public void startEngine(){
        System.out.println("Engine was started");
    }

    public static void main(String[] args) {
        Engine engine = new Engine("123432321");
        Car car  = new Car();
        car.engine = engine;
        car  = null;
        System.out.println(engine.serialNo);
    }

}
