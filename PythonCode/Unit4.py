#####################################
#     Set Creation and Addition     #
#####################################
# Author:   Laurence Burden
# Date:     15 May 2021

# Create and populate initial set values
mySet = set({100, 200, 300, 400, 500})

# Print set to user
print(mySet)

# Add new values to the set
mySet.add(150)
mySet.add(250)
mySet.add(350)
mySet.add(400)

# Print the set with new values
# The second 400 was not accepted because sets only hole unique values
print(mySet)

# Remove the specified numbers
mySet.remove(150)
mySet.remove(250)
mySet.remove(350)

# Print set one more time to show values were removed
print(mySet)

