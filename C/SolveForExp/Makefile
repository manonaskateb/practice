# Manon Lefebvre
# 18 August 2020

# ADT			= Exponentials
EXEBIN		= Exponentials
SOURCES		= $(EXEBIN).c # $(ADT).c
OBJECTS		=  $(EXEBIN).o # $(ADT).o
HEADERS		= #


all: $(EXEBIN)

$(EXEBIN) : $(OBJECTS) $(HEADERS)
	gcc -o $(EXEBIN) $(OBJECTS)

$(OBJECTS) : $(SOURCES) $(HEADERS)
	gcc -g -c $(FLAGS) $(SOURCES)

run : 

clean :
	rm -f $(EXEBIN) $(OBJECTS) 
	
memcheck:
	valgrind --leak-check=full ./$(EXEBIN) 

