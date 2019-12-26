package P01_variable

trait DefaultAction implements Action  {
    abstract void eat()
    void play() {
        println("I can paly")
    }

}