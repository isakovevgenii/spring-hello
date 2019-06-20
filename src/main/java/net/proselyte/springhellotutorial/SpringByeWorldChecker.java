package net.proselyte.springhellotutorial;

/**
 * Экземпляр класса в котором реализована бизнес-логика проверки SpringByeWorld
 */
public class SpringByeWorldChecker {
        public SpringByeWorldChecker() {
            System.out.println("SpringByeWorldChecker constructor intiated.");
        }

    /**
     * Производит запуск обычной проверки для SpringByeWorld
     */
    public void checkSpringByeWorld(){
        System.out.println("Now we are checking SpringByeWorld.");
    }

    /**
     * Производит проверку на козанагу для SpringByeWorld
     * @param first
     * @param second
     */
    public void checkKozanaga(String first, String second){
            if(((first + second).toLowerCase()).equals("kozanaga")){
                System.out.println("passed the KozanagaChecker");
            }else System.out.println("failed the KozanagaChecker");
        }

    }

