/*After refactoring (Refactored version)*/
class A
{
    int f = 0; /* printF , printF, */
    public static int g; /* printF, printG */
    public string h; /* printH */

    // Method 1
    void printF(int i)
    {
        this.f = i * this.f;
    }

    // Method 2
    void printF(float i){
        this.f = (int) (i * this.f);
        this.setG((int) (i * this.getG()));
    }

    // Method 3
    void printG(){
        print(this.getG());
    }

    // Method 4
    void printH(){
        print(this.h);
    }
}
