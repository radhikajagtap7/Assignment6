
public class Main {
    public static void main(String[] args) {

        LinkedList l1 = new LinkedList();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.display();
        System.out.println("--------------------------------------------");
        l1.addfromfirst(25);
        l1.display();
        System.out.println("---------------------------------------------");
        l1.addfromfirst(10);
        l1.addfromfirst(30);
        l1.display();

        System.out.println("-----------------------------------------------");

        l1.deletefromlast();
        l1.display();

        System.out.println("-------------------------------------------------");
        l1.removeFromFirst();
        l1.display();
        System.out.println("-------------------------------------------------");
        l1.addOnposition(10,2);
        l1.display();
        System.out.println("-------------------------------------------------");
        l1.deleteFromPositon(2);
        l1.display();
        System.out.println("-------------------------------------------------");


    }
}

