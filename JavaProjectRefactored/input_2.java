/* Before refactoring (Original version) */


import Dummy.Z;

class B
{
    public Z a = new Z();
    int c;

    // Method 1
    void printF(int a)
    {
        print(Z.g);
        print(a.x());
    }

    // Method 2
    void setF()
    {
        Z.f = 5;
        c = Z.f;
        printF(Z.f);
    }
}
