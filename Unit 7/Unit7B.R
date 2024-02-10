# Set filepath
dataFile <- file.path("C:\\Users\\laure\\OneDrive\\",
                      "Documents\\Purdue\\IN300 - Programming for Data Analysis",
                      "\\Unit 7\\IN300_Dataset2.txt")

# Parse data
data <- scan(dataFile)

# Create 2 dimensional matrix
my2dmatrix <- matrix(data, nrow=2500, ncol=100)

print(my2dmatrix)

# Create 3 dimensional array
my3dArray <- array(data, dim=c(250, 10, 10))

print(my3dArray)

# Slice 2d matrix
print(my2dmatrix[,2:5])