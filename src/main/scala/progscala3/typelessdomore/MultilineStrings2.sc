// src/main/scala/progscala3/typelessdomore/MultilineStrings2.sc

def goodbye(name: String) = 
  s"""xxxGoodbye, ${name}yyy
  xxxCome again!yyy""".stripPrefix("xxx").stripSuffix("yyy")

goodbye("Programming Scala")
