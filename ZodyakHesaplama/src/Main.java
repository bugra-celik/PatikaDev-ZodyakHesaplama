import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int dateOfBirth,zodyak;
        String zodyakType = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Doğum tarihinizi giriniz : ");
        dateOfBirth = input.nextInt();
        boolean isError = false;

        zodyak = (dateOfBirth % 12);

        switch (zodyak) {

            case 0:
                zodyakType = "Maymun";
                break;
            case 1:
                zodyakType = "Horoz";
                break;
            case 2:
                zodyakType = "Köpek";
                break;
            case 3:
                zodyakType = "Domuz";
                break;
            case 4:
                zodyakType = "Fare";
                break;
            case 5:
                zodyakType = "Öküz";
                break;
            case 6:
                zodyakType = "Kaplan";
                break;
            case 7:
                zodyakType = "Tavşan";
                break;
            case 8:
                zodyakType = "Ejderha";
                break;
            case 9:
                zodyakType = "Yılan";
                break;
            case 10:
                zodyakType = "At";
                break;
            case 11:
                zodyakType = "Koyun";
                break;
            default:
                isError = true;

        }
        if(isError){
            System.out.println("Hatalı değer girdiniz.");
        }else{

            System.out.println("Çin zodyağı burcunuz : " +zodyakType);
        }
    }

}
