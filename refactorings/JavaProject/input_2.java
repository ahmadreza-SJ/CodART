/* Before refactoring (Original version) */


import Dummy.*;

class B
{
    //public A a;
    int c;

    // Method 1
    void printF(int a)
    {
        print(a.g);
        print(a.x());
    }

    // Method 2
    void setF()
    {
        A.f = 5;
        c = A.f;
        printF(A.f);
    }
}
