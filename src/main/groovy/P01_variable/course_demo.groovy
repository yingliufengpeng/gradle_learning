package P01_variable


def clouser = { String name ->
    println("ii $name")
}

clouser("xiaohua")
clouser("xiaohua2")

static def fab(int number) {

    int result = 1

    1.upto(number, {
        num ->
            result *= num
    })
    result
}

println(fab(10))

static def fab2(int number) {
    int result = 1
    number.downto(1) {
        num ->
            result *= num
    }
    result
}

println(fab2(10))

static def cal(int number) {
    int result = 1
    number.times {
         result *= (it + 1)
    }
    result
}

println(cal(10))

def str = "3333 2 32"
// find 来查找符合条件的第一个
def r = str.find{
    it == '2'
}

println(r)

str.any{
    it.isNumber()
}

def r2 = str.collect {it }
println(r2)