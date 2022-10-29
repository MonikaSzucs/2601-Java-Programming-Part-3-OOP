class A{
    private static int a;
    private static int MINIMUM_VALUE;

    static {
        a = 0;
        MINIMUM_VALUE = 500;
    }


    A(final int a){
        setA(a);
    }
    void setA(final int b){
        if(b < MINIMUM_VALUE){
            throw new IllegalArgumentException("too low");
        }
        a = b;
    }
}
