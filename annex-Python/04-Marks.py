mark1 = float(input("Enter mark #1: "))
mark2 = float(input("Enter mark #2: "))
mark3 = float(input("Enter mark #3: "))

if mark1 <= 4 and mark2 <= 4 and mark3 <= 4:
    finalMark = 0
elif(mark1 > 4 or mark2 > 4 or mark3 > 4) and (mark1 <= 4 or mark2 <= 4 or mark3 <= 4):
    finalMark = 2
else:
    finalMark = 0.3 * mark1 + 0.2 * mark2 + 0.5 * mark3

print("Final mark:",finalMark)