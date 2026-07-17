# Parking Garage

## Overview

Create a management system for a parking garage that handles two types of vehicles: **cars** and **trucks**.

---

## Classes

### ParkingRecord *(base class)*
- `price` — the parking fee for this record

---

### Car *(extends ParkingRecord)*
- `licensePlate` — the vehicle's license plate number
- `hours` — number of hours parked (whole hours only)
- **Price:** `2.00 EUR × hours`

---

### Truck *(extends ParkingRecord)*
- `licensePlate` — the vehicle's license plate number
- `hours` — number of hours parked (whole hours only)
- `weightKg` — weight of the truck in kilograms
- **Price:** `(4.00 EUR × hours) + (0.01 EUR × weightKg)`

---

### ParkingGarage
- `name` — name of the garage
- `records` — list of all parking records
- `addRecord(record)` — adds a new parking record
- `getTotalIncomeByType(type)` — calculates total income from a given vehicle type (Car or Truck)
- `getVehiclesParkedLongerThan(hours)` — returns a list of all vehicles that were parked longer than the given number of hours

---

## Requirements

1. Create at least **5 parking records** (a mix of cars and trucks).
2. Calculate and print the **total income per vehicle type**.
3. Print the **details of all parked vehicles** to the console.
4. List all vehicles that were parked **longer than 3 hours**.

---

## Example Console Output

```
=== Parking Garage: Downtown Garage ===

All records:
[Car]   ABC-123 | 2 hours  | 4.00 EUR
[Car]   XYZ-999 | 5 hours  | 10.00 EUR
[Truck] TRK-001 | 3 hours  | 18.00 EUR (2000 kg)
[Truck] TRK-002 | 1 hour   | 8.50 EUR  (450 kg)
[Car]   DEF-456 | 4 hours  | 8.00 EUR

Total income from Cars:   22.00 EUR
Total income from Trucks: 26.50 EUR

Vehicles parked longer than 3 hours:
[Car]   XYZ-999 | 5 hours
[Car]   DEF-456 | 4 hours
```
