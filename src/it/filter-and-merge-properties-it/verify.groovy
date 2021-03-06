Properties properties = new Properties()
File propertiesFile = new File("${basedir}/target/merged/out.properties")
propertiesFile.withInputStream {
    properties.load(it)
}

assert properties.size() == 3
assert properties.test1 == "value1"
assert properties.test2 == "value2"
assert properties.answer == "42"