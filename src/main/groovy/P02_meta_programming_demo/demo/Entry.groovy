package P02_meta_programming_demo.demo

class Entry {

    static void main(String[] args) {
        println("应用程序正在启动")
        ApplicationManager.init()

        println("应用程序初始化完成...")

        PersonManager.createPerson("w", 24)
    }
}
