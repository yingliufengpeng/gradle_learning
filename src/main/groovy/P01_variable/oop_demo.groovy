package P01_variable


class BasePerson implements Action{
    String name
    Integer age

    @Override
    void eat() {

    }

    @Override
    void drink() {

    }

    @Override
    void walk() {

    }
}


def person = new BasePerson(name: "w", age: 4)

println(person)

def m = Color.BLUE