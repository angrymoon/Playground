#include<iostream>

using namespace std;

int main()

{

  int n;

  cin>>n;

  if(n%100==0 && n%400==0)

    cout<<n<<" is a leap year";

  else if(n%100==0 && n%400!=0)

    cout<<n<<" is not a leap year";

  else if(n%4==0)

    cout<<n<<" is a leap year";

  else

    cout<<n<<" is not a leap year";

}

