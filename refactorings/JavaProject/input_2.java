/* Before refactoring (Original version) */
class B
{
    public A a;

    // Method 1
    void printF()
    {
        print(a.g);
    }

    // Method 2
    void setF()
    {
        a.f = 5;
    }
}
