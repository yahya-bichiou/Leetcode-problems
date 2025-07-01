So to solve this problem we need to use a HashSet since it doesnt allow doubles so we make an if condition to check if the letter we read from the string exist in the Set or no:
If it doesnt exist it adds it to the Set and check the new length if its the max or not.
If it does exist it removes all the letters starting from left side until it reaches the existing letter, then it adds the letter on the right side.
And finally we return the MaxLength.