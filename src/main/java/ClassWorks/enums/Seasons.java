package ClassWorks.enums;

public enum Seasons {
    SUMMER(30) {
        void walk() {
            super.walk();
            System.out.println(" & Swim");
        }
    },
    OUTUMN(15) {
        void walk() {
            super.walk();
            System.out.println(" under the rain");
        }
    },
    WINTER(0){
        void walk() {
            super.walk();
            System.out.println(" & Ski");
        }
    },
    SPRING(10){
        void walk() {
            super.walk();
            System.out.println(" & Play");
        }
    };

    int temperature;
    Seasons(int temperature) {
        this.temperature = temperature;
    }

    void walk () {
        System.out.print(this.toString() + " - Walk");
    }
}
