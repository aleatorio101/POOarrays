# StayWell Guest Management System Prototype

This project is a prototype of a **Hotel Guest Management System (SGH)** developed in Java.  
It was designed as part of an OOP exercise, focusing on encapsulation, composition, and clean object modeling.  

## Features
- Manage a hotel with its rooms and guests.
- Add rooms to a hotel with number, type, and price per night.
- Check-in: assign a guest to a room (if available).
- Check-out: release a room and make it available again.
- Prevent double booking of the same room.
- Display a full hotel report, including:
  - Room number
  - Room type
  - Price per night
  - Occupancy status
  - Guest information (if occupied)

## OOP Principles Applied
- **Encapsulation**: all attributes are private with getters/setters.
- **Composition**: a `Hotel` is composed of `Room` objects.
- **Association**: a `Room` can be associated with a `Guest`.
- **Collections**: `ArrayList` is used to manage rooms within the hotel.

## Project Structure
- `Hotel.java` → manages rooms, check-in, check-out, and reports.  
- `Room.java` → represents a room (number, type, price, status, guest).  
- `Guest.java` → represents a hotel guest (name, CPF).  
- `Main.java` → demonstration of the prototype (creating hotel, rooms, guests, check-in/out, and reports).  

## Demonstration Script
1. Create a hotel.  
2. Add multiple rooms.  
3. Create guests.  
4. Show initial room status (all available).  
5. Check-in a guest.  
6. Prevent double booking in an occupied room.  
7. Check-in another guest in a free room.  
8. Show updated hotel status.  
9. Perform check-out.  
10. Show final status.  

