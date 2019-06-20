package net.proselyte.springhellotutorial;


public class SpringByeWorld {
    private String helloMessage;
    private String byeMessage;

    public void setHelloMessage(String helloMessage) {
        this.helloMessage = helloMessage;
    }

    public void getHelloMessage() {
        System.out.println("Hello message from bye: " + helloMessage);
    }

    public void setByeMessage(String byeMessage) {
        this.byeMessage = byeMessage;
    }

    public void getByeMessage() {
        System.out.println("Bye message from bye: " + byeMessage);
    }

    /**
     * Что именно будет происходить при инициализации экземпляра бина
     */
    public void beanInit(){
        System.out.println("Live, bean! Live!(bye)");
    }

    /**
     * Что именно будет происходить при уничтожении экземпляра бина
     *
     * Метод вызывается с областью Singleton bean, но не с прототипом, потому что
     * Spring не управляет полным жизненным циклом прототипа bean:
     * контейнер создает, настраивает, украшает и иным образом собирает прототип объекта,
     * передает его клиенту, а затем больше не знает об этом экземпляре прототипа.
     * Для освобождения ресурсов попробуйте реализовать пользовательский почтовый процессор bean.
     *
     * В отличие от singleton beans, где контейнер spring управляет полным жизненным циклом
     */
    public void beanDestroy(){
        System.out.println("Die, bean! Die!(bye)");
    }
}
