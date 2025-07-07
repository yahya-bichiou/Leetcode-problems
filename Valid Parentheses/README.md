So to solve this I created a hashmap which stores each opening parenthese with the corresponding closing one
then i made an ArrayList named lastBracket that stores the last parenthese opened
if the parenthese opened gets closed it gets removed from the table
if a new parenthese is opened it gets added to the lastBracket array
if a closing parenthese is exists without its opening one it returns false immediately