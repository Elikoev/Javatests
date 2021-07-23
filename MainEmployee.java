package Javatests;

public class MainEmployee {


    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Lapin Culto Toco", "support","support@lapCul.com","+999656532",3500,(byte)23);
        persArray[1] = new Employee("Ticco Sarca", "mechanic","mech@lapCul.com","+9944564532",4500,(byte)98);
        persArray[2] = new Employee("Culto Reda", "driver","driver@lapCul.com","+998436532",3500,(byte)32);
        persArray[3] = new Employee("Savva Tag", "CEO","CEO@lapCul.com","+999654613",10000,(byte) 72);
        persArray[4] = new Employee("Escao Coll", "investor","invest@lapCul.com","+999655564",50000,(byte)44);
        Employee one = new Employee("asdads","asdas","asdasd","55555454",55522,(byte)39);
            for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() >= 40) {
                persArray[i].doPrintEmployee();
            }
        }
    }
}
