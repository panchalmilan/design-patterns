package appendix.optional;


import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        createOptionalObject();
        otherUsefulMethods();
    }

    public static void createOptionalObject() {
         /*
            How to create Optional object?
            * Using of, empty, ofNullable methods
        */

        // empty
        final Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional); // "Optional.empty"

        /*
            of
            - if passed object is null, then it throws NullPointerException
            - otherwise, it returns Optional Object
        */
        String email = "john@gmail.com";
        final Optional<String> emailOptional = Optional.of(email);
        System.out.println(emailOptional); // "Optional[john@gmail.com]"

        //final Optional<String> emailOptional2 = Optional.of(null);
        /*
        Exception in thread "main" java.lang.NullPointerException
            at java.base/java.util.Objects.requireNonNull(Objects.java:208)
            at java.base/java.util.Optional.of(Optional.java:113)
            at appendix.optional.OptionalDemo.main(OptionalDemo.java:26)
         */

        /*
            ofNullable
            - if passed object is null, then it returns empty Optional object
            - otherwise, it returns Optional object
         */
        final Optional<String> emailOptional2 = Optional.ofNullable(email);
        System.out.println(emailOptional);                      // "Optional[john@gmail.com]"
        System.out.println(Optional.ofNullable(null));    // "Optional.empty"
    }

    public static void otherUsefulMethods() {
        // get
        // - if value is present, it will return the value
        // - otherwise it will throw NoSuchElement exception
        // Example 1:
        final Optional<String> optString = Optional.ofNullable("abc@gmail.com");
        System.out.println(optString);       // Optional[abc@gmail.com]
        System.out.println(optString.get()); // abc@gmail.com
        // Example 2:
        final Optional<String> optString2 = Optional.ofNullable(null);
        System.out.println(optString2);        // Optional.empty
//        System.out.println(optString2.get());  // Exception in thread "main" java.util.NoSuchElementException: No value present
                                                    //        at java.base/java.util.Optional.get(Optional.java:143)
                                                    //        at appendix.optional.OptionalDemo.otherMethods(OptionalDemo.java:61)
                                                    //        at appendix.optional.OptionalDemo.main(OptionalDemo.java:8)



        // isPresent()
        // returns boolean, if value is present inside Optional object, it returns true
        // otherwise it returns false
        System.out.println(Optional.ofNullable("milan").isPresent()); // true
        System.out.println(Optional.ofNullable(null).isPresent());    // false



        // orElse - How to get default value from Optional object
        // Example 1:
        Optional<String> str = Optional.ofNullable("milan");
        String strWithDef = str.orElse("default");
        System.out.println(strWithDef); // milan
        // Example 2:
        str = Optional.ofNullable(null);
        strWithDef = str.orElse("default");
        System.out.println(strWithDef); // default


        // orElseGet - it takes Supplier Functional interface as parameter
        //           - here we are using lambda fn to return string
        // Example 1:
        str = Optional.ofNullable("milan@gmail.com");
        strWithDef = str.orElseGet(() -> "john@gmail.com");
        System.out.println(strWithDef); // milan@gmail.com
        // Example 2:
        str = Optional.ofNullable(null);
        strWithDef = str.orElseGet(() -> "john@gmail.com");
        System.out.println(strWithDef); // john@gmail.com



        // orElseGet - it takes Supplier Functional interface as parameter
        //           - here we are using lambda fn to throw exception
        // Example 1:
        str = Optional.ofNullable("milan@gmail.com");
        strWithDef = str.orElseThrow(() -> new IllegalArgumentException("Email does not exists!"));
        System.out.println(strWithDef); // milan@gmail.com
        // Example 2:
        str = Optional.ofNullable(null);
//        strWithDef = str.orElseThrow(() -> new IllegalArgumentException("Email does not exists!"));
        //System.out.println(strWithDef); // Exception in thread "main" java.lang.IllegalArgumentException: Email does not exists!
                                            //        at appendix.optional.OptionalDemo.lambda$otherMethods$3(OptionalDemo.java:103)
                                            //        at java.base/java.util.Optional.orElseThrow(Optional.java:403)
                                            //        at appendix.optional.OptionalDemo.otherMethods(OptionalDemo.java:103)
                                            //        at appendix.optional.OptionalDemo.main(OptionalDemo.java:8)



        // ifPresent - if Optional object has value, it will call the passed Consumer FunctionlInterface (here lambda fn)
        // Example 1:
        Optional<String> gender = Optional.of("MALE");
        gender.ifPresent(s -> System.out.println("value of gender is present: " + s)); // value of gender is present: MALE
        // Example 2:
        gender = Optional.empty();
        gender.ifPresent(s -> System.out.println("value of gender is present: " + s)); //



        // filter - parameter takes Predicate FunctionalInterface
        // BEFORE using filter
        String result = "abc";
        if(result != null && result.contains("abc")) {
            System.out.println(result); // abc
        }
        // AFTER:
        Optional<String> optionalResult = Optional.of(result);
        optionalResult.filter((res) -> res.contains("abc"))
                .ifPresent((res2) -> System.out.println(res2)); // abc



        // map - provides a way to transform value in Optional from one type to another
        // Problem: convert "String result = " abc  ";" to without space i.e "abc"
        result = " abc  ";
        Optional<String> optionalResult2 = Optional.of(result);
        optionalResult2.filter((res) -> res.contains("abc"))
                .map(res2 -> res2.trim())
                .ifPresent((res2) -> System.out.println(res2)); // "abc"
    }
}
