# Vehicle_v1
Zadanie polegało na stworzeniu hierarchii klas i interfejsów do reprezentowania różnych typów pojazdów w systemie zarządzania flotą.
Zagadnienia które zostały poruszone to między innymi:
- interfejsy
- klasy abstrakcyjne
- dziedziczenie po klasach
- implementacja interfejsów

Głównym celem było stworzenie hierarchii klas i interfejsów, a także dostarczyć implementacje metod w klasach pochodnych.

Etapy zadania:

1. Stworzenie interfejsu o nazwie `Vehicle`, który zawiera następujące metody:
   - `void start()`, która uruchamia pojazd.
   - `void stop()`, która zatrzymuje pojazd.
   - `void refuel()`, która oznacza, że pojazd jest zatankowany.

2. Stw0rzenie klasy abstrakcyjnej `MotorVehicle`, która implementuje interfejs `Vehicle` i zawiera pole `registrationNumber` (numer rejestracyjny). Dodanie konstruktora, który pozwoli ustawić numer rejestracyjny pojazdu. Ta klasa powinna również zawierać metodę abstrakcyjną `void drive()`, która zostanie zaimplementowana przez klasy pochodne.

3. Stworzenie klasy `Car`, która dziedziczy po `MotorVehicle`. Dodanie konstruktora, który przyjmuje numer rejestracyjny i markę samochodu. Zaimplementowanie metody `drive()` w taki sposób, że wyświetli komunikat "Samochód marki {marka} jedzie".

4. Stworzenie klasy `Truck`, która dziedziczy po `MotorVehicle`. Dodaj konstruktor, który przyjmuje numer rejestracyjny i ładowność samochodu (np. w tonach). Zaimplementowanie metody `drive()` w taki sposób, że wyświetla komunikat "Ciężarówka z ładunkiem {ładowność} jedzie".

5. Stworzenie klasy `Bicycle`, która implementuje interfejs `Vehicle`. Dodanie konstruktora, który przyjmuje model roweru. Zaimplementowanie metody `start()`, `stop()` i `refuel()` w taki sposób, żeby wyświetla odpowiednie komunikaty.

6. Stworzenie klasy `FleetManager`, która zawiera listę pojazdów i metody do zarządzania flotą, takie jak `addVehicle()`, `removeVehicle()`, oraz `listVehicles()`, która wypisuje informacje o wszystkich pojazdach w flocie.

