package P01_variable

import sun.nio.cs.ext.MacHebrew

def list = new ArrayList() // java 的定义的方式

def list2 = [3]

list2 += 4
list2 += 5
list2 += 2



println(list2)

def r = list2.sort {
    a, b ->
        a == b ? 0 : Math.abs(a) < Math.abs(b) ? -1 : 1
}


println(r)

def sortedStringlist = ["abc", 'z', 'helo', 'groovy']

def r2 = sortedStringlist.sort{it.length()}

println(r2)

def r3 = list2.count{it % 2 == 0}

println(r3)


def map = new HashMap()

def map2 = [1: 3, 2: 4, 4: 5, 7: 8]

println(map2)

println(map2[3])

if (map2[4]) {
    println(map2[2])

    map2.kk = 4
    def v = [1: 2, 2: 4]
    map2.v = v
}

println(map2)

def students = [
        1: [name: 4, age: 4],
        2: [name: 4, age: 4],
        3: [name: 4, age: 4],
]

students.each{ stu ->

    println("${stu.key}: ${stu.value}")
}

students.each {k, v ->
    println("$k : $v")
}

def r4 = students.find {it.key < 4}

println(r4)

def r5 = students.find {it.key < 4}

println(r5)

def r6 = students.count {it.key == 4 && it.value.containsKey(4)}
println(r6)