#include <iostream>
#include <stdlib.h>

using namespace std;

int main() {
    int n;
    int p;
    long long int result;
    long long int pow;
    
    do
    {
        result = 0;
        cin >> n >> p;
        if(n != 0 && p != 0)
        {
            for(int i = 1; i <= n; i++)
            {
                pow = i % 46337;
                for(int j = 1; j < p; j++)
                {
                    pow *= (i % 46337);
                    pow %= 46337;
                }
                result = result + pow % 46337;
                result %= 46337;
            }
            cout << result << endl;
        }
    } while(n != 0 || p != 0);
    
    return 0;
}
