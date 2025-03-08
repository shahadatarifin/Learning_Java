public class X_10032_2_MethodOverload {

    static void foo (){                                                      // -> parameters
        System.out.println("Good morning");
    }

    static void foo (int a){                                             // -> parameters
        System.out.println("good night");
    }

    static void foo (float a){                                       // -> parameters
        System.out.println("good evening " + a);
    }
    public static void main(String[] args) {
        foo();                                                   // -> arguments
        foo(0);                                              // -> arguments
        foo(0f);                                            // -> arguments
    }
}

// Arguments are actual