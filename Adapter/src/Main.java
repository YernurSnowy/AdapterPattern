import Certificate_Pack.Certificate;
import Certificate_Pack.ICertificate;
import Perfume_Pack.IPerfume;
import Perfume_Pack.Perfume;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Basket basket = new Basket();
    static IPerfume tomFord = new Perfume("Tom Ford", 285);
    static IPerfume creedAventus = new Perfume("Creed Aventus", 365);
    static IPerfume versaceEros = new Perfume("Versace Eros", 107);
    public static void main(String[] args){
        System.out.println("Welcome to perfume shop!");
        int command;
        do{
            System.out.println("What do you want to do?");
            System.out.println("1) Buy perfume");
            System.out.println("2) Buy certificate");
            System.out.println("3) See a basket");
            System.out.println("4) Exit");
            command = scanner.nextInt();
            switch (command){
                case 1:
                    buyPerfume();
                    break;
                case 2:
                    buyCertificate();
                    break;
                case 3:
                    seeBasket();
                    break;
            }
        } while (command != 4);
    }

    public static void buyPerfume(){
        int command;
        do{
            System.out.println("1) " + tomFord.getName() + " - " +tomFord.getPrice() + "$");
            System.out.println("2) " + creedAventus.getName() + " - " +creedAventus.getPrice() + "$");
            System.out.println("3) " + versaceEros.getName() + " - " +versaceEros.getPrice() + "$");
            System.out.println("4) Exit");
            command = scanner.nextInt();
            switch (command){
                case 1:
                    basket.addPerfume(tomFord);
                    System.out.println("Tom Ford was added to Basket!");
                    break;
                case 2:
                    basket.addPerfume(creedAventus);
                    System.out.println("Creed Aventus was added to Basket!");
                    break;
                case 3:
                    basket.addPerfume(versaceEros);
                    System.out.println("Versace Eros was added to Basket!");
                    break;
            }
        }while (command != 4);
    }

    public static void buyCertificate(){
        int amount;
        System.out.println("How much do you want to get a certificate for?");
        amount = scanner.nextInt();
        ICertificate certificate = new Certificate("Gift Certificate", amount);
        IPerfume certificateAdapter = new CertificateAdapter(certificate);
        basket.addPerfume(certificateAdapter);
        System.out.println("Certificate was added to Basket!");
    }

    public static void seeBasket(){
        for (IPerfume perfume : basket.getPerfumes()){
            System.out.println(perfume.getName() + " - " + perfume.getPrice());
        }
        System.out.println("Total: " + basket.getTotalPrice() + "$");
    }
}