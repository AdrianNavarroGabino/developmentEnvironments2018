totalPrice = 0
price = float(input("Enter price: "))

while price != 0:
    totalPrice += price
    price = float(input("Enter price: "))

print("Total: %.2f" % totalPrice)