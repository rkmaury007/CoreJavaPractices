package company;

abstract class PrivateConsInAbstract {
    /*private PrivateConsInAbstract(){
        System.out.println("CCCCCCCCCCCCCCCCCCCCCCCCC");
    }*/
    public PrivateConsInAbstract(){
        System.out.println("PPPPPPPPPPPPPPPPPPPP");
    }
    public void run(){
        System.out.println("===========");
    }

    public static void main(String[] args) {
        PrivateConsInAbstract p=new PrivateConsInAbstract() {
            @Override
            public void run() {
                System.out.println("11111111111111111");
            }
        };
        p.run();
    }
}

class Child extends PrivateConsInAbstract{

}
