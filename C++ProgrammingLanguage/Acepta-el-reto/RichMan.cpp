// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    int compartimentos, litros, diferencia;
    int casos;
    int agua;
    
    cin >> casos;

    for(int i = 0; i < casos; i++)
    {
        agua = 0;
        
        cin >> compartimentos >> litros >> diferencia;

        for(int j = 0; j < compartimentos; j++)
        {
            agua += litros;
            litros -= diferencia;
        }
        
        cout << agua << endl;
    }

	return 0;
}
