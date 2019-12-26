package P01_variable


def x = 1.23

def result

switch (x) {
    case "foo":
        result = "found too"
        break
    case 'bar':
        result = 'bar'
        break
    case [4, 5, 6, 'inilist']:
        result = 'list'
        break
    case 12 .. 30:
        result = 'range'
        break
    case Integer:
        result = 'Integer'
        break
    case BigDecimal:
        result = 'BigDeciaml'
        break
    default:
        result = 'default'
}

println("result is $result")

def sum = 0

for (i in 0 .. 9) {
    sum += i
}

println(sum)

for (item in ['lili': 1, 'luck': 2, 'xiaoming':3]) {
    println(item)
}