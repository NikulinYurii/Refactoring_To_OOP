package function;

public abstract class Function<T> {

    T a;
    T b;

    public Function(T a, T b) {
        this.a = a;
        this.b = b;
    }

    public abstract T action_0();

    public abstract T action_1();

    public abstract T action_2();

    public abstract T action_3();

}