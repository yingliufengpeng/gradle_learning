package P05_test_demo

import groovy.transform.stc.ClosureParams
import groovy.transform.stc.SimpleType

class Person {
    String name
    Integer age

    def  show(double n, closure) {
//        closure.delegate = this
        closure(n)
    }

    def fly() {
        println("nnn")
    }

    def walk(int n) {
        println("kkk")

        show(n) { f ->
            fly()
            println(f)
        }
    }
}

def p = new Person(name: "kk", age: 4)

p.walk(4)



def r = (1 .. 20).toList()

def r2 = 34

34.times {4}
