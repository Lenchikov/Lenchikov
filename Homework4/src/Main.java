public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone(1234567, "Lenova");
        Phone phone2 = new Phone(1234567,"Samsung", 6);
        Phone phone3 = new Phone(1234567,"Sony",5);

        System.out.println("phone1 : number "+phone1.getNumber()+", model "+phone1.getModel()+", weight "+phone1.getWeight());
        phone1.receiveCall("Виктор",2345678);
        phone1.receiveCall("Виктор");
        phone1.sendMessage(1234567,2345678,3456789);
        System.out.println("phone2 : number "+phone2.getNumber()+", model "+phone2.getModel()+", weight "+phone2.getWeight());
        System.out.println("phone3 : number "+phone3.getNumber()+", model "+phone3.getModel()+", weight "+phone3.getWeight());
    }
}