CLASSPATH =
TESTCLASSPATH = $(CLASSPATH):Test/:Test/junit4.jar
JFLAGS = -g -cp $(TESTCLASSPATH)
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
	Song.java \
	InfinitePlaylist.java \
	SongIterator.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
	rm *.class Test/*.class

test-build: classes Test/TestInfinitePlaylist.class Test/TestRunner.class

test-song: test-build
	java -cp $(TESTCLASSPATH) TestRunner TestInfinitePlaylist#testSong

test-create-playlist: test-build
	java -cp $(TESTCLASSPATH) TestRunner TestInfinitePlaylist#testCreatePlaylist

test-add-song: test-build
	java -cp $(TESTCLASSPATH) TestRunner TestInfinitePlaylist#testAddSong

test-advance: test-build
	java -cp $(TESTCLASSPATH) TestRunner TestInfinitePlaylist#testAdvance

test-multi-add: test-build
	java -cp $(TESTCLASSPATH) TestRunner TestInfinitePlaylist#testMultiAdd

test-iterator-movement: test-build
	java -cp $(TESTCLASSPATH) TestRunner TestInfinitePlaylist#testIteratorMovement

test-reset: test-build
	java -cp $(TESTCLASSPATH) TestRunner TestInfinitePlaylist#testReset

test-remove: test-build
	java -cp $(TESTCLASSPATH) TestRunner TestInfinitePlaylist#testRemove

test-remove-single: test-build
	java -cp $(TESTCLASSPATH) TestRunner TestInfinitePlaylist#testRemoveSingle

test: test-build
	java -cp $(TESTCLASSPATH) TestRunner TestInfinitePlaylist
