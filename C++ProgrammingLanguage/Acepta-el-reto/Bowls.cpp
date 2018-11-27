#include <iostream>
#include <stdlib.h>

using namespace std;

int main() {
    long long int f;
    long long int b;
    long long int numerOfBowls;
    long long int numberOfFallenBowls;
    long long int numberOfFinalBowls;
    
    do
    {
        cin >> f >> b;
        if(f != 0 && b != 0 && f >= b)
        {
            numerOfBowls = f * (f + 1) / 2;
            numberOfFallenBowls = (f - b + 1) * (f - b + 2) / 2;
            numberOfFinalBowls = numerOfBowls - numberOfFallenBowls;
            cout << numberOfFinalBowls << endl;
        }
    } while(f != 0 || b != 0);
    
    return 0;
}
