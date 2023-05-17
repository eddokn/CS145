CLASSPATH =
TESTCLASSPATH = $(CLASSPATH):Test/:Test/junit4.jar
JFLAGS = -g -cp $(TESTCLASSPATH)
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
	Collection.java \
	Node.java \
	Set.java \
	Stack.java \
	Queue.java \
	LimitedQueue.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
	rm *.class Test/*.class

run: classes
	java Collection

test-build: classes Test/CollectionTest.class Test/TestRunner.class

test-queue: test-build
	java -cp $(TESTCLASSPATH) TestRunner CollectionTest#testQueue

test-limited-queue: test-build
	java -cp $(TESTCLASSPATH) TestRunner CollectionTest#testLimitedQueue

test-stack: test-build
	java -cp $(TESTCLASSPATH) TestRunner CollectionTest#testStack

test-set: test-build
	java -cp $(TESTCLASSPATH) TestRunner CollectionTest#testSet

test-set-union: test-build
	java -cp $(TESTCLASSPATH) TestRunner CollectionTest#testSetUnion

test-set-intersect: test-build
	java -cp $(TESTCLASSPATH) TestRunner CollectionTest#testSetIntersect

test: test-build
	java -cp $(TESTCLASSPATH) TestRunner CollectionTest
