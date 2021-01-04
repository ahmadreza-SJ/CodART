/* Before refactoring (Original version) */


import Dummy.*;

class B
{
    public A a;
    int c;

    // Method 1
    void printF(int a)
    {
        print(a.g);
    }

    // Method 2
    void setF()
    {
        a.f = 5;
        c = a.f;
        printF(a.f);
    }
}
