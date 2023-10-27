# Vehicle_v1
Zadanie polegało na stworzeniu hierarchii klas i interfejsów do reprezentowania różnych typów pojazdów w systemie zarządzania flotą.
Zagadnienia które zostały poruszone to między innymi:
- interfejsy
- klasy abstrakcyjne
- dziedziczenie po klasach
- implementacja interfejsów

Głównym celem było stworzenie hierarchii klas i interfejsów, a także dostarczyć implementacje metod w klasach pochodnych.

etapy zadania:

1. Stwórz interfejs o nazwie `Vehicle`, który zawiera następujące metody:
   - `void start()`, która uruchamia pojazd.
   - `void stop()`, która zatrzymuje pojazd.
   - `void refuel()`, która oznacza, że pojazd jest zatankowany.

2. Stwórz klasę abstrakcyjną `MotorVehicle`, która implementuje interfejs `Vehicle` i zawiera pole `registrationNumber` (numer rejestracyjny). Dodaj konstruktor, który pozwoli ustawić numer rejestracyjny pojazdu. Ta klasa powinna również zawierać metodę abstrakcyjną `void drive()`, która zostanie zaimplementowana przez klasy pochodne.

3. Stwórz klasę `Car`, która dziedziczy po `MotorVehicle`. Dodaj konstruktor, który przyjmuje numer rejestracyjny i markę samochodu. Zaimplementuj metodę `drive()` w taki sposób, że wyświetla komunikat "Samochód marki {marka} jedzie".

4. Stwórz klasę `Truck`, która dziedziczy po `MotorVehicle`. Dodaj konstruktor, który przyjmuje numer rejestracyjny i ładowność samochodu (np. w tonach). Zaimplementuj metodę `drive()` w taki sposób, że wyświetla komunikat "Ciężarówka z ładunkiem {ładowność} jedzie".

5. Stwórz klasę `Bicycle`, która implementuje interfejs `Vehicle`. Dodaj konstruktor, który przyjmuje model roweru. Zaimplementuj metody `start()`, `stop()` i `refuel()` w taki sposób, żeby wyświetlały odpowiednie komunikaty.

6. Stwórz klasę `FleetManager`, która zawiera listę pojazdów i metody do zarządzania flotą, takie jak `addVehicle()`, `removeVehicle()`, oraz `listVehicles()`, która wypisuje informacje o wszystkich pojazdach w flocie.

