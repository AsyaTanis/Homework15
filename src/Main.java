import transport.Car;   // импорт класса
import transport.Car.Key;   // импорт класса
import transport.Car.Insurance;   // импорт класса

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task_Car();
    }


    public static void task_Car() {

        Car fifthCar = new Car("Hyundai", "Avante", 2016," ", "оранжевый", 1.6, "T15", "Универсал", "A000AA125", 2, true);
        System.out.println(fifthCar);
        fifthCar.changeTiresForSeasonalOnes();  // метод позволяет сменить резину на сезонную автоматически (на момент выполнения - зима)
        System.out.println(fifthCar);

        Key keyOfFifthCar = fifthCar.new Key(true, false);  // создание ключа для конкретной машины
        Insurance insuranceOfFifthCar = fifthCar.new Insurance(LocalDate.of(2022, 10, 1), -12_000, "000");   // создание страховки для конкретной машины
        fifthCar.setKey(keyOfFifthCar); // тк не передавали в конструктор
        fifthCar.setInsurance(insuranceOfFifthCar); // тк не передавали в конструктор
        System.out.println(fifthCar);
        insuranceOfFifthCar.checkValidityPeriod();  // проверка истечения срока страховки
        insuranceOfFifthCar.checkNumber();  // проверка длины номера страховки
    }

}