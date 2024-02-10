# Set File Path
dataFile <- file.path("C:\\Users\\laure\\OneDrive\\Documents\\Purdue",
                      "\\IN300 - Programming for Data Analysis\\",
                      "Unit9\\IN300_Dataset1.csv")

# Read file
data <- read.csv(dataFile)

# Sort the data
printSortedOutput <- function(temp_T) {
  tempSort <- rev(sort(table(temp_T)))
  return(tempSort)
}

# Print Source IP counts
print("Source IP")
print(printSortedOutput(data$Source))

# Print Destination IP counts
print("Destination IP")
print(printSortedOutput(data$Destination))

# Print Protocol counts
print("Protocols")
print(printSortedOutput(data$Protocol))