/* Before refactoring (Original version) */


import Dummy.A;

class B
{
    public A a = new A();
    int c;

    // Method 1
    void printF(int a)
    {
        print(A.g);
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
