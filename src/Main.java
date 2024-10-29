import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        CarrotSeller firstCarrotSeller = new CarrotSeller();
        firstCarrotSeller.setName("Pavel Novák");
        System.out.println("Jméno prodejce: "+firstCarrotSeller.getName());
        firstCarrotSeller.setDateOfBirth(LocalDate.of(1989,2,15));
        System.out.println("Prodejce narozen: "+firstCarrotSeller.getDateOfBirth());
        firstCarrotSeller.setNumberOfContracts(58);
        System.out.println("Počet uzavřených smluv: "+firstCarrotSeller.getNumberOfContracts());
        firstCarrotSeller.setCarrotsSold(13);
        System.out.println("Prodané mrkve: " +firstCarrotSeller.getCarrotsSold()+" t");
        firstCarrotSeller.setCityOfResidence("Olomouc");
        System.out.println("Město: "+firstCarrotSeller.getCityOfResidence());
        firstCarrotSeller.setCarRegistrationNumber("3MO 8118");
        System.out.println("Registrační značka vozidla: "+firstCarrotSeller.getCarRegistrationNumber());
        firstCarrotSeller.setFuelConsumption(6.2);
        System.out.println("Spotřeba vozidla: "+firstCarrotSeller.getFuelConsumption()+" l/100 km");
        CarrotSeller secondCarrotSeller = new CarrotSeller();
        secondCarrotSeller.setName("Jan Pištík");
        System.out.println("Jméno prodejce: "+secondCarrotSeller.getName());
        secondCarrotSeller.setDateOfBirth(LocalDate.of(1992,8,5));
        System.out.println("Prodejce narozen: "+secondCarrotSeller.getDateOfBirth());
        secondCarrotSeller.setNumberOfContracts(29);
        System.out.println("Počet uzavřených smluv: "+secondCarrotSeller.getNumberOfContracts());
        secondCarrotSeller.setCarrotsSold(8);
        System.out.println("Prodané mrkve: "+secondCarrotSeller.getCarrotsSold()+ " t");
        secondCarrotSeller.setCityOfResidence("Brno");
        System.out.println("Město: "+secondCarrotSeller.getCityOfResidence());
        secondCarrotSeller.setCarRegistrationNumber("8A2 1111");
        System.out.println("Registrační značka vozidla: "+secondCarrotSeller.getCarRegistrationNumber());
        secondCarrotSeller.setFuelConsumption(4.1);
        System.out.println("Spotřeba vozidla: "+secondCarrotSeller.getFuelConsumption()+" l/100 km");
    }
}