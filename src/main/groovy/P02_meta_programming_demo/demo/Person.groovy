package P02_meta_programming_demo.demo

class Person {
    String name
    Integer age

    // 一个方法找不到的时候,调用时可以用它来做代替
    def invokeMethod(String name, def args) {
        def r = "the method id $name, the params is $args"
        println(r)
        return r
    }

    // methodMissing 新调用,然后是invokeMethod的思路
    def methodMissing(String name, def args) {
        def r = "the method $name is missing"
        println(r)
        return r
    }
}