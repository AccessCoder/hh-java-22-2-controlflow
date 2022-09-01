public class ifAndSwitch {

    public static void main(String[] args) {
        String subject = "Frau mit Handy";

        switch (subject){
            case "Granny":
                System.out.println("Granny verhaftet");
                break;
            case "Frau mit Handy":
                System.out.println("Frau mit Handy isst Currywurst");
                break; // oder return
            case "Mann mit Hut":
                System.out.println("Mann mit Hut verhaftet");
                break;
            default:
                System.out.println("Kaffeepause");
        }

    }




}
