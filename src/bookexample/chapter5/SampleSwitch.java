package bookexample.chapter5;

public class SampleSwitch {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            switch (i) {
                case 0:
                    System.out.println("i-ն հավասար է 0-ի։");
                    break;
                case 1:
                    System.out.println("i-ն հավասար է 1-ի։");
                    break;
                case 2:
                    System.out.println("i-ն հավասար է 2-ի։");
                    break;
                case 3:
                    System.out.println("i-ն հավասար է 3-ի։");
                    break;
                default:
                    System.out.println("i-ն մեծ է 3-ից էլ");
            }
        }

    }
}
