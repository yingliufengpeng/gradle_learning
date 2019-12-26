package P03_json_demo

import com.google.gson.Gson
import groovy.json.JsonOutput
import groovy.json.JsonParser
import groovy.json.JsonSlurper


def list = [
        new Person(name: "王", age: 44),
        new Person(name: "john2", age: 444),
]

def r = JsonOutput.toJson(list)

println(r)

JsonOutput.prettyPrint(r)

def jsonSlpuer = new JsonSlurper()
//
//def r2 = jsonSlpuer.parse("""[{"age":44,"name":"\\u738b"},{"age":444,"name":"john2"}]""" )
//println(r2)


def josnstr = r

def r2 = jsonSlpuer.parseText(josnstr)

println(r2)
