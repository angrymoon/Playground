#include<iostream>

using namespace std;

int main()

{

  int a,b;

  cin>>a>>b;

  if(b<a){

    int c=100-a;

    cout<<c+b;

  }

  else{

    cout<<b-a;

  }

}

