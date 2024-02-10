# Create ow and column names
rowNames <- c("Row 1", "Row 2", "Row 3")
colNames <- c("Col 1", "Col 2", "Col 3")

# Create a 3x3 matrix with values 1-9
testMatrix <- matrix(c(1:9), nrow = 3, dimnames = list(rowNames, colNames))

# Prints
#        Col 1 Col 2 Col 3
# Row 1      1     4     7
# Row 2      2     5     8
# Row 3      3     6     9
print(testMatrix)