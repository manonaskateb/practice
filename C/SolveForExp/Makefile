# Manon Lefebvre
# 18 August 2020

ADT			= Calculations
EXEBIN		= Exponentials
SOURCES		= $(ADT).c $(EXEBIN).c List.c 
OBJECTS		= $(ADT).o $(EXEBIN).o List.o
HEADERS		= $(ADT).h List.h
FILES		= $(SOURCES) $(HEADERS) $(ADT)Test.c README Makefile
CLASS		= cse101-pt.f19
ASSIGNMENT	= pa5
SUBMIT		= submit $(CLASS) $(ASSIGNMENT) $(FILES)
CHECK 		= ls /afs/cats.ucsc.edu/class/$(CLASS)/$(ASSIGNMENT)/malefebv


all: $(EXEBIN)

$(EXEBIN) : $(OBJECTS) $(HEADERS)
	gcc -o $(EXEBIN) $(OBJECTS)

$(OBJECTS) : $(SOURCES) $(HEADERS)
	gcc -g -c $(FLAGS) $(SOURCES)

clean :
	rm -f $(EXEBIN) $(OBJECTS) 
	
memcheck:
	valgrind --leak-check=full ./$(EXEBIN) 
	
check:
	$(CHECK)

submit:
	$(SUBMIT)
