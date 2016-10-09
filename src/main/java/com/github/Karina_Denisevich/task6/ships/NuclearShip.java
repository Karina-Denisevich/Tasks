package com.github.Karina_Denisevich.task6.ships;

public class NuclearShip {

    private static final String COMMON_INFO = "Common info";
    private Integer serialNumber;

    public NuclearShip(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    protected class Engine {

        protected void runEngine() {
            System.out.println("The engine runned");
        }

        private String getEngineInfo() {
            return "It is the engine for a nuclear ship. "
                    .concat(serialNumber.toString()).concat(COMMON_INFO);
        }
    }

    public void runShip() {
        Engine engine = new Engine();
        System.out.println(engine.getEngineInfo());
        engine.runEngine();
        System.out.println("The ship runned");
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public static String getCommonInfo() {
        return COMMON_INFO;
    }
}
