def fibonacci(n):
    if n <= 1:
        return n
    else:
        return fibonacci(n - 2) + fibonacci(n - 1)

def isPrime(n):
    prime = True

    if n < 2:
        prime = False
    else:
        for i in range(2,n-1):
            if n % i == 0:
                prime = False
    return prime


print("5th Fibonacci number:", fibonacci(5))
print("10th Fibonacci number:", fibonacci(10))

print("Prime numbers between 1 and 50:")
for i in range(50):
    if isPrime(i):
        print(i, end=" ")
print()