public class MyClass {

    public int value = 0;
    public float divide (float a, float b) {
        if (b == 0) throw new ArithmeticException("Cannot divide by Zero!");
        return a/b;
    }

    /**
     * @param b any Integer value
     * @return returns this.value after adding b with it
     */
    public int myFunc(int b){
        this.value += b;
        return this.value;
    }
}
