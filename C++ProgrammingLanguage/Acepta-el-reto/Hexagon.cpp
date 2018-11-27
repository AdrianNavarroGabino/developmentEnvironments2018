// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    int number;
    int numberOfSymbols;
    char symbol;
    
    do
    {
        cin >> number >> symbol;
        
        numberOfSymbols = number;
        
        for(int row = 1; row <= number; row++)
        {
            for(int espacio = 0; espacio < number - row; espacio++)
            {
                cout << " ";
            }
            for(int j = 0; j < numberOfSymbols; j++)
            {
                cout << symbol;
            }
            cout << endl;
            numberOfSymbols += 2;
        }
        
        numberOfSymbols -= 4;
        
        for(int row = 1; row <= number - 1; row++)
        {
            for(int espacio = 1; espacio < row + 1; espacio++)
            {
                cout << " ";
            }
            for(int j = 0; j < numberOfSymbols; j++)
            {
                cout << symbol;
            }
            cout << endl;
            numberOfSymbols -= 2;
        }
    } while(number != 0 || symbol != '0');

	return 0;
}
