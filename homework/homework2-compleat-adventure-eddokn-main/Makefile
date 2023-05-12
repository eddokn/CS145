CLASSPATH =
TESTCLASSPATH = $(CLASSPATH):Tests/:Tests/junit-4.10.jar
JFLAGS = -g -cp $(TESTCLASSPATH)
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
	Player.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
	rm -rf *.class Tests/*.class

test-player-created: classes Tests/TestPlayer.class Tests/TestRunner.class
	java -cp $(TESTCLASSPATH) TestRunner TestPlayer

test-potion: classes Tests/TestPotion.class Tests/TestRunner.class
	java -cp $(TESTCLASSPATH) TestRunner TestPotion

test-weapon: classes Tests/TestWeapon.class Tests/TestRunner.class
	java -cp $(TESTCLASSPATH) TestRunner TestWeapon

test-weapon-subclasses: classes Tests/TestWeaponSubclasses.class Tests/TestRunner.class
	java -cp $(TESTCLASSPATH) TestRunner TestWeaponSubclasses

test-using-weapon: classes Tests/TestUsingWeapon.class Tests/TestRunner.class
	java -cp $(TESTCLASSPATH) TestRunner TestUsingWeapon

test-drinking-elixir: classes Tests/TestDrinkingElixir.class Tests/TestRunner.class
	java -cp $(TESTCLASSPATH) TestRunner TestDrinkingElixir

test-elixir-restores-health: classes Tests/TestElixirRestoresHealth.class Tests/TestRunner.class
	java -cp $(TESTCLASSPATH) TestRunner TestElixirRestoresHealth

test-health-and-manna: classes Tests/TestHealthAndManna.class Tests/TestRunner.class
	java -cp $(TESTCLASSPATH) TestRunner TestHealthAndManna

test: test-player-created test-potion test-weapon test-weapon-subclasses \
	test-using-weapon test-drinking-elixir test-elixir-restores-health \
	test-health-and-manna
