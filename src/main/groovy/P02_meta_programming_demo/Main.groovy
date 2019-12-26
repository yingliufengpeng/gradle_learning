package P02_meta_programming_demo

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

def person = new Person(name: "44", age: 4)
person.cry()

Person.metaClass.sex = 'male'

//println(person.sex)

// 为类添加动态的方法

Person.metaClass.sexUpperCase = {
    ->
    println('---')
    Person.metaClass.sex = sex.toUpperCase()
}

def person2 = new Person(name: "44", age: 4)

person2.sexUpperCase()
println(person2.sex)

Person.metaClass.static.createPerson = {
    String name, Integer age -> new Person(name: name, age: age)
}


def p = Person.createPerson("44", 4)

println(p)