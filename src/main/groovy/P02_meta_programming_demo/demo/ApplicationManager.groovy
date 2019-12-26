package P02_meta_programming_demo.demo

class ApplicationManager {

    static void init() {
        ExpandoMetaClass.enableGlobally()

        // 为第三方添加方法

        Person.metaClass.static.createPerson = {
            String name, Integer age ->
                new Person(name: name, age: age)
        }

    }
}
