package UE12;

class A {
    protected int x;
    protected int y;
    protected static int z;

    public A() {
        x++;
        y++;
        z++;
    }

    public void addiere(int x) {
        this.x = this.x + x;
        this.y = this.y + 2 * x;
        z = z + x; // Zeitpunkt a
        System.out.println(x);
        System.out.println(this.x);
        System.out.println(this.y);
        System.out.println(z);
    }
}