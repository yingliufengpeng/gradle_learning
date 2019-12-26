package P04_file_demo

def file = new File("demo.txt")

//file.eachLine {println(it)}

def reader = file.withReader { reader ->

    def buffer = new char[100]

    reader.read(buffer)

    buffer
}

//println(reader)

def saveObject = {
    object, String path ->


}



