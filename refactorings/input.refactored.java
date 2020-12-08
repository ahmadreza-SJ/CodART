/* Before refactoring (Original version) */
class A
{
    int f; /* printF , printF, */
    public int g; /* printF, printG */
    public string h; /* printH */

    // Method 1
    void printF(int i)
    {
        this.setF(i * this.getF());
    }

    // Method 2
    void printF(float i){
        this.setF((int) (i * this.getF()));
        this.g = (int) (i * this.g);
    }

    // Method 3
    void printG(){
        print(this.g);
    }

    // Method 4
    void printH(){
        print(this.h);
    }
}
