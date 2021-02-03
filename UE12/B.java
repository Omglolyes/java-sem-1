package UE12;

class B extends A {
    protected int x;

    public B() {
        x++;
        y++;
        z++;
    }

    public void addiere(int x) {
        this.x = this.x + x;
        super.x = super.x + 2 * x;
        this.y = this.y + 3 * x;
        super.y = super.y + 4 * x;
        z = z + x; // Zeitpunkt b
        System.out.println(x);
        System.out.println(this.x);
        System.out.println(super.x);
        System.out.println(this.y);
        System.out.println(super.y);
        System.out.println(z);
    }
}