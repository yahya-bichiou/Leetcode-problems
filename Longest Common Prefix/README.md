So to search for the longest common prefix you have to create a variable to stock the prefix (res in this example) which will be returned at the end and then browse the table and see if the string contain that word as a prefix
if true then check the next word in the table
if not then remove the last letter from the prefix res and check again
if res is empty or we found the solution (found is equal to the number of words in the table) then it leaves the while loop and return res