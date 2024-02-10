import statistics as stats

# Data
numArray = [5, 3, 8, 9, 102, 102, 8, 3, 88, 5, 12, 5]

# Determine mode
mode = stats.mode(numArray)

# Prints 5 because there are
# more 5s than any other number
print(mode)


