package net.proselyte.springhellotutorial;

public class SpringHelloWorld {
    private String helloMessage;

    public void setHelloMessage(String helloMessage) {
        this.helloMessage = helloMessage;
    }

    public String getHelloMessage() {
        return helloMessage;
    }

    /**
     * Что именно будет происходить при инициализации экземпляра бина
     */
    public void beanInit(){
        System.out.println("Live, bean! Live!(HI)");
    }

    /**
     * Что именно будет происходить при уничтожении экземпляра бина
     */
    public void beanDestroy(){
        System.out.println("Die, bean! Die!(HI)");
    }
}
