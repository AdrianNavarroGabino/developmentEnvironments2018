// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    int dia, mes;
    int casos;
    
    cin >> casos;

    for(int i = 0; i < casos; i++)
    {
        cin >> dia >> mes;

        if(dia == 25 && mes == 12)
        {
            cout << "SI" << endl;
        }
        else
        {
            cout << "NO" << endl;
        }
    }

	return 0;
}
