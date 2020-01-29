import model.entity.sipaEnti;
import model.service.SipaServe;
import java.util.Scanner;

public class Main {
    public static void main(String[] arge) {
        Scanner input = new Scanner(System.in);
        System.out.println("\t1)insert\t2)update(name,car,price)");
        int a = input.nextInt();
        switch (a) {
            case 1:

                System.out.println("name:");
                String name = input.next();
                System.out.println(" car name:");
                String car = input.next();
                System.out.println("Inter car price:");
                Long price = input.nextLong();
                try {
                    SipaServe.getInstance().save(new sipaEnti().setName(name).setCar(car).setPrice(price));
                }catch (Exception e) {
                    e.printStackTrace();
                }
                break;

            case 2:
                System.out.println(" name:");
                String namee = input.next();
                System.out.println("car name:");
                String carr = input.next();
                System.out.println(" car price:");
                Long pricee = input.nextLong();
                try {
                    SipaServe.getInstance().edit(new sipaEnti().setName(namee).setPrice(pricee).setCar(carr));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;

        }
    }
}
