# Adrián Navarro Gabino

def rightNumbers(numbers):
    repeated = False
    outOfRange = False

    for i in range(len(numbers)):
        if 1 < numbers[i] < 49:
            outOfRange = True
        for j in range(i + 1, len(numbers)):
            if numbers[i] == numbers[j]:
                repeated = True
    if outOfRange or repeated:
        print("The list is NOT VALID")
        if repeated:
            print("There are repeated numbers")
        if outOfRange:
            print("There are numbers lower than 1 or higher than 49")
    else:
        print("The list is VALID")

numbers = [int(x) for x in input("Enter 6 numbers separated by spaces: ").split()]

numbers.sort()

print(numbers)

rightNumbers(numbers)