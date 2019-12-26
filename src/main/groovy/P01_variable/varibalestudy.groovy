package P01_variable
int x = 10


println(x.class)

double y = 3.14

println(y.class)

println y.class


z = 3
println(z.class)

def d = 4
println(d.class)

def tripname = """
jsddfjlsafsjlfj
"""

println('*' * 20)

def mm = "$tripname"
mm.println(mm)


static String echo(String message) {
    return message
}

println(echo(mm))

println(tripname.empty)

def str = "the 2 and 3 and 4"

str.each {println(it)}


