# Concordance
Defines a java program called Concordance which will do the following:

Prompt the user for the name of a file.
If the given file exists and is readable, will read the contents of the file and print out a table mapping each word in the file onto:
A list of lines on which the word appears.
The total number of occurrences of that word in the file.
If the given file does not exist, you are to print an error message and gracefully terminate the program.
 

Assumptions:

I assume that the input file does not contain any punctuation symbols.
I also assume that the file has already been normalized (i.e. all of the words are in either all caps or all lowercase).
Output:

The output has the following format:

word1
lines: 1, 2, 3, 10, ...
total: 30
word2
lines: 1, 2, 3, 10, ...
total: 30

So for example, if the user's input file contains the word "foo" on lines 1, 3, and 10, and it appears a total of 4 times in the file, the program write for that entry:

foo
lines: 1, 3, 10
total: 4
