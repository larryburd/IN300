# Set filepath
dataFile <- file.path("C:\\Users\\laure\\OneDrive\\",
                      "Documents\\Purdue\\IN300 - Programming for Data Analysis",
                      "\\Unit 7\\IN300_Dataset2.txt")

# Parse data
data <- scan(dataFile)

# Print the mean
print(paste("The mean is: ", mean(data)))

# Print the median
print(paste("The median is: ", median(data)))

# Print the standard deviation
print(paste("The sd is: ", sd(data)))

# Print the average deviation
print(paste("The average deviation is: ", sum(abs(data - mean(data))) / length(data)))
