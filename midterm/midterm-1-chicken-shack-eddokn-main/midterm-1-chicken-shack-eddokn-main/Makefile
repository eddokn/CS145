CLASSPATH = .
TESTCLASSPATH = $(CLASSPATH):Test/:Test/junit4.jar
JFLAGS = -g -cp $(TESTCLASSPATH)
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
	ChickenShack.java


default: classes

classes: $(CLASSES:.java=.class)

run: classes
	java -cp $(CLASSPATH) ChickenShack

clean:
	rm -f *.class Test/*.class

test-build: classes Test/TestRunner.class Test/ChickenShackTest.class

test-less-than-4: test-build
	java -cp $(TESTCLASSPATH) TestRunner ChickenShackTest#testLessThan4

test-base: test-build
	java -cp $(TESTCLASSPATH) TestRunner ChickenShackTest#testBase

test-possible: test-build
	java -cp $(TESTCLASSPATH) TestRunner ChickenShackTest#testPossible

test-impossible: test-build
	java -cp $(TESTCLASSPATH) TestRunner ChickenShackTest#testImpossible

test: test-build
	java -cp $(TESTCLASSPATH) TestRunner ChickenShackTest
