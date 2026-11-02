
# Train Availability Checking

train_name = input("Enter train name: ")
available_seats = int(input("Enter available seats: "))
required_seats = int(input("Enter required seats: "))

print("\n--- Train Availability ---")
print("Train Name:", train_name)

if available_seats >= required_seats:
    print("Seats Available")
    print("Booking can be confirmed!")
else:
    print("Seats Not Available")
    print("Please try another train.")
