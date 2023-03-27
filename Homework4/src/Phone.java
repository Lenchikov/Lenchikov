public class Phone {
    private int number;
    private String model;
    private int weight;
    public void receiveCall(String name){
        System.out.println("Звонит "+name);
    }
    public Phone(int number,String model, int weight){
        this(number,model);
        this.weight = weight;
    }
    public Phone(int number, String model){
        this.number = number;
        this.model = model;
    }
    public Phone(){}

    public void receiveCall(String name,int number){
        System.out.println("Звонит "+name+" номер "+number);
    }
    public void sendMessage(int ... numbers){
        System.out.println("Номера телефонов, которым будет отправленно сообщение : ");
        for (int val : numbers){
            System.out.print(val + ", ");
        }
        System.out.println();
    }

    public int getWeight() {
        return weight;
    }

    public String getModel() {
        return model;
    }

    public int getNumber() {
        return number;
    }
}
