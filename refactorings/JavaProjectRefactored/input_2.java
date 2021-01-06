/*After refactoring (Refactored version)*/
import Dummy.*;

class B
{
    public Z a = new Z();
    int c;

    // Method 1
    void printF(int a)
    {
        print(Z.g);
        print(Z.x());
    }

    // Method 2
    void setF()
    {
        a.f = 5;
        c = a.f;
        printF(a.f);
    }
}
