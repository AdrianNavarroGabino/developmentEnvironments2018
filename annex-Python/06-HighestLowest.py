number = int(input("Tell me how many numbers are you going to enter: "))

print("Enter 3 numbers:")

for i in range(number):
    data = int(input())
    if i == 0:
        greatest = data
        lowest = data
    else:
        if data > greatest:
            greatest = data
        if data < lowest:
            lowest = data

print("The highest number has been", greatest)
print("The lowest number has been", lowest)