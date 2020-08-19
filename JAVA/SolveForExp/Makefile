# Manon Lefebvre
# 18 Aug 2020

JAVASRC = Exponentials.java
SOURCES = README Makefile $(JAVASRC)
MAINCLASS = Exponentials
CLASSES = Exponentials.class
JARFILE = Exponentials

all: $(JARFILE)

$(JARFILE): $(CLASSES)
	echo Main-class: $(MAINCLASS) > Manifest
	jar cvfm $(JARFILE) Manifest $(CLASSES)
	rm Manifest
	chmod +x $(JARFILE)

$(CLASSES): $(JAVASRC)
	javac -Xlint $(JAVASRC)

clean:
	rm $(CLASSES) $(JARFILE)