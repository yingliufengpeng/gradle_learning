package P2_meta_programming_demo.demo

class PersonManager {

    def static createPerson = {
        String name, Integer age ->
                new Person(name: name, age: age)
    }
}
