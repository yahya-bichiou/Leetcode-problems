So to solve this i created an array of StringBuilders, one for each row
then i used n to keep track of the current row and a boolean dir to switch direction when needed
if we’re at the top or bottom row we flip the direction then for each character in the string, I add it to the current row and move up or down at the end I go through all rows and join them into one string and return it