CLASSPATH =
TESTCLASSPATH = $(CLASSPATH):Test/:Test/junit4.jar
JFLAGS = -g -cp $(TESTCLASSPATH)
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
	JaggedArray.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
	rm *.class Test/*.class

test-build: classes Test/TestJaggedArray.class Test/TestRunner.class

test-create: test-build
	java -cp $(TESTCLASSPATH) TestRunner TestJaggedArray#testCreate

test-add: test-build
	java -cp $(TESTCLASSPATH) TestRunner TestJaggedArray#testAdd

test-remove: test-build
	java -cp $(TESTCLASSPATH) TestRunner TestJaggedArray#testRemove

test-pack: test-build
	java -cp $(TESTCLASSPATH) TestRunner TestJaggedArray#testPack

test-unpack: test-build
	java -cp $(TESTCLASSPATH) TestRunner TestJaggedArray#testUnpack

test-invalid: test-build
	java -cp $(TESTCLASSPATH) TestRunner TestJaggedArray#testInvalid

test: test-build
	java -cp $(TESTCLASSPATH) TestRunner TestJaggedArray
