package P01_variable


def scriptClouser = {
    println("this $this")           // 代表闭包定义处的类
    println("owner $owner")         // 代表闭包定义处的类或者对象
    println("delegate $delegate")   // 代表任意对象
}

//scriptClouser()


class Person {
    def static classClouser = {
        println("this $this")           // 代表闭包定义处的类
        println("owner" + owner)         // 代表闭包定义处的类或者对象
        println("delegate" + delegate)   // 代表任意对象
    }

    def static say = {
        def classClouser = {
            println("this $this")           // 代表闭包定义处的类
            println("owner" + owner)         // 代表闭包定义处的类或者对象
            println("delegate" + delegate)   // 代表任意对象
        }

        classClouser()
    }

    def show = {
        println("this $this")           // 代表闭包定义处的类
        println("owner" + owner)         // 代表闭包定义处的类或者对象
        println("delegate" + delegate)   // 代表任意对象
    }

    def showclourser = {

        def xx = {
            println("this $this")           // 代表闭包定义处的类
            println("owner" + owner)         // 代表闭包定义处的类或者对象
            println("delegate" + delegate)   // 代表任意对象
        }

        xx()
    }
}

//Person.classClouser()
//
//Person.say()

//new Person().showclourser()


def nestClourser = {

    def innerClourser = {

        println("this $this")           // 代表闭包定义处的类
        println("owner" + owner)         // 代表闭包定义处的类或者对象
        println("delegate" + delegate)   // 代表任意对象
    }

    innerClourser.delegate = Person

    innerClourser()
}

nestClourser()


/**
 * 闭包的委托策略
 */

class Student {
    String name
    def pretty = {"My name is $name"}


    @Override
    String toString() {
        return pretty()
    }
}

class Teacher {
    String name1
}

def stu = new Student(name: "wang")
def teacher = new Teacher(name1: "jia")

println(stu)

stu.pretty.delegate = teacher
stu.pretty.resolveStrategy = Closure.DELEGATE_FIRST

println(stu)

