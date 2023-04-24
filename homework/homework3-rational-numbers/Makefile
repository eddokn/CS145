CLASSPATH =
TESTCLASSPATH = $(CLASSPATH):Tests/:Tests/junit-4.10.jar
JFLAGS = -g -cp $(TESTCLASSPATH)
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
	Rational.java \
	Harmonic.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
	rm *.class Tests/*.class

test-rational-constructor: classes Tests/TestRationalConstructorAndGetters.class Tests/TestRunner.class
	java -cp $(TESTCLASSPATH) TestRunner TestRationalConstructorAndGetters

test-rational-reduce: classes Tests/TestRationalReduce.class Tests/TestRunner.class
	java -cp $(TESTCLASSPATH) TestRunner TestRationalReduce

test-rational-add: classes Tests/TestRationalAdd.class Tests/TestRunner.class
	java -cp $(TESTCLASSPATH) TestRunner TestRationalAdd

test-harmonic-double: classes Tests/TestHarmonicDouble.class Tests/TestRunner.class
	java -cp $(TESTCLASSPATH) TestRunner TestHarmonicDouble

test-harmonic-rational: classes Tests/TestHarmonicRational.class Tests/TestRunner.class
	java -cp $(TESTCLASSPATH) TestRunner TestHarmonicRational

test: test-rational-constructor test-rational-reduce test-rational-add \
	test-harmonic-double test-harmonic-rational
