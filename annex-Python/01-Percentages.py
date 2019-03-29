# Adrián Navarro Gabino

boys = int(input("How many boys are in the classroom? "))
girls = int(input("How many girls are in the classroom? "))

total = boys + girls

boysPercentage = round(boys * 100 / total, 2)

print("Boys:", boysPercentage, "%")
print("Girls:", 100 - boysPercentage, "%")
